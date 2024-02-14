class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int[] posVal=new int[nums.length/2];
        int[] negVal=new int[nums.length/2];
        int i=0,j=0;
        for(int val:nums){
            if(val<0){
                negVal[i++]=val;
            }
            else{
                posVal[j++]=val;
            }
        }
        //System.out.println(Arrays.toString(posVal));
        j=0;
        for(i=0;i<nums.length;i+=2){
           ans[i]=posVal[j];
           ans[i+1]=negVal[j];
           j++;
        }
        return ans;
    }
}
