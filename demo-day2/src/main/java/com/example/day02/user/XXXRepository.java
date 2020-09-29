package com.example.day02.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class XXXRepository {

    void xx() {
        try (
                Connection conn = DriverManager.getConnection("");
                PreparedStatement prepStmt = conn.prepareStatement("");
                ResultSet rs = prepStmt.executeQuery();
        ) {

            while (rs.next()) {

            }
        } catch (Exception e) {

        }
    }

}
