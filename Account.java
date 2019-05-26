public abstract class Account{
  private Customer customer;
  private double balance;
  private int accountNumber;
  private int lastAccountNumber = 9999;
  private Transaction[] transactions;
  private static int INTSIZE = 25;

  public Account(Customer customer, double balance){
    this.customer = customer;
    this.balance = balance;
    accountNumber = lastAccountNumber;
    lastAccountNumber++;
    transactions = new Transaction[INTSIZE];
  }

  public double getBalance(){
    return this.balance;
  }
  public Customer getCustomer(){
    return this.customer;
  }
  public void setCustomer(Customer c){
    this.customer = c;
  }
  public String toString(){
    String s = " ";
     s = "Customer Name: " + customer + " Account Balance: " + balance + " Account Number: " + accountNumber;
    return s;
  }

  public abstract void deposit(double amount);
  public abstract void withdraw(double amount);
  public abstract void addInterest(double amount);

}
