/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.Scanner;

/**
 * This program is built to get random numbers in ranges
 * @author Emerald Liu
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        System.out.print("how many questions in total: ");
        int total=console.nextInt();
        System.out.print("how much do you want in the test: ");
        int inTest=console.nextInt();
        
        if(total<inTest||total<=0||inTest<=0)
        throw new IllegalArgumentException("mistaked input. total:"+total+" inTest:"+inTest);
        
        String myStr="";        
        for(int k=1;k<=inTest;k++){
            int a=(int)(Math.random()*total+1);
            String A=""+a;
            if(!myStr.contains(A))
                myStr=myStr+a+",";
            else
                k--;}
             System.out.println("\n\n"+myStr+"\n");
    }
    
}
