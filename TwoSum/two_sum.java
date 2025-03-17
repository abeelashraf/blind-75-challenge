class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        int []index=new int[2];
        for(int i=0;i<nums.length;i++){
            int curNum=nums[i];
            int match=target-curNum;
            if(hashMap.containsKey(match)){
                index[0]=i;
                index[1]=hashMap.get(match);
            }else{
                hashMap.put(curNum,i);
            }
        }
        return index;

    }
}