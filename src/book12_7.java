import java.util.Scanner;
public class book12_7 {
    static int bin2Dec(String s) {
        int res=0;
        try{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='0' && s.charAt(i)!='1'){
                    throw new NumberFormatException("it is not a bin number!");
                }
                res=res*2+(s.charAt(i)-'0');
            }
        }
        catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s=kb.next();
        int res=bin2Dec(s);
        System.out.println(res);
    }
}
