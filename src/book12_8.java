import java.util.Map;
import java.util.Scanner;

class HexFormatException extends Exception{
    public HexFormatException(String msg){
        super(msg);
    }
}


public class book12_8 {
    static int hex2Dec(String s) throws HexFormatException {
        int res=0;
        s=s.toUpperCase();
        try{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                    res=res*16+(s.charAt(i)-'0');
                }else if(s.charAt(i)>='A'&&s.charAt(i)<='F'){
                    res=res*16+(s.charAt(i)-'A'+10);
                }else{
                    throw new HexFormatException("This is not a hex number");
                }

            }
        }
        catch (HexFormatException ex){
            System.out.println(ex.getMessage());
        }
        return res;
    }

    public static void main(String[] args) throws HexFormatException {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();

        System.out.println(hex2Dec(s));

    }
}
