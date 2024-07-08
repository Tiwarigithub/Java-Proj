class Bank
{
	string bank_name
	Bank(string bank_name)
	{
		this bank_name = bank_name;
	}
	void print Detail()
	{
	 system.out.println("bank name:" + this bank_name);
	}
}
class saving extends bank
	int account_no;
	saving(string bank_name,int account_no)
	{
		super(bank_name)
		this account_no = account_no;
	}
	void print account()
	{
	system.out.println("account no:"+this account_no);
	}
}
class saving extends bank
	int account_no;
	saving(string bank_name,int account_no)
	{
		super(bank_name)
		this account_no = account_no;
	}
	void print account()
	{
	system.out.println("account no:"+this account_no);
	}
}
class bank main
{ 
	public static void main(string args[])
	{
	saving s = new saving("HDFC",33445566);
	s.print detail()
	s.print account();
	}