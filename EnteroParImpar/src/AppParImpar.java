import java.util.Scanner;

public class AppParImpar {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int num;

            System.out.println("Ingrese un número: ");

            num = sc.nextInt();

            if(num % 2==2) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }
        }
    }
}
