public class BinaryStringProblem 
{
    public static void bS(int n, int lastPlace , String str)
    {
        if(n == 0)
        {
            System.out.println(str);
            return;
        }

        bS(n-1, 0, str + "0"); // "" = "" + "0" aavu no thay kaka "" + "0" ; only assignment to karvanu j nathi add karvanu chee "0" + "1" ------> "01"
        if(lastPlace == 0)  bS(n-1, 1, str+"1");
    }
    public static void main(String args[])
    {
        bS(3, 0, "");
    }    
}
