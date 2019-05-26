public abstract class Customer
{
	private String firstName, lastName;
	private int age, customerNumber;
	public static int lastCustomerNumber = 9999;

	public Customer(String firstName, String lastName, int age, int customerNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.customerNumber = customerNumber;
	}
	
	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public int getAge()
	{
		return age;
	}

	public int getCustomerNumber()
	{
		return customerNumber;
	}
// I believe that all these are meant to be constant expect if you want to
//ceate an empty constructor which does not make sense.
	/*public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
	}
*/

	//CHECK THIS ONE!
	// this should work. But you might want to add for class conversions.
	/*Since this is an abstract class we cannot create an object of this class.*/
	public boolean equals(Customer other)
	{
		if (this.firstName == other.firstName && this.lastName == other.lastName && this.age == other.age && this.customerNumber == other.customerNumber)
		{
			return true;
		}

		else
		{
			return false;
		}
	}

	public String toString()
	{
		return "First name: " + firstName + " Last name: " + lastName + " Age: " + age + " Customer number: " + customerNumber;
	}


	public abstract double getSavingsInterest();

	public abstract double getCheckInterest();

	public abstract double getCheckCharge();


}
