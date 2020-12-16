package com.hm.cloud.admin.util;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //数组2取值范围[0,n]
        int a = 0;
        //取值范围[0,m+n]
        int b = m+n;

        for(int i=0; i < b;){
            if(nums1[i] == nums2[a]){
                a++;
                i++;
            }else if(nums1[i] > nums2[a]){
                swap(nums1,nums2,nums1[i],nums2[a]);
            }else{
                swap(nums1,nums2,nums1[i],nums2[a]);
                a++;
                i++;
            }
        }

        for(int num: nums1)
            System.out.print(num + " ");
        System.out.println();
    }
    private void swap(int[] nums, int[] nums2,int i,int j){
        int t = nums[i];
        nums[i]= nums2[j];
        nums2[j] = t;
    }
    public static void printArr(int[] nums){
        for(int num: nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        (new Solution()).merge(nums,3,nums2,3);
        //printArr(nums);
    }
}