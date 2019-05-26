public abstract class Account
{
	private Customer customer;
	private double balance;
	//CHECK THIS ONE
	private int accountNumber;
	private Transaction[] transaction;
	public static int INITSIZE = 25;

	public Account(Customer customer, double balance, int accountNumber)
	{
		transaction = new Transaction[INITSIZE];
		this.customer = customer;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	//DONT GET THIS ONE
	public void reallocate()
	{
		if (transaction[transaction.length - 1] != null)
		{
				Transaction tempArray = new Transaction[transaction.length];
				tempArray = transaction;

				transaction = new Transaction[transaction.length*2];

				for (int i = 0; i < tempArray.length; i++)
				{
					transaction[i] = tempArray[i];
				}
		}
	}
	public double getBalance()
	{
		return balance;
	}

	public double getCustomer()
	{
		return customer;
	}

	public String toString()
	{
		return "Customer: " + customer + " Balance: " + balance + " Account number: " + accountNumber;
	}

	public void setCustomer(Customer c)
	{
		this.customer = c;
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public abstract void addInterest();
	
}