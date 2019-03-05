import java.util.Scanner;

public class SevenWonders
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int t = 0, c = 0, g = 0, ans = 0, small=0;

        String b = scan.nextLine();
        for(int i=0;i<b.length();i++)
        {switch( b.charAt(i))
            {
                case 'T': t++;
                break;
                case 'C': c++;
                break;
                case 'G': g++;
                break;
            }
        }
        if(t<c && t<g)
        {
            small = t*7;
        } else if(c<t && c<g)
        {
            small = c*7;
        } else if(g<c && g<t)
        {
            small = g*7;
        } else if(t==c && t==g)
        {
            small = t*7;
        } else if(t<c && t==g)
        {
            small = t*7;
        } else if(t==c && t<g)
        {
            small = t*7;
        }else if(g==c && t>g)
        {
            small = g*7;
        }
         ans = t*t + c*c + g*g + small;
        System.out.println(ans);
    }
}