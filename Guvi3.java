/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Guvi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner sc=new Scanner(System.in);
        int[] a=new int[8];
        System.out.println("enter 4 points as SQUARE coordinates");
        for(int i=0;i<8;i++)
            a[i]=sc.nextInt();
        if(a[0]==a[2]&&a[4]==a[6]&&a[1]==a[7]&&a[3]==a[5])
                    System.out.println("this  can form square");
        else
System.out.println("not an square making points");
    }
}
