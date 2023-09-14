/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05081;

/**
 *
 * @author admin
 */
public class Hang implements Comparable<Hang> {
    private
            int ma;
            String ten;
            String donvi;
            long giamua;
            long giaban;
            long loinhuan;

    public Hang(int ma, String ten, String donvi, long giamua, long giaban) {
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban - giamua;
    }

    public long getLoinhuan() {
        return loinhuan;
    }

    public int getMa() {
        return ma;
    }
    

    @Override
    public String toString() {
        return "MH" + String.format("%03d", ma) + " " + ten + " " + donvi + " " + giamua + " " + giaban + " " + loinhuan;
    }
    
    @Override
    public int compareTo(Hang a) {
        if(loinhuan != a.getLoinhuan()){
            return Long.compare(a.getLoinhuan(), loinhuan);
        }
        return Integer.compare(ma, a.getMa());
    }
}
