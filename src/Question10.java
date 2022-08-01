public class Question10 {

    /*
        int[]a={1,2,3,9,4,5,6,7};

        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
        if(a[i]>max){
        max=a[i];
    }
}
        System.out.println(max);
     */

    public static boolean ascending (int [] nums){


        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] nums = {1,4,6,99,25532};
        System.out.println(ascending(nums));

    }
}
