/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Students {
    private String id;
    private String name;
    private String sex;
    private String address;
    private String gmail;
    private float scores;

    public Students() {
    }

    public void input(){
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id :");
        this.setId(sc.nextLine());
        System.out.println("Enter name :");
        this.setName(sc.nextLine());
        System.out.println("Enter sex :");
        this.setSex(sc.nextLine());
        System.out.println("Enter address :");
        this.setAddress(sc.nextLine());
        System.out.println("Enter gmail :");
        this.setGmail(sc.nextLine());
        System.out.println("Enter scores :");
        this.setScores(Float.parseFloat(sc.nextLine()));
        }catch(Exception e){
            System.out.println("Enter incorrect information!");
        }
    }

     public void input1(){
        try{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name :");
        this.setName(sc.nextLine());
        System.out.println("Enter sex :");
        this.setSex(sc.nextLine());
        System.out.println("Enter address :");
        this.setAddress(sc.nextLine());
        System.out.println("Enter gmail :");
        this.setGmail(sc.nextLine());
        System.out.println("Enter scores :");
        this.setScores(Float.parseFloat(sc.nextLine()));
        }catch(Exception e){
            System.out.println("Enter incorrect information!");
        }
    }
    @Override
    public String toString() {
        return "Students{" + "id=" + id + ", name=" + name + ", sex=" + sex + ", address=" + address + ", gmail=" + gmail + ", scores=" + scores + '}';
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public float getScores() {
        return scores;
    }

    public void setScores(float scores) {
        this.scores = scores;
    }
    
    
}
