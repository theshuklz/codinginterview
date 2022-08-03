package leetcode;

public class P724 {
    public int pivotIndex(int[] nums) {
        int i=-1, j = nums.length;
        int leftSum= 0, rightSum = 0;
        while((j-i)>2){
            if(leftSum+nums[i+1]<rightSum+nums[j-1]){
                leftSum+=nums[i+1];
                i++;
            }
            else{
                rightSum+=nums[j-1];
                j--;
            }
        }
        if(leftSum==rightSum && (j-i)==2)
            return i+1;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new P724().pivotIndex(new int[]{-1,-1,-1,-1,-1,0}));
    }
}
