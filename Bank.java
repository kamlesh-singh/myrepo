public interface Bank {

    void getDetails();
    void printDetails();
    void transfer_money() throws  InsufficientAmountException;
    void write_log(float amt,String trans);
    enum account_type{
        CURRENT,
        SAVING
    }

}
