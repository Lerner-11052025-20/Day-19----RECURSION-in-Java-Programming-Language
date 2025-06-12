public class FirstOcuurence 
{
    public static int firstOccurence(int nums[], int key, int i)
    {
        if(i == nums.length)  return -1;
        if(key == nums[i])  return i;
        return firstOccurence(nums, key, i+1);
    }
    public static void main(String args[])
    {
        int nums[] = {1, 2, 3, 4, 3};
        System.out.println(firstOccurence(nums, 30, 0));
    }
}
