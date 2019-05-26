public class Senior1 extends Customer{
  private boolean vip = false;
  private static final double SAVINGS_INTEREST = 0.08;
  private static final double SAVINGS_INTEREST_VIP = 0.1;
  private static final double CHECK_INTEREST = 0.04;
  private static final double CHECK_INTEREST_VIP = 0.04;
  private static final double CHECK_CHARGE = 0.01;// As this is the dollar represntation of cents.
  private static final double CHECK_CHARGE_VIP = 0.00;
  private static final double OVERDRAFT_PENALTY = 10.00;//As this is the double representaion of dollar.
  private static final double OVERDRAFT_PENALTY_VIP_LESS_THAN_100 = 0.00;
  private static final double OVERDRAFT_PENALTY_VIP_UP_TO_500 = 5.00;

  public Senior1(String firstName, String lastName, int age){
    super(firstName, lastName, age);

  }
  public Senior1(String firstName, String lastName, int age, boolean vip){
    super(firstName, lastName, age);
    this.vip = vip;

  }

  public double getSavingsInterest(){
    return this.SAVINGS_INTEREST;
  }
  public double getSavingsInterestVip(){
    return this.SAVINGS_INTEREST_VIP;
  }
  public double getCheckInterest(){
    return this.CHECK_INTEREST;
  }
  public double getCheckInterestVip(){
    return this.CHECK_INTEREST_VIP;
  }
  public double getCheckCharge(){
    return this.CHECK_CHARGE;
  }
  public double getCheckChargeVip(){
    return this.CHECK_CHARGE_VIP;
  }
  public double getOverDraftPenalty(){
    return this.OVERDRAFT_PENALTY;
  }
  public double getOverDraftPenaltyVipLessThan100(){
    return this.OVERDRAFT_PENALTY_VIP_LESS_THAN_100;
  }
  public double getOverDraftPenaltyVipLessThan500(){
    return this.OVERDRAFT_PENALTY_VIP_UP_TO_500;
  }

  /*public String toString(){
    return super().toString();
  }*/
}
