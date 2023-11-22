/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05018;

/**
 *
 * @author admin
 */
public class HocSinh implements Comparable<HocSinh> {
    private String ma;
    private String ten;
    private double dtb;
    private String status;
    static int cnt = 1;

    public HocSinh(String ten, String s) {
        this.ma = String.format("HS%02d", cnt++);
        this.ten = ten;
        double sum = 0;
        String [] d = s.split("\\s++");
        for(int i = 0; i < 10; i++){
            double diem = Double.parseDouble(d[i]);
            if(i == 0|| i == 1){
                sum += diem*2;
            }else{
                sum += diem;
            }
        }
        sum /= 12;
        this.dtb = Math.round(sum*10.0)/10.0;
        if(dtb >= 9){
            status = "XUAT SAC";
        } else if (dtb >= 8){
            status = "GIOI";
        } else if (dtb >= 7){
            status = "KHA";
        } else if (dtb >= 5){
            status = "TB";
        } else {
            status = "YEU";
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.1f", dtb) + " " + status;
    }

    @Override
    public int compareTo(HocSinh o) {
        if(o.dtb != dtb) return -Double.compare(dtb, o.dtb);
        return ma.compareTo(o.ma);
    }
    
    
}
