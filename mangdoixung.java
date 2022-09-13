/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class mangdoixung {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean check = true;
            for(int i = 0; i < n;i++){
                a[i]= sc.nextInt();
            }
            for(int i = 0; i < n;i++){
                if(a[i] != a[n-i-1]){
                    check = false;
                    break;
                }
                
            }
            System.out.println(check ? "YES" : "NO");
        }
