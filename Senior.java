public class Senior extends Customer{
  private boolean vip;
  private static final double SAVINGS_INTEREST;
  private static final double CHECK_INTEREST;
  private static final double CHECK_CHARGE;// As this is the dollar represntation of cents.
  private static final double OVERDRAFT_PENALTY;//As this is the double representaion of dollar.

  public Senior(String firstName, String lastName, int age){
    super(firstName, lastName, age);
    SAVINGS_INTEREST = 0.08;
    CHECK_INTEREST = 0.04;
    CHECK_CHARGE = 0.01;
    OVERDRAFT_PENALTY = 10.00;

  }
  public Senior(String firstName, String lastName, int age, boolean vip){
    super( firstName,  lastName, age);
    if(vip == true){
      SAVINGS_INTEREST = 0.1;
      CHECK_INTEREST = 0.04;
      CHECK_CHARGE = 0.00;
      OVERDRAFT_PENALTY = 5.00;
    }else{
      SAVINGS_INTEREST = 0.08;
      CHECK_INTEREST = 0.04;
      CHECK_CHARGE = 0.01;
      OVERDRAFT_PENALTY = 10.00;
    }

  }

  public double getSavingsInterest(){
    return this.SAVINGS_INTEREST;
  }
  public double getCheckInterest(){
    return this.CHECK_INTEREST;
  }
  public double getCheckCharge(){
    return this.CHECK_CHARGE;
  }
  public double getOverDraftPenalty(){
    return this.OVERDRAFT_PENALTY;
  }

  /*public String toString(){
    return super().toString();
  }*/
}
