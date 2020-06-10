package overLoaded_Constuctors;

public class TimeClass {
	private int hour;
	private int minute;
	private int second;
	
	public TimeClass() {
		this(0,0,0);
	}
	public TimeClass(int h) {
		this(h,0,0);
	}
	public TimeClass(int h, int m) {
		this(h,m,0);
	}
	public TimeClass(int h, int m, int s) {
		setTime(h,m,s);
	}
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	public void setHour(int h) {
		hour = ((h>=0 && h<24) ? h : 0);
	}
	public void setMinute(int m) {
		minute = ((m>=0 && m<24) ? m : 0);
	}
	public void setSecond(int s) {
		second = ((s>=0 && s<24) ? s : 0);
	}
	//return method to return setTime
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	//return toMillitary Time 
	public String toMillitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
}
