import java.util.Scanner;

class BinaryFormatException extends Exception{
    public BinaryFormatException(String s){
        super(s);
    }
}

public class book12_9 {

    static int bin2Dec(String s)throws BinaryFormatException{
        int res=0;
        try{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='0'&&s.charAt(i)!='1')throw new BinaryFormatException("This is not a bin number!");
                res=res*2+(s.charAt(i)-'0');
            }
        }catch (BinaryFormatException ex){
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        return res;
    }


    public static void main(String[] args) throws BinaryFormatException{
        Scanner kb = new Scanner(System.in);
        String s=kb.next();
        System.out.println(bin2Dec(s));
    }
}
