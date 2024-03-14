import java.util.Arrays;

public class AllOfByOne {
    public static void main(String[] args) {
        int []arr1={4, 15, 40, 99};
        int []arr2={5, 16, 41, 100};
        System.out.println(new AllOfByOne().allOffByOne(arr1,arr2));
    }
    public boolean allOffByOne(int[] arr1, int[] arr2) {
        if(arr1.length!=arr2.length){
            return false;
        }else if(arr1.length==0 && arr2.length==0){
            return true;
        }else if(arr2[0]==arr1[0]+1){
            return allOffByOne(shortArray(arr1), shortArray(arr2));
        }
        return false;
    }
    public int [] shortArray(int []arr) {
        int res[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            res[i-1]=arr[i];
        }
        return res;
    }
}
