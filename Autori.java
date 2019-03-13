import java.util.Scanner;

public class Autori {
 public static void main(String[]args) {
     Scanner sc = new Scanner(System.in);
     String line = sc.nextLine();
     System.out.print(line.charAt(0));
     for(int i = 0;i<line.length(); i++) {
         char e = line.charAt(i);
         if(e == '-') {
             char d = line.charAt(i+1);
             System.out.print(d);
         }
     }
 } 
}