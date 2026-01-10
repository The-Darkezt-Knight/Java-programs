public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int k = 0;
        int j = 0;
        boolean isFound = false;
        for (int i : nums) {
            if(i != target){k++;}
            if(i == target){isFound = true; break;}
            if(target > i){j++;}else{k = 0;}
        }
        return (isFound)? k : j;
    }
    public static void main(String[] args) {
        int[] n = {1,3,5,6};
        Search_Insert_Position obj = new Search_Insert_Position();
        System.out.println(obj.searchInsert(n, 2));
    }
}
