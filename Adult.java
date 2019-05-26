public class Adult extends Customer{
  private static final double SAVINGS_INTEREST = 0.03;
  private static final double CHECK_INTEREST = 0.01;
  private static final double CHECK_CHARGE = 0.03;// As this is the dollar represntation of cents.
  private static final double OVERDRAFT_PENALTY = 25.00;//As this is the double representaion of dollar.

  public Adult(String firstName, String lastName, int age){
    super(String firstName, String lastName, int age);
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
