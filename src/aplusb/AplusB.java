/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplusb;

import java.util.Scanner;

/**
 *
 * @author Jin
 */
public class AplusB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System. in);
        
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a+b;
            System.out.println(c);
    }
    }
}
