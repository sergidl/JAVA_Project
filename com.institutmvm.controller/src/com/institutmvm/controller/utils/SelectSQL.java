package com.institutmvm.controller.utils;

import java.sql.*;

public class SelectSQL {
    
    /** 
     * Mostra la quantitat d'especies avirades
     * 
     * @param table
     * @param stmt
     * @return String
     */
    public static String SelectCount(String table, Statement stmt) {
        System.out.println("Select Count");
        String sql = "SELECT especie, COUNT(*) FROM " + table+ " GROUP BY especie";
        String count = "";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                count += "Especie: " + rs.getString(1) + " = " + rs.getString(2)+"\n";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
    
    /** 
     * Mostra la mitjana de profunditat de les especies
     * 
     * @param table
     * @param stmt
     * @return String
     */
    public static String AverageDeepth(String table, Statement stmt) {
        System.out.println("Average Deepth");
        String sql = "SELECT especie, AVG(profunditat) FROM "+ table +" GROUP BY especie;";
        String average = "";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                average += "Promedio de profundidad: " + rs.getString(1)+" = " + rs.getString(2)+"\n";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return average;
    }

    
    /** 
     * Mostra la mida maxima de les especies
     * 
     * @param table
     * @param stmt
     * @return String
     */
    public static String SelectMax(String table, Statement stmt) {
        System.out.println("Select Max");
        String sql = "SELECT especie, MAX(tamany) FROM " + table+ " GROUP BY especie";
        String max = "";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                max += "Especie: " + rs.getString(1) + " = " + rs.getString(2)+"\n";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return max;
    }
    
    /** 
     * Mostra la mida minima de les especies
     * 
     * @param table
     * @param stmt
     * @return String
     */
    public static String SelectMin(String table, Statement stmt) {
        System.out.println("Select Min");
        String sql = "SELECT especie, MIN(tamany) FROM " + table+ " GROUP BY especie";
        String min = "";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                min += "Especie: " + rs.getString(1) + " = " + rs.getString(2)+"\n";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return min;
    }

}
