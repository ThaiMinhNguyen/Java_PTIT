/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1.Bai14;

/**
 *
 * @author admin
 */
public class DeTai {
    private String ma;
    private String tenGv;
    private String tenDetai;
    static int cnt = 1;

    public DeTai(String tenGv, String tenDetai) {
        this.ma = String.format("DT%03d", cnt++);
        this.tenGv = tenGv;
        this.tenDetai = tenDetai;
    }

    public String getMa() {
        return ma;
    }

    public String getTenDetai() {
        return tenDetai;
    }

    @Override
    public String toString() {
        return tenGv + " " + tenDetai;
    }
    
}
