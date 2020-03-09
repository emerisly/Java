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
package program_prefixanddiscarded;
import java.util.Scanner;
/**
 *
 * @author Emerald Liu
 */
public class Program_prefixAndDiscarded {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inputing strings
        System.out.println("Please enter two number lines");
        
        Scanner console=new Scanner(System.in);
        String firstS=console.nextLine();
        String secondS=console.nextLine();
        
        
        //get length of the String
        int lengthFirstS=firstS.length();
        int lengthSecondS=secondS.length();
        
        //get the smaller length
        //int smallerLength=Math.min(lengthFirstS,lengthSecondS);
        
        //intitiate Prefix of String
        String firstStringPrefix="";
        String secondStringPrefix="";
        
        int counter=0;
        
            while(firstStringPrefix.equals(secondStringPrefix)){
                firstStringPrefix=firstStringPrefix+firstS.charAt(counter);
                secondStringPrefix=secondStringPrefix+secondS.charAt(counter);  
                counter++;
 
        }//end while loop
        
            counter--;
            
        System.out.println("String #1: "+firstS+"\nString #2: "+secondS+"\n");
        System.out.println("common prefix: "+firstS.substring(0, counter));
        System.out.println("number discarded: "+(lengthFirstS+lengthSecondS-2*counter));
        
        
    }//end main
    
}//end class

/*
common prefix: 123
number discarded: 5
*/