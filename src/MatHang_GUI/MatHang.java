/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatHang_GUI;

/**
 *
 * @author admin
 */
public class MatHang {
    private int ma;
    private String ten, nhom;
    private double gia;

    public MatHang(int ma, String ten, String nhom, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.gia = gia;
    }
    
    public Object[] toObject(){
        return new Object[]{ma, ten, nhom, gia};
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + nhom + " " + gia;
    }
    
    
}
