import java.util.Scanner;

public class RecCharExistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch=sc.next().charAt(0);
        System.out.println(new RecCharExistance().contains(s, ch));
    }

    public boolean contains(String s,char ch) {
        if(s.length()==0){
            return false;
        }else if(s.charAt(0)==ch){
            return true;
        }
        return contains(s.substring(1), ch);
    }
}
