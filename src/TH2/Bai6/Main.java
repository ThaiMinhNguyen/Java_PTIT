/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2.Bai6;

/**
 *
 * @author admin
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       ArrayList<User> s = new ArrayList<>();
       while(t-->0){
           User a = new User(sc.next(), sc.next());
           s.add(a);
       }
       int n = sc.nextInt();
       while(n-->0){
           String ten = sc.next();
           String mk = sc.next();
           for(User i : s){
               if(ten.equals(i.getTen()) && mk.equals(i.getMatkhau())){
                   i.setSolan(i.getSolan()+1);
               }
           }
       }
       for(User i : s){
           System.out.print(i.getSolan() + " ");
       }
    }
}
//4
//tendangnhap matkhau
//username password
//nguoidung m4tkh4un4yr4tb40m4t
//user2 password
//6
//tendangnhap matkhau
//username matkhau
//bfc34 contest
//username password
//tendangnhap matkhau
//user2 password