import java.util.Scanner;
public class max{
    public static int combination(int n){
        return (n*(n-1))/2;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int noHand=sc.nextInt();
        int handshake=combination(noHand);
        System.out.println("hand"+handshake);

        sc.close();
    }
}