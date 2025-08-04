import java.util.*;

public class Twosum {
    public static int[] checkForTwoSumValues(int[]nums, int target){
        Map<Integer, Integer> values = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int existedValues = target - nums[i];

            if(values.containsKey(existedValues)){
                return new int[]{values.get(existedValues), i};
            }
            values.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int [] result = checkForTwoSumValues(nums, target);
        System.out.println(Arrays.toString(result));
    }
}