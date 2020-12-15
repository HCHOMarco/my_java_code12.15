import java.util.Scanner;
import java.util.Stack;
public class book12_10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Stack<Integer>st = new Stack<Integer>();
        try{
            while(true){
//                System.out.println(1);
                st.push(1);
            }
        }
        catch (OutOfMemoryError ex){
            System.out.println("boom!");
            System.exit(1);
        }
    }
}
