/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH3;

/**
 *
 * @author admin
 */
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> chan = new ArrayList<>();
            ArrayList<Integer> le = new ArrayList<>();
            for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                if(a % 2 == 0 && !chan.contains(a)){
                    chan.add(a);
                } else if (a % 2 != 0 && !le.contains(a)) {
                    le.add(a);
                }
            }
            Collections.sort(chan);
            Collections.sort(le, Collections.reverseOrder());
            for(Integer i : chan){
                System.out.print(i + " ");
            }
            System.out.println();
            for(Integer i : le){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
//1
//7
//3 7 12 8 5 4 888