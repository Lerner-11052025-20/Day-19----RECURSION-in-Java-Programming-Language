import java.util.Scanner;
public class PowerOfXtoN 
{
    public static int power(int x, int pow)
    {
        if(pow == 0)    return 1;
        return (x * power(x, pow-1));
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(power(x, pow));
    }    
}
