public class RemoveDuplicatesInString 
{
    public static void rD(String str, int index, StringBuilder sb, boolean map[])
    {
        if(index == str.length())
        {
            System.out.println(sb.toString());
            return;
        }

        char currentChar = str.charAt(index);
        if(map[currentChar - 'a'] == true)
        {
            rD(str, index+1, sb, map);
        }
        else // map[currentChar - 'a'] != true
        {
            map[currentChar - 'a'] = true;
            rD(str, index+1, sb.append(currentChar), map);
        }
    }
    public static void main(String args[])
    {
        rD("appnnacollege", 0, new StringBuilder(""), new boolean[26]);
    }     
}
