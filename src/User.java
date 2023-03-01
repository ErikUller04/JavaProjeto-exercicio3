import java.util.Random;

public class User {
    private String name;
    private String email;
    private long cellphone;
    private long cpf;
    private BankAccount bankAccount;

    public User(String name, String email, long cellphone, long cpf) {
        this.name = name;
        this.email = email;
        this.cellphone = cellphone;
        this.cpf = cpf;
        this.bankAccount = new BankAccount(100000 + new Random().nextInt(999999),0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
