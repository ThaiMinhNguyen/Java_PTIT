/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package J05033;

/**
 *
 * @author admin
 */
 public class Time implements Comparable<Time> {
    private
            int gio;
            int phut;
            int giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }


    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay;
    }
    
    
    @Override
    public int compareTo(Time a) {
        if(this.gio != a.getGio()) {
            return this.gio - a.getGio();
        } else if (this.phut != a.getPhut()) {
            return Integer.compare(this.phut, a.getPhut());
        }
        return Integer.compare(this.giay, a.getGiay());
    }
}
