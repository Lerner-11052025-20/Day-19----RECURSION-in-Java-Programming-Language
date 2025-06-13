public class FriendPairingProblem 
{
    public static int friendPairingProblem(int n)
    {
        if(n == 1 || n == 2)    return n;
        return (friendPairingProblem(n-1) + ((n-1) * friendPairingProblem(n-2)));
    }
    public static void main(String args[])
    {
        System.out.println(friendPairingProblem(3));
    }    
}
