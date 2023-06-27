public class Main {
    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
        
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
    }
}
