import java.util.ArrayList;
import java.util.Scanner;

public class Non_Repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter elements to add in the list");
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        int count;
        for(int i=0;i<list1.size();i++){
            count=1;
            for(int j=i+1;j<list1.size();j++){
                if(list1.get(i).equals(list1.get(j))){
                    count++;}
            }
            if(count==1){
                System.out.println("First Non Repeating Element is: "+list1.get(i));
                break;}
        }
    }
}
