/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1.Bai10;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien> {
    private String ten;
    private int sobai;
    private int submit;

    public SinhVien(String ten, String a) {
        this.ten = ten;
        String[] l = a.split("\\s+");
        this.sobai = Integer.parseInt(l[0]);
        this.submit = Integer.parseInt(l[1]);
    }

    public String getTen() {
        return ten;
    }

    public int getSobai() {
        return sobai;
    }

    public int getSubmit() {
        return submit;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(sobai != o.getSobai()){
            return -(sobai - o.getSobai());
        } else if(submit != o.getSubmit()){
            return submit - o.getSubmit();
        } else {
            return ten.compareTo(o.getTen());
        }
    }
    
   
    @Override
    public String toString() {
        return ten + " " + sobai + " " + submit;
    }
    
    
    
}
