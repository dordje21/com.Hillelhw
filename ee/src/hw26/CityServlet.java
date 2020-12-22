package hw26;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/city")
public class CityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder stringBuilder = new StringBuilder();

        try {
            Connection con = ConnectionFactory.connection();
            Statement st = con.createStatement();
            String idParam = req.getParameter("id");

            if (idParam != null) {
                int idDelete = Integer.parseInt(idParam);
                st.executeUpdate("DELETE FROM CITY where ID =" + idDelete);
                stringBuilder.append(idDelete + " = element deleted " + "<br>");
            } else {
                ResultSet rst = st.executeQuery("SELECT * FROM CITY");
                while (rst.next()) {
                    int id = rst.getInt(1);
                    String name = rst.getString(2);
                    stringBuilder.append(id + ". " + name + "<br>");
                }
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String s = stringBuilder.toString();
        resp.getWriter().write("<html>\n" +
                "<head>\n" +
                "    <meta charset='UTF-8'>\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div style='width: 50%; float: left;'>" + s + "<br>" + "</div>\n" +
                "</body>\n" +
                "</html>");
    }
}