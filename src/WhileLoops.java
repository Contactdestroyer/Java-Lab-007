import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);
    static int eve = 0;
    static int odd = 0;
    static int i = 0;

    public static void eoCount() {

        System.out.println("Enter set non-zero numbers whole numbers, then 0 to end set:");
        while ((i = s.nextInt()) != 0){

            if (i%2==0){
                eve++;
            } else {
                odd++;
            }

        }
    }

    public static void mean() {
        int meeen = 0;
        int t = 0;
        System.out.println("Enter set of non-zero whole numbers, then 0 to end set:");
        while ((i = s.nextInt()) != 0){
            t++;
            meeen = meeen+i;
        }
        System.out.println(meeen/t);
    }

    public static void main(String[] args) {
        eoCount();
        System.out.printf("evens = "+eve+"\nodds = "+odd+"\n");
        mean();
        System.out.print(" is the mean of your numbers.");
    }
}
