

//"1.) https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int time=0;
        for(int i=0;i<endTime.length;i++){
            if(startTime[i]<queryTime){
                if(endTime[i]>queryTime){
                    time++;
                }
            }   
        }
       return time;
}

//
//2.) https://leetcode.com/problems/running-sum-of-1d-array/
public int[] runningSum(int[] nums) {

    int sum=0;
    for(int i=0;i<nums.length;i++){
        nums[i]=nums[i]+sum;
        sum=nums[i];
    }
    //System.out.println(sum);
    return nums;
}
//

//3.)  Given two arrays, find the intersection between them?

class intersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 7, 8};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    //r[i]=arr2[j];
                    System.out.println(arr2[j]);
                    
                }
            }
        }    
    }
}

//4.)  Write a program to find second largest element in a given Array in java?"


class secondelement{
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,5,3,12,7,50,90,100};
        System.out.println(secondlargestelement(arr));
    }
    private static int secondlargestelement(int arr[]){
        int max1=0,max2=0;
        for(int num:arr){
            if(max1<num){
                max2=max1;
                max1=num;
            }
            else if(max2<num){
                max2=num;
            }
        }
        return max2;
    }
}
