/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViDu;

/**
 *
 * @author admin
 */
public class Person {

  // các thuộc tính
  private String name;
  private int age;
  public String gender;


  // hàm khởi tạo không có tham số
  public Person() {
  }

  // hàm khởi tạo có tham số
  public Person(String name) {
    this.name = name;
  }
   
  // method (phương thức)
  public void GioiThieu() {
    System.out.println("I am " + name);
  }
  
}

