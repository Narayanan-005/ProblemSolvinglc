import java.util.Scanner;

public class TrainOfChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(new TrainOfChar().trainOfChar(s));
    }
    public String trainOfChar(String s) {
        String res="";
        int mid=(s.length()/2)+1;
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2){
                res+=(""+s.charAt(i)).repeat(mid--);
            }else if(i>s.length()/2){
                res+=(""+s.charAt(i)).repeat(++mid);
            }else{
                res+=s.charAt(i);
            }
        }
        return res;
    }
}
