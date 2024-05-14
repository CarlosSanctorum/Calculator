import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2, result;
        char operator, Continue;

        do {
            System.out.println("Digite o primeiro número: ");
            n1 = scanner.nextDouble();

            System.out.println("Digite o operador (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.println("Digite o segundo número: ");
            n2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result = n1 + n2;
                    System.out.println(result);
                    break;
                case '-':
                    result = n1 - n2;
                    System.out.println(result);
                    break;
                case '*':
                    result = n1 * n2;
                    System.out.println(result);
                    break;
                case '/':
                    if (n2 == 0) {
                        System.out.println("Está brincando com a nossa cara?");
                    } else {
                        result = n1 / n2;
                        System.out.println(result);
                    }
                    break;
                default:
                    System.out.println("Inválido...");
            }
            System.out.println("Deseja fazer outra conta? (Y/n): ");
            Continue = scanner.next().charAt(0);

        } while (Continue == 'y' || Continue == 'Y');
        scanner.close();
    }
}