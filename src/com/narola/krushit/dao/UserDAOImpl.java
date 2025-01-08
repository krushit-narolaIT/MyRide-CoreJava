package com.narola.krushit.dao;

import com.narola.krushit.entity.User;
import com.narola.krushit.utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImpl implements IUserDAO {

    private final String INSERT_USER_DATA = "INSERT INTO users (id , user_pass, user_first_name, user_last_name, user_email, user_phone) VALUES (?, ?, ?, ?, ?, ?)";
    private final String GET_CURRENT_ID_TRACKER = "SELECT last_user_id FROM user_id_tracker";
    private final String UPDATE_CURRENT_ID_TRACKER = "UPDATE user_id_tracker SET last_user_id = last_user_id + 1";

    @Override
    public boolean registerUser(User user) {

        int lastUserId = -1;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt1 = conn.prepareStatement(GET_CURRENT_ID_TRACKER);
             PreparedStatement stmt2 = conn.prepareStatement(UPDATE_CURRENT_ID_TRACKER);
             PreparedStatement stmt3 = conn.prepareStatement(INSERT_USER_DATA)) {

            try (ResultSet rs = stmt1.executeQuery()) {
                if (rs.next()) {
                    lastUserId = rs.getInt("last_user_id");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            stmt2.executeUpdate();

            stmt3.setInt(1, lastUserId);
            stmt3.setString(2, user.getPass());
            stmt3.setString(3, user.getUserFirstName());
            stmt3.setString(4, user.getUserLastName());
            stmt3.setString(5, user.getUserEmail());
            stmt3.setString(6, user.getUserPhone());

            int res = stmt3.executeUpdate();

            if(res == 1){

                return true;
            } else {
                System.out.println("Oops..! Some error occur...!!");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
