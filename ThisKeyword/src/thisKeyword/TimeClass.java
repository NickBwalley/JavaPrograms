package thisKeyword;

public class TimeClass {
	private int hour = 1;
	private int minute = 2;
	private int seconds = 3;
	
	public void setTime(int hour, int minute, int seconds) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}
	
	public String getTime() {
		return String.format("%02d:%02d:%02d", hour, minute, seconds);
	}
}
