/*
 * 
 * @author Emerald Liu
 * 
 * Description: American Computer Science League
 *              Program #1: Numbers
 * 
 * I certify that this program is my own work and was not copied and/or modified from another student, website, or source.
 * 
 * 
 */
package program_acsl_arraynumbersexample;
import java.util.*;

/**
 *
 * @author Emerald Liu
 */
public class Program_ACSL_ArrayNumbersExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner console=new Scanner(System.in);
        
        System.out.println("Enter number (less than 18 digits)");
        String numberString=console.nextLine();
        String[] number=numberString.split("");
        
        
        
//#1: print the smallest
        String[] numberSmall=getSmallest(number);
        System.out.print("\n\n#1: ");

        String[] number1=numberSmall;
        
        //this program can not get rid of the zeros in the numbers yet
        for (int i=0;i<number1.length;i++){
            System.out.print(number1[i]);
        }
        System.out.println("");
        
        
        
//#2: print the largest
        String[] numberBig=getBiggest(numberSmall);
        System.out.print("#2: ");
        for (int i=0;i<numberBig.length;i++){
            System.out.print(numberBig[i]);
        }
        System.out.println("");
        
        
        
        //76221100
        //7 6 221100
        //6!/(2!*2!*2!)=90
        //76 2 21100
        //5!/(2!*2!)=30
        //30th- 76 1 22100
        //761 22100
        //2 2100
        //4!/2!=12
        //30+12=42th- 0
        
//#3: print 50th largest
        int NoneChange=numberBig.length-3;
        
        
        
        
        
        
        
        
    }//end main
    
    
    
    
    
    
    
    public static String[] getSmallest(String[] a){
        Arrays.sort(a);
        return a;
    }
    
    public static String[] getBiggest(String[] a){
        String reverse[]=new String[a.length];
        for(int i=0,j=a.length-1;i<a.length&&j>=0;i++,j--){
            reverse[i]=a[j];
        }
        return reverse;
    }
    
}//end class
