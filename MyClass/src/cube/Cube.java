package cube;

public class Cube {
	int length; 
	int height;
	int breadth;
	
	public int getVolume() {
		return (length * height * breadth);
	}
	Cube () {
		length = 10;
		height = 20;
		breadth = 30;
	}

}
