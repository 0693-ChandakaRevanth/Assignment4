import java.util.ArrayList;
import java.util.Scanner;
public class Intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n=sc.nextInt();
        ArrayList<Integer> list1= new ArrayList<>();
        System.out.println("Enter elements to add in the list");
        for(int i=0;i<n;i++){
            list1.add(sc.nextInt());
        }
        System.out.print("Enter size of ArrayList: ");
        int m=sc.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        System.out.println("Enter elements to add in the list");
        for(int i=0;i<m;i++){
            list2.add(sc.nextInt());
            if(list1.contains(list2.get(i))){
                res.add(list2.get(i));}
        }
        System.out.println(res);
    }
}
