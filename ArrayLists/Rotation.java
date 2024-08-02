import java.util.ArrayList;
import java.util.Scanner;
public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter element to add in the list");
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        System.out.println("Enter K value: ");
        int k=sc.nextInt();
        int temp;
        for(int i=0;i<k;i++){
            temp=list1.get(n-1);
            for(int j=n-1;j>0;j--){
                list1.set(j,list1.get(j-1));
            }
            list1.set(0,temp);
        }
        System.out.println(list1);
    }
}