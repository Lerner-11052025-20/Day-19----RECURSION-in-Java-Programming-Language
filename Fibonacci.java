public class Fibonacci 
{
    public static int fibonacci(int n)
    {
        if(n == 0 || n == 1)    return n;
        return (fibonacci(n-1) + fibonacci(n-2));
    }
    public static void main(String args[])
    {
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(30));
        System.out.println(fibonacci(31));
        System.out.println(fibonacci(32));
        System.out.println(fibonacci(33));
        System.out.println(fibonacci(34));
        System.out.println(fibonacci(35));
        System.out.println(fibonacci(40));
    }    
}
