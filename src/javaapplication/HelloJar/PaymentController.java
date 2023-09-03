/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.HelloJar;

/**
 *
 * @author admin
 */
import java.util.*;
import vn.edu.ptit.*;



public class PaymentController {
    private Invoice invoice;
    private Rule rule;
    private Student student;
    private Subject subject;
    public  PaymentController(){
        Scanner sc = new Scanner(System.in);
        String msv = sc.nextLine();
        String ten = sc.nextLine();
        int so_mon = Integer.parseInt(sc.nextLine());
        String ma_mon_hoc;
        String ten_mon_hoc;
        int sotinchi;
        student = new Student(msv, ten);
        ArrayList<Subject> subject = new ArrayList<Subject>();
        while(so_mon --> 0){
            ma_mon_hoc = sc.nextLine();
            ten_mon_hoc = sc.nextLine();
            sotinchi = Integer.parseInt(sc.nextLine());
            subject.add(new Subject(ma_mon_hoc, ten_mon_hoc, sotinchi));
        }
        String soQd = sc.nextLine();
        String tenQd = sc.nextLine();
        int hocphi = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for(Subject i : subject){
            sum += hocphi*i.getCredit();
        }
        rule = new Rule(soQd, tenQd, hocphi);
        invoice = new Invoice(rule);
        invoice.setAlSubject(subject);
        invoice.setAmount(sum);
        invoice.setSt(student);
    }
    public Invoice getInvoice(){
        return invoice;
    }
}   
