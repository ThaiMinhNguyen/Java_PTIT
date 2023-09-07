/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package J05033;

import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Time> a = new ArrayList<>();
        while(t-->0) {
            Time s = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            a.add(s);
        }
        Collections.sort(a);
        for(Time i : a) {
            System.out.println(i.toString());
        }
    }
}
