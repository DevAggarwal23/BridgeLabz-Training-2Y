import java.util.Scanner;
public class SimpInt{
    public static void si(int p, float rate,int time){
        float s=(p*rate*time)/100;
        System.out.println("The Simple Interest is "+s+ " for Principal "+p+" Rate of Interest "+ rate +" and Time "+time);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int p=sc.nextInt();
        float rate=sc.nextFloat();
        int time=sc.nextInt();
        si(10000,8.5f,5);
        
        sc.close();

    }
}