import java.util.Scanner;

public class book12_6 {

    public static void main(String[] args) throws Exception {
        System.out.print("please input a hex number :");
        Scanner kb = new Scanner(System.in);
        String s=kb.next();
        s=s.toUpperCase();
        boolean isHex=true;
        int flag=1;
        for(int i=0;i<s.length();i++){
            try{
                isHex= s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) >= 'A' && s.charAt(i) <= 'F';
                if(!isHex){
                    flag=0;
                    throw new Exception("it is not a hex number!");
                }
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                System.exit(1);
            }
        }
        if(flag==1){
            int res=0;
            for(int i=0;i<s.length();i++){
                int tmp;
                if(s.charAt(i)>='0'&&s.charAt(i)<='9')tmp=s.charAt(i)-'0';
                else tmp=s.charAt(i)-'A'+10;
                res=res*16+tmp;
            }
            System.out.println("The result is : "+res);
        }

    }
}
