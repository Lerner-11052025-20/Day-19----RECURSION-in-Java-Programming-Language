public class LastOcuurence 
{
    public static int lastOcuurence(int nums[], int key, int i)
    {
        if(i == nums.length)    return -1;
        int t = lastOcuurence(nums, key, i+1);
        if(t != -1)     return t;
        if(key == nums[i])  return i;
        return -1;
    }
    public static void main(String args[])
    {
        int nums[] = {1, 2, 3, 4, 3};
        System.out.println(lastOcuurence(nums, 3, 0));
    }
}
