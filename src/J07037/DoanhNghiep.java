/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07037;

/**
 *
 * @author admin
 */
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ma;
    private String ten;
    private int sosv;

    public DoanhNghiep(String ma, String ten, int sosv) {
        this.ma = ma;
        this.ten = ten;
        this.sosv = sosv;
    }

    public String getMa() {
        return ma;
    }
    

    @Override
    public int compareTo(DoanhNghiep o) {
        return ma.compareTo(o.getMa());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sosv;
    }
    
}
