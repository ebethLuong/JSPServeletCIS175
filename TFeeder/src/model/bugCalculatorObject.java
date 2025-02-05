package model;

public class bugCalculatorObject {
	
	private int slings;
	private int juvis;
	private int subs;
	private int adults;
	private String feederType;

	private int numOfBugs;
	
	
	
	public bugCalculatorObject()
	{
		
	}
	
	
	public bugCalculatorObject(int slings, int juvis, int subs, int adults, String feederType) {
		super();
		this.slings = slings;
		this.juvis = juvis;
		this.subs = subs;
		this.adults = adults;
		setFeederType(feederType);
		setNumOfBugs();

	}
	public int getSlings() {
		return slings;
	}
	public void setSlings(int slings) {
		this.slings = slings;
	}
	public int getJuvis() {
		return juvis;
	}
	public void setJuvis(int juvis) {
		this.juvis = juvis;
	}
	public int getSubs() {
		return subs;
	}
	public void setSubs(int subs) {
		this.subs = subs;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	
	public int getNumOfBugs() {
		return numOfBugs;
	}
	public void setNumOfBugs() {
		int bugCount=0;

		if (getFeederType() == "crickets" )
		{
			bugCount += getSlings()*1;
			bugCount += getJuvis()*2;
			bugCount += getSubs()*3;
			bugCount += getAdults()*4;
		}
		else
		{
			bugCount += getSlings()/3;
			if(getSlings() % 3 != 0) bugCount++;
			bugCount += getJuvis()*1;
			bugCount += getSubs()*1;
			bugCount += getAdults()*2;
			
		}
		
		this.numOfBugs = bugCount;
	}
	



	public String getFeederType() {
		return feederType;
	}


	public void setFeederType(String feederInput) {
		String feeder;
		try
		{
			String feederIn = feederInput;
			char c = feederIn.charAt(0);
			
	
			if (c == 'c' || c == 'C')
			{
				feeder = "crickets";
			}
			else
			{
				feeder = "worms";
			}
				
			
		}
		catch (Exception exception)
		{
			feeder = "worms";
		}
		this.feederType = feeder;
		
	}
	
	
	
	
	

}
