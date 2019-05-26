public class Adult extends Customer
{
	// all instance variable should be private.
	// then you create their accessors and modifers if need be.
	// you need to add all abstract methods.

	public static final double SAVINGS_INTEREST = 0.03;
	public static final double CHECK_INTEREST = 0.01;
	public static final double CHECK_CHARGE = 3;
	public static final double OVERDRAFT_PENALTY = 25;

	public Adult(String firstName, String lastName, int age, int customerNumber)
	{
		super(firstName, lastName, age, customerNumber);
	}
}
