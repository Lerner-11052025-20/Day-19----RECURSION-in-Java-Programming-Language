
import java.util.Scanner;
public class PowerOfXtoNoptimized 
{
    public static int power(int x, int pow)
    {
        if(pow == 0)    return 1;
        int halfPower = power(x, pow/2);
        int halfPowerSquare = halfPower * halfPower;
        // int halfPowerSquare = (power(x, pow/2) * power(x, pow/2));
        if((pow&1) == 1)  halfPowerSquare = x * halfPowerSquare; 
        return halfPowerSquare;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(power(x, pow));
    }
}
