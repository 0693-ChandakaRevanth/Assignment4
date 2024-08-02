import java.util.ArrayList;
import java.util.Scanner;
public class Largest_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter elements to add in the list");
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        int temp;
        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list1.size();j++){
                if(list1.get(i)>list1.get(j)){
                    temp=list1.get(i);
                    list1.set(i,list1.get(j));
                    list1.set(j,temp);
                }
            }
        }
        System.out.println("Smallest Element: "+list1.get(0));
        System.out.println("Largest Element: "+list1.get(list1.size()-1));
    }
}
