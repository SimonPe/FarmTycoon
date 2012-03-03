package domain;

import java.util.Date;

public class Clock {
	private final long STARTTIME = 1325397600L; // 1 jan. 2012 6:00
	private double multiplier;
	private long offset;
	
	public Clock(){
		this(1);
	}
	public Clock(double multiplier){
		this.multiplier = multiplier;
		this.offset=new Date().getTime();
	}
	
	public long getTime(){
		long delta = new Date().getTime()-offset;
		return (long) (delta*multiplier) + STARTTIME;
	}
	public Date getDate(){
		return new Date(this.getTime());
	}
	public void setMultiplier(double multiplier){
		//recalculate offset
		this.offset = (long) (((new Date().getTime()*(multiplier-this.multiplier))+this.offset*this.multiplier)/multiplier);
		this.multiplier = multiplier;
	}
	public void setTime(Date date){
		setTime(date.getTime());
	}
	public void setTime(long time){
		this.offset = new Date().getTime() - (long) ((time - STARTTIME)/multiplier);
	}
}