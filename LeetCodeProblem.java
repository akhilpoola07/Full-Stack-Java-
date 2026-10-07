public class LeetCodeProblem {
//     public static void main(String args []){
//         int [] arr = {4,1,3,2,6,5};
//         int result = 0;
//         int k = 0;
//         for(int j=arr.length-1;j>0;j--){
//             for(int i=0;i<=j-1;i++ ){
//                   k = (j-i)* Math.min(j,i);
//                 }
//             if(k>result){
//                 result = k;
//              }
//     }

//     System.out.println(result);
//     }
// }
// // class Maaa{
    public static void main(String args[]){
        Solution s = new Solution();
        int [] arr = {4,1,3,2,6,5};
        int result=s.maxArea(arr);
        System.out.println(result);
    }
}
class Solution {
    public int maxArea(int[] height) {
        int left = 0; // Initialize the left pointer at the start
        int right = height.length - 1; // Initialize the right pointer at the end
        int maxArea = 0; // Initialize maximum area found so far

        while (left < right) {
            // Calculate the current area
            int currentHeight = Math.min(height[left], height[right]); // Height is limited by the shorter line
            int currentWidth = right - left; // Width is the distance between the pointers
            int currentArea = currentHeight * currentWidth;
            
            // Update maxArea if the current area is greater
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer of the shorter line inward
            if (height[left] < height[right]) {
                left++; // Moving the shorter line might find a taller one
            } else {
                right--; // Otherwise, move the right pointer inward
            }
        }

        return maxArea;
    }
}
