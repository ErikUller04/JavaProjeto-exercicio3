public class Main {

    static Operation operation = new Operation();
   static UserCreator userCreator = new UserCreator();
   static User currentUser;
    public static void main(String[] args) {

        currentUser = userCreator.createUser();
        System.out.println("Olá " + currentUser.getName() + "!");
        operation.executeOperationPrompt(currentUser);

    }
}