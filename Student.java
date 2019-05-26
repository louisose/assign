public class Student extends Customer
{
	// all instance variable should be private.
	// then you create their accessors and modifers if need be.
	// you need to add all abstract methods.

	public static final double SAVINGS_INTEREST = 0.07;
	public static final double CHECK_INTEREST = 0.03;
	public static final double CHECK_CHARGE = 2;
	//IS THIS RIGHT?!?
	public static final double OVERDRAFT_PENALTY = 0;

	public Student(String firstName, String lastName, int age, int customerNumber)
	{
		super(firstName, lastName, age, customerNumber);
	}
}
