package defaultconstructors;

public class Cube {
	int length; 
	int height;
	int breadth;
	
	public int getVolume() {
		return (length * height * breadth);
	}
	Cube () { //default constructor
		length = 10;
		height = 20;
		breadth = 30;
	}
	
	Cube(int l, int b, int h) {
		length = l;
		height = h;
		breadth = b;
	}
	

}
