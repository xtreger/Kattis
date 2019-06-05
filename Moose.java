import java.util.Scanner;
public class Moose
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        if (l==0 && r==0 ) 
        {
            System.out.println("Not a moose");
        }else if (l>r)
        { 
            System.out.println("Odd " + (l*2));
        }else if (r>l)
        {
            System.out.println("Odd " + (r*2));
        }
        else if (r>0 && l==r)
        {
            System.out.println("Even " + (r*2));
        }
    }
}
