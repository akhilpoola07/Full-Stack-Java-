package DAY4;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int [][] nums = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("The elements of the array are:"+java.util.Arrays.deepToString(nums));
        //for loop to print the elements of the array
        for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[i].length;j++){
                    System.out.println(nums[i][j]);
                }
                System.out.println();
        }
        nums[0][0] = 10;
        System.out.println("The elements of the array are:"+java.util.Arrays.deepToString(nums));
        System.err.println("After Updating" + nums[0][0]);
    }
}
