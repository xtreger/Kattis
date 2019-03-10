import java.util.*;
public class Ladder{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int h = s.nextInt();
        int v = s.nextInt();
        double ans = (h/(Math.sin((Math.toRadians(v)))));
        int a = (int) Math.ceil(ans);
        System.out.println(a);
    }
}