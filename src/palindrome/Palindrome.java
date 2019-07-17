
package palindrome;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       
        Scanner l= new Scanner(System.in);
        System.out.println("Masukkan kata= ");
        String kata = l.nextLine();
        int a = kata.length();
        String [] b= new String [a];
        int i=0;
        while (i<a){
            b[i]="" + kata.charAt(i);
            i++;
        }
        String []d= new String [b.length];
        int e=0;
        i=0;
        System.out.println("");
        while (i<a){
            d[e]=b[a-1];
            System.out.print(d[e] );
            e+=1;
            a-=1;
            
        }
        System.out.println(" ");
       if (b[a] == null ? d[a] == null : b[a].equals(d[a])){
           System.out.println("Palindrome");
       }
           else {
                   System.out.println("bukan palindrome");
                   }
        System.out.println(b.length);
       }
        }
    
        
    
    
    

