package com.hillel.homeworks.hw24;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = ConnectionFactory.getConnection();

        try {
            Statement st = con.createStatement();

//          Выбрать всех работников с нечетными Id
            ResultSet resultSet = st.executeQuery("SELECT * FROM EMPLOYEES WHERE MOD (num, 2) = 1 ORDER BY EMPLOYEE_ID ASC;");

//          Получить список всех работников с именем 'David'
            ResultSet resultSet1 = st.executeQuery("SELECT * FROM EMPLOYEES WHERE LAST_NAME = 'David' ");

//          Получить список всех работников у которых зарплата находится в промежутке от 2000 до 4000 (включительно)
            ResultSet resultSet2 = st.executeQuery("SELECT * FROM EMPLOYEES WHERE SALARY BETWEEN 2000 AND 4000");
//
//          Получить список всех работников из 54го отдела с зарплатой, большей 5000
            ResultSet resultSet3 = st.executeQuery("SELECT * FROM employees  WHERE department_id = 54 AND salary > 5000;");

//          Получить список всех работников у которых последняя буква в имени 'd'
            ResultSet resultSet4 = st.executeQuery("SELECT * FROM employees WHERE first_name LIKE d");

//          Показать всех менеджеров которые имеют в подчинении больше 6ти работников
            ResultSet resultSet5 = st.executeQuery("SELECT man.first_name, COUNT (*) FROM employees emp JOIN employees man ON (emp.manager_id = man.employee_id) GROUP BY man.first_name HAVING COUNT (*) > 6;");

//          Получить список работников у которых менеджер получает зарплату больше 10000
            ResultSet resultSet6 = st.executeQuery("SELECT * FROM employees WHERE manager_id IN (SELECT employee_id FROM employees WHERE salary > 10000)");

//          Получить список работников которые живут в Europe (region_name)
            ResultSet resultSet7 = st.executeQuery("SELECT first_name FROM employees JOIN departments USING (department_id) JOIN locations USING (location_id) JOIN countries USING (country_id) JOIN regions USING (region_id) WHERE region_name = 'Europe';");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
