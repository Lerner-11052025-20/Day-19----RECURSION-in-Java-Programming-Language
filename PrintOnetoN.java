public class PrintOnetoN 
{
    public static void print(int n)
    {
        if(n == 0)  return; //BASE CASE
        print(n-1);// hu manu chhu ke aa pan ready j chalshe
        System.out.println(n);// KAAM
    }
    public static void main(String args[])
    {
        print(10);
    }    
}
