import java.util.Scanner;

public class Favourite3x1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        new Favourite3x1().favourite3X1(n);
    }

    public void favourite3X1(int n) {
        System.out.print(n+" ");
        while(n>1){
            if(n%2==0){
                n/=2;
                System.out.print(n+" ");
            }else {
                n=(3*n)+1;
                System.out.print(n+" ");
            }
        }
    }
}
