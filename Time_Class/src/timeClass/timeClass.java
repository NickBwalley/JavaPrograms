package timeClass;

public class timeClass {
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h, int m, int s) {
		hour = ((h>=0 && h<24) ? h : 0);
		minute = ((m>=0 && m<60) ? m : 0);
		second = ((s>=0 && s<60) ? s : 0);
	}
	
	public String toMillitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

}
