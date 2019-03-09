import java.util.Scanner;
public class HissingMicrophone
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String s = "";
        s = scan.nextLine();
        int count = 0;
        for (int i=0; i<s.length()-1; i++)

        {if((s.charAt(i) == s.charAt(i+1) && s.charAt(i) == 's'))
            {  
                count++;
            }
        }
        if (count==0)
        {
            System.out.println("no hiss");
        }else 
        {
            System.out.println("hiss");
        }
    }
}