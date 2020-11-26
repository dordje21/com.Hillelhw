package com.hillel.homeworks.hw24;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionFactory.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM city";
            ResultSet rs = st.executeQuery(sql);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
