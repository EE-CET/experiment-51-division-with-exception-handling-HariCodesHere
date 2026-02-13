import java.util.Scanner;

public class DivisionHandling {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b=sc.nextInt();

                try{
                        int c = a/b;
                }
                catch(ArithmeticException ex){
                        System.out.println("Divide by zero error");
                }
        }
}
