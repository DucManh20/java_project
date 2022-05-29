/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import DAO.StudentsDAO;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("1. Add student");
        System.out.println("2. Update info student by id");
        System.out.println("3. Delete student by id");
        System.out.println("4. Show list of students");
        System.out.println("5. Sort list of students by scores");
        System.out.println("6. Search student by id");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) {
        int choose = -1;
        while (choose != 7) {
            menu();
            System.out.println("Enter choose : ");
            try {
                choose = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Enter again");
            }

            switch (choose) {
                case 1:
                    StudentsDAO.getInstance().Insert();
                    break;
                case 2:
                    StudentsDAO.getInstance().Update();
                    break;
                case 3:
                    StudentsDAO.getInstance().Remove();
                    break;
                case 4:
                    StudentsDAO.getInstance().Display();
                    break;
                case 5:
                    StudentsDAO.getInstance().Sort();
                    break;
                case 6:
                    StudentsDAO.getInstance().Search();
                    break;
                case 7:
                    System.out.println("Exit!");
                    break;
            }
        }
    }
}
