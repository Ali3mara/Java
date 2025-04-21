package Projects;

public class LeetCode {
    public static void main(String[] args) {
        int[] nums = {4, 3, 5, 2, 1};
        int target = 9; // Example target
        int[] result = twoSum(nums, target);
        System.out.println("Because: num[" + result[0] + "] + num[" + result[1] + "] = " + nums[result[0]] + " + " + nums[result[1]] + " == " + target+". We return "+ result[0] + " and " + result[1] + "."); 
        // Example output: Indices: 3, 4 (for nums[3] + nums[4] = 4 + 5 = 9)
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; //WHY NEW int[]{i, j} IS USED HERE?
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found.");
    }
}