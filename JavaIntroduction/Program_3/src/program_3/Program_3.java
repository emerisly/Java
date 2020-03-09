/*
 * 
 * @author Emerald Liu
 * 
 * Description: 
 * 
 * I certify that this program is my own work and was not copied and/or modified from another student, website, or source.
 * 
 * 
 */
package program_3;
import java.util.Scanner;
/**
 *
 * @author Emerald Liu
 */
public class Program_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []a=new int[5];
        Scanner console=new Scanner(System.in);
        
        int counter=0;
        int sum=0;
        double avg=0;
        
        //get grades
        while(counter<a.length)
        {
            System.out.println("#"+(counter+1)+" what's your grade?");
            a[counter]=console.nextInt();
            counter++;
        }
        
        //put grades into array and print array
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            System.out.print(a[i]+" ");
        }
        
        //calculate avg
        avg=sum/a.length;
        
        
        System.out.println("\n\nthe avg is "+avg);
        
    }
    
}
