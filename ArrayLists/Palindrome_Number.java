import java.util.*;
public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        ArrayList<Character> list1 = new ArrayList<>();
        String str=sc.next();
        for (int i = str.length()-1; i >=0; i--) {
            list1.add(str.charAt(i));
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(list1.get(i).equals(str.charAt(i)))
                count++;
        }
        if(count==str.length())
            System.out.println("Given ArraysList of Characters form a Palindrome");
        else
            System.out.println("Doesn't form a Palindorme");
    }
}
