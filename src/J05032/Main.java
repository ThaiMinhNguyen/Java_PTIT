/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05032;

/**
 *
 * @author admin
 */
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = t;
        ArrayList<Nguoi> a = new ArrayList<>();
        while(t-->0){
            a.add(new Nguoi(sc.next(), sc.next()));
        }
        Collections.sort(a);
        System.out.println(a.get(n-1));
        System.out.println(a.get(0));
    }
}
