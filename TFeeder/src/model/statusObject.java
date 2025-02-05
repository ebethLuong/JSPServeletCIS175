package model;

public class statusObject {
	private double daysSince;
	private double diam;
	private double daysBetween;
	private String feederMessage;
	
	public statusObject()
	{
		
	}
	
	public statusObject(double daysSince, double diam) {
		super();
		this.daysSince = daysSince;
		setDaysSince(daysSince);
		this.diam = diam;
		setDaysBetween();
		setFeederMessage();
	}

	public double getDaysSince() {
		return daysSince;
	}

	public void setDaysSince(double days) {
		this.daysSince = days;
	}

	public double getDiam() {
		return diam;
	}

	public void setDiam(double diam) {
		this.diam = diam;
	}

	public double getDaysBetween() {
		return daysBetween;
	}

	public void setDaysBetween() {
		
		int daysBW = 0;
		if(getDiam() < 0.5) daysBW = 1;
		else if (getDiam() >= 0.5 && getDiam() < 1.5) daysBW = 3;
		else if (getDiam() >= 1.5 && getDiam() < 2.5) daysBW = 7;
		else if (getDiam() >= 2.5 && getDiam() < 4) daysBW = 14;
		else daysBW = 21;			
		
		this.daysBetween = daysBW;
	}

	public String getFeederMessage() 
	{
		
		return feederMessage;
	}
	public void setFeederMessage() {
		
		
		double daysUntilNextSnac = getDaysBetween() - getDaysSince();
		if (daysUntilNextSnac > 0) 
		this.feederMessage = "Feed the spider in " + daysUntilNextSnac + " days.";
		else
		this.feederMessage = "Yes your spider is hungry.";
		
	}
	
	
	
	
	

}
