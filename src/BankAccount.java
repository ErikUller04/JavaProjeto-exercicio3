public class BankAccount {
    private int accountNumber;
    private Double balance;

    public BankAccount(int accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withdraw(Double value) {
        if (getBalance() > 0) {
            setBalance(getBalance() - value);
        } else {
            System.out.println("ERRO: seu saldo está abaixo de 0 reais.");
        }
    }

    public void deposit(Double value) {
        setBalance(getBalance() + value);
    }
}
