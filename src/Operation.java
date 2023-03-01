import java.util.Scanner;

public class Operation {

    public void executeOperationPrompt(User user) {
        System.out.println("Seu saldo atual é: " + user.getBankAccount().getBalance());

        int operation = getOperation();

        if (operation == 1) {
            user.getBankAccount().withdraw(getValue());
        } else if (operation == 2) {
            user.getBankAccount().deposit(getValue());
        } else if (operation == 3) {
            System.out.println("operações encerradas.");
            return;
        }
        executeOperationPrompt(user);


    }

        int getOperation() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual operação você deseja fazer?");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Encerrar");
            return scanner.nextInt();
        }

        Double getValue() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual o valor?");
            return scanner.nextDouble();
        }
}
