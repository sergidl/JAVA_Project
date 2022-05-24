package com.institutmvm.controller.utils;

import java.sql.*;

public class SelectSQL {
    //method SelectCount
    public static String SelectCount(String table, Statement stmt) {
        String sql = "SELECT especie, COUNT(*) FROM " + table+ " GROUP BY especie";
        String count = "";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                count = rs.getString("Especie: " + rs.getString(1) + "= " + rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

}
