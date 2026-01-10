
public class Remove_Duplicates_From_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;

    int k = 1;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[k - 1]) { 
            nums[k] = nums[i];
        }
    }

    return k;
}
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3,4,4,4,4, 5,5,5,5,5,8,8,8,8,8,8};
        System.out.println(removeDuplicates(nums));
    }
}
