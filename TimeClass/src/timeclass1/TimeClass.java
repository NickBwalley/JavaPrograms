package timeclass1;

public class TimeClass {
	private int hour;
	private int minute;
	private int seconds;
	
	//method return toMillitary time
	public void setMillitaryTime(int h, int m, int s) {
		hour = ((h>=0 && h<24)? h : 0);
		minute = ((m>=0 && m<60) ? m : 0);
		seconds = ((s>=0 && s<60) ? s : 0);
	}
	public String getMillitaryTime() {
		return String.format("%02d:%02d:%02d ", hour, minute, seconds);
	}

	//method return normalTime
	public String getNormalTime() {
		return String.format("%d:%02d:%02d %s", ((hour==0 || hour==12) ? hour : hour%12), minute, seconds, (hour < 12 ? "AM" : "PM"));
	}
}
