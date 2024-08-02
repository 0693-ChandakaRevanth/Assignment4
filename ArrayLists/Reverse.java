import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter element to add in the list");
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        for (int i =n-1; i>=0; i--) {
            list2.add(list1.get(i));
        }
        System.out.println(list2);
    }
}