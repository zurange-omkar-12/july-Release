package testCases;

public class user_Details {
	
	String userNAME;
	String passWORD;
	boolean expecTED;
	
	user_Details(String userNAME,String passWORD,boolean expecTED)
	{
		this.userNAME=userNAME;
		this.passWORD=passWORD;
		this.expecTED=expecTED;
	}

	String get_userNAME()
	{
		return this.userNAME;
	}
	
	String get_passWORD()
	{
		return this.passWORD;
	}
	boolean get_expecTED()
	{
		return this.expecTED;
	}
	
}
