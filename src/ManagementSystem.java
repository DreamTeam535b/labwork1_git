import java.util.ArrayList;

public interface ManagementSystem{
    //adding transactions
    void addIncomeTransaction(); //plus money
    void addExpenseTransaction();//minus money

    //get info about transactions and balance
    void getAllTransactionsInfo(); //all transactions

    //get amount
    double getIncomeInfo(); //all income amount
    double getExpenseInfo(); //all expense amount

    //get transactions info
    ArrayList<Transaction> getIncomeTransactionsInfo(); //all income transactions
    ArrayList<Transaction> getExpenseTransactionsInfo(); //all expense transactions

    //output info
    String viewAllTransfersInfo(); //all transfers info
    String viewIncomeInfo();//income transactions and amount of income
    String viewExpenseInfo();//expense transactions and amount of expense
}
