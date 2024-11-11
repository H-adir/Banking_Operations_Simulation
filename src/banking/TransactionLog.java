package banking;

public interface TransactionLog {
    void recordTransaction(String type, double amount);
}
