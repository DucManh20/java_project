/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import database.JDBCUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import model.Students;

/**
 *
 * @author Dell
 */
public class StudentsDAO implements InterfaceDAO {

    static Scanner sc = new Scanner(System.in);
    static List<Students> StudentsList = new ArrayList<>();

    public static StudentsDAO getInstance() {
        return new StudentsDAO();
    }

    public static void getList() {
        Connection con = null;
        try {
            //Tao ket noi
            con = JDBCUtil.getConnection();
            //Tao doi tuong statement
            Statement st = con.createStatement();

            //Thuc hien cau lenh
            String sql = "select * from student";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Students st1 = new Students();
                st1.setId(rs.getString("id"));
                st1.setName(rs.getString("name"));
                st1.setSex(rs.getString("sex"));
                st1.setAddress(rs.getString("address"));
                st1.setGmail(rs.getString("gmail"));
                st1.setScores(rs.getFloat("scores"));
                StudentsList.add(st1);
            }
            for (Students students : StudentsList) {
                System.out.println(students);
            }
            //Ngat ket noi
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Insert() {
        Connection con = null;
        try {
            // Tao ket noi
            con = JDBCUtil.getConnection();
            // Tao doi tuong
            Statement statement = con.createStatement();
            // Thuc thi cau lenh
            Students st = new Students();
            st.input();
            String sql = "Insert into student(id, name, sex, address, gmail, scores) values('" + st.getId() + "', '" + st.getName() + "', '" + st.getSex() + "', '"
                    + st.getAddress() + "', '" + st.getGmail() + "', " + st.getScores() + ")";

            statement.execute(sql);
            System.out.println("Insert success!");
            // Ngat ket noi
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void Update() {
        Students st = new Students();
        getList();
        if (StudentsList.isEmpty()) {
            System.out.println("Student list is empty!");
        } else {
            int index = -1;
            System.out.println("Enter id : ");
            String id1 = sc.nextLine();
            for (Students students : StudentsList) {
                if (students.getId().equals(id1)) {
                    st = students;
                    index = 0;
                }
            }
            if (index == -1) {
                System.out.println("id not found!");
            } else {
                Connection con = null;
                try {
                    // Tao ket noi
                    con = JDBCUtil.getConnection();
                    // Tao doi tuong
                    Statement statement = con.createStatement();
                    // Thuc thi cau lenh
                    st.input1();
                    String sql = "update student set name = '" + st.getName() + "', sex = '" + st.getSex() + "', address = '"
                            + st.getAddress() + "', gmail =  '" + st.getGmail() + "', scores = " + st.getScores() + " where id = '" + st.getId() + "'";
                    System.out.println(sql);
                    statement.execute(sql);
                    System.out.println("Update success!");
                    // Ngat ket noi
                    JDBCUtil.closeConnection(con);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void Remove() {
        Students st = new Students();
        getList();
        if (StudentsList.isEmpty()) {
            System.out.println("Student list is empty!");
        } else {
            int index = -1;
            System.out.println("Enter id : ");
            String id1 = sc.nextLine();
            for (Students students : StudentsList) {
                if (students.getId().equals(id1)) {
                    st = students;
                    index = 0;
                }
            }
            if (index == -1) {
                System.out.println("id not found!");
            } else {
                Connection con = null;
                try {
                    // Tao ket noi
                    con = JDBCUtil.getConnection();
                    // Tao doi tuong
                    Statement statement = con.createStatement();
                    // Thuc thi cau lenh
                    st.input1();
                    String sql = "delete from student where id = '" + st.getId() + "'";
                    System.out.println(sql);
                    statement.execute(sql);
                    System.out.println("Remove success!");
                    // Ngat ket noi
                    JDBCUtil.closeConnection(con);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void Display() {
        Connection con = null;
        try {
            // Tao ket noi
            con = JDBCUtil.getConnection();
            // Tao doi tuong
            Statement statement = con.createStatement();
            // Thuc thi cau lenh
            String sql = "select * from student";

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                System.out.println("----------------------------------------------------------------");
                System.out.println("| " + rs.getString("id") + " | " + rs.getString("name") + " | " + rs.getString("sex")
                        + " | " + rs.getString("address") + " | " + rs.getString("gmail") + " | " + rs.getString("scores") + "|");
            }
            System.out.println("------------------------------------------------------------------");
            // Ngat ket noi
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Search() {
        Students st = new Students();
        getList();
        if (StudentsList.isEmpty()) {
            System.out.println("Student list is empty!");
        } else {
            int index = -1;
            System.out.println("Enter id : ");
            String id1 = sc.nextLine();
            for (Students students : StudentsList) {
                if (students.getId().equals(id1)) {
                    st = students;
                    index = 0;
                }
            }
            if (index == -1) {
                System.out.println("id not found!");
            } else {
                Connection con = null;
                try {
                    // Tao ket noi
                    con = JDBCUtil.getConnection();
                    // Tao doi tuong
                    Statement statement = con.createStatement();
                    // Thuc thi cau lenh
                    st.input1();
                    String sql = "select from student where name = '" + st.getName() + "'";
                    System.out.println(sql);
                    statement.execute(sql);
                    System.out.println("Update success!");
                    // Ngat ket noi
                    JDBCUtil.closeConnection(con);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void Sort() {
        getList();
        Collections.sort(StudentsList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return (int) (o1.getScores() - o2.getScores());
            }
        });
        System.out.println("Sort students list by sorces!");
        for (Students students : StudentsList) {
            System.out.println(students);
        }
        
    }

}
