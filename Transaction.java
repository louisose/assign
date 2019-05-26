import java.util.Date;
public class Transaction{
  private byte type;
  private double amount;
  private Date date;
  private String description;
  private double fees;

  public Transaction(byte type, double amount, Date date, double fees){
    this.type = type;
    this.amount = amount;
    this.date = date;
    this.fees = fees;
    this.description = " ";
  }
  public Transaction(byte type, double amount, Date date, double fees, String description){
    this.type = type;
    this.amount = amount;
    this.date = date;
    this.fees = fees;
    this.description = description;
  }

  public String processTransaction(){
    String s;
    if(type == 0){
      s = "Transaction type: deposit Ammount " + amount + " Date: " + date + " Fees: " + fees + " Description: " + description + ".";
      return s;
    }else if(type == 1){
      s = "Transaction type: withdraw Ammount " + amount + " Date: " + date + " Fees: " + fees + " Description: " + description + ".";
      return s;
    }else if(type == 2){
      s = "Transaction type:addedInterest " + amount + " Date: " + date + " Fees: " + fees + " Description: " + description + ".";
      return s;
    }else{
      s = " Invalid transactio type. Please enter a value from 0 - 2.";
      return s;
    }
  }
}
