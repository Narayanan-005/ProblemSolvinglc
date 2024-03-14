import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(new SquareRoot().sqareRoot(n));
    }

    public int sqareRoot(int n) {
        double i=1;
        while (i*i<=n) {
            i++;
        }
        if(((i-0.5)*(i-0.5))<=n){
            return (int)i;
        }
        return (int)(i-1);
    }
}