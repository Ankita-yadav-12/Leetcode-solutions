class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
         int res[]=new int[n];
       
        
        for(int i=0;i<nums.length;i++){
            int rightsum= 0;
        int leftsum=0;
            for(int j=0;j<nums.length;j++){
                if(j<i){
                    leftsum+=nums[j];
                    
                }
                if(j>i){
                    rightsum+=nums[j];
                }
}res[i]=Math.abs(leftsum-rightsum);
            }
        
        
        return res;
                    
            
    
    }
    }