public class ArrayIsSorted 
{
    public static boolean check(int nums[], int i)
    {
        if(i == nums.length-1)  return true;
        if(nums[i] > nums[i+1])     return false;
        return check(nums, i+1);
    }
    public static void main(String args[])
    {
        int nums[] = {1, 2, 3, 4, 5};
        System.out.println(check(nums, 0));
    }    
}
