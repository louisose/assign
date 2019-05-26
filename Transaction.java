public class Transaction
{
	private byte type;
	private double amount;
	private Date date;
	private double fees;
	private String description;

	public String processTransaction()
	{
		if (type == 0)
		{
			String type2 = "deposit";
		} 
		else if (type == 1)
		{
			String type2 = "withdraw";
		}
		else
		{
			String type2 = "added Interest";
		}
		return "Transaction type: " + type2 + " Amount " + amount + " Date: " + date + " Fees: " + fees + " Description: " + description;
	}

	public Transaction(byte type, double amount, Date date, double fees, String description)
	{
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.fees = fees;
		this.description = description;
	}
}