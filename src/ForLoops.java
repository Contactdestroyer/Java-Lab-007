import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);
    static int i = 0;
    public static void forSum() {
        System.out.println("Number?");
        int x =0;
        int num = s.nextInt();
        while (i < num){
            i++;
            x = x+i;
        }
        System.out.println("forSum result: "+x);
        i = 0;
    }

    public static void rangeSum() {
        System.out.println("Number?");
        int num = s.nextInt();
        System.out.println("Second number?");
        int num2 = s.nextInt();
        int x = 0;
        int y = 0;
        while (i < num){
            i++;
            x = x+i;
        }
        int z = i;
        i = 0;
        while(i < num2){
            i++;
            y = y+i;
        }
        System.out.println(num+" "+num2);
        System.out.println("forSum result: "+(Math.abs(x-y)+Math.min(z,i)));
        i = 0;
    }

    public static void factorial() {
        System.out.println("Number?");
        int x =1;
        int num = s.nextInt();
        while (i < num){
            i++;
            x = x*i;
        }
        System.out.println("factorial result: "+x);
        i = 0;
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
