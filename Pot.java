import java.util.Scanner;
public class Pot
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int q;
        int x = 0;
        int l = 0;
        q = scan.nextInt();
        for (int i=1; i<=q; i++)
        {
             l = scan.nextInt();
            int v = l/10;
            int d = (l % 10);
            int b = (int) java.lang.Math.pow(v,d);
            x = x + b;
        }
        System.out.println(x);
    }
}