package hw26;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/country")
public class CountryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder stringBuilder = new StringBuilder();

        try {
            Connection con = ConnectionFactory.connection();
            Statement st = con.createStatement();
            ResultSet rst = st.executeQuery("SELECT * FROM COUNTRY");
            while (rst.next()) {
                String name = rst.getString(2);
                stringBuilder.append(name + "\n");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//        File file = new File("countries.csv");
//        BufferedWriter writer = null;
//        try {
//            writer = new BufferedWriter(new FileWriter(file));
//            writer.write(stringBuilder.toString());
//        } finally {
//            if (writer != null) writer.close();
//        }
        String ss = stringBuilder.toString();
        resp.setContentType("text/csv");
        PrintWriter out = resp.getWriter();
        out.println(ss);
        out.close();
    }
}