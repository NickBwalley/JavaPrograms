package timeClass2;

public class TimeClass {
	private int hour = 9;
	private int minute = 9;
	private int second = 9;
	
	public void setTime(int hour, int minute, int second) {
		this.hour = ((hour>=0 && hour< 24)? hour : 0);
		this.minute = ((minute>=0 && minute<60)? minute : 0);
		this.second = ((second>=0 && second<60)? second : 0);
	}
	
	public String toMillitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	public String timeToString() {
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour < 12)?hour:hour%12), minute, second, (hour>12?"PM":"AM"));
	}
}
