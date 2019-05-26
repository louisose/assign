public class Senior extends Customer
{
	// all instance variable should be private.
	// then you create their accessors and modifers if need be.
	// you need to add all abstract methods.

	private boolean vip;
	public static final double SAVINGS_INTEREST;
	public static final double CHECK_INTEREST = 0.04;
	public static final double CHECK_CHARGE;
	public static final double OVERDRAFT_PENALTY;

	public Senior(String firstName, String lastName, int age, int customerNumber, boolean vip)
	{
		super(firstName, lastName, age, customerNumber);
		this.vip = vip;

		if (vip == true)
		{
			SAVINGS_INTEREST = 0.1;
			CHECK_CHARGE = 0;
			OVERDRAFT_PENALTY = 5;
		}

		else
		{
			SAVINGS_INTEREST = 0.08;
			CHECK_CHARGE = 0.04;
			OVERDRAFT_PENALTY = 10;
		}
	}

}
