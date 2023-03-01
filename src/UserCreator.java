import java.util.Scanner;

public class UserCreator {

    public User createUser() {
        String name;
        String email;
        long cellphone;
        long cpf;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        name = scanner.nextLine();

        System.out.println("Qual o seu email?");
        email = scanner.nextLine();

        System.out.println("Qual o seu numero de telefone?");
        cellphone = scanner.nextLong();

        System.out.println("Qual o cpf?");
        cpf = scanner.nextLong();

        return new User(name, email, cellphone, cpf);
    }
}
