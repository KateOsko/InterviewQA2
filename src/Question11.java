public class Question11 {
    public static boolean disce (int [] nums){
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]<nums[i+1]){
                return false; // 1,4,
            }
        }
        return true;
    }
    public static void main(String[] args) {


        int[] nums = {99,11,6,2,1};

        System.out.println(disce(nums));
    }
}
