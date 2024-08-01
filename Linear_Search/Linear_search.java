package Day04_programs;

import java.util.Scanner;

public class Linear_search {
    static int linearsearch(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(linearsearch(arr,target));
    }
}
