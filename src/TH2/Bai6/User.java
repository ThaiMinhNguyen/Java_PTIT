/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2.Bai6;

/**
 *
 * @author admin
 */
public class User {
    private String ten;
    private String matkhau;
    private int solan;

    public User(String ten, String matkhau) {
        this.ten = ten;
        this.matkhau = matkhau;
    }

    public String getTen() {
        return ten;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public int getSolan() {
        return solan;
    }

    public void setSolan(int solan) {
        this.solan = solan;
    }
}
