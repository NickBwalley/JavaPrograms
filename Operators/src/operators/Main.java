package operators;

public class Main {

	public static void main(String[] args) {
		//unaryOperator();
		leftShiftOperator();
		rightShiftOperator();

	}
	
	public static void unaryOperator() {
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10
		
		System.out.println("----------------");
		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21
		
		System.out.println("-----------------");
		int i=10;  
		int j=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~i);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~j);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  
	}
	
	public static void arithmeticOperator() {
		int a=10;  
		int b=5;  
		System.out.println(a+b);//15  
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		System.out.println(a%b);//0  
		System.out.println("---------------");
		
	}
	public static void leftShiftOperator() {
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
		System.out.println(4<<4);
		System.out.println("---------------------");
	}
	public static void rightShiftOperator() {
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2
		// >> vs >>> operator
	    System.out.println(20>>2);  
	    System.out.println(20>>>2);  
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  
	    //In a digital data bit string, the MSB is a bit of the highest digit, 
	    //and the LSB is a bit of the lowest digit. ...  
	    //For example, 99 in the decimal system is expressed as (MSB)01100011(LSB) in the binary system. 
	    //In this case, the MSB is 0 and the LSB is 1..
	}
	

}

//OperatorType	Category				Precedence
//Unary			postfix					expr++ expr--
//				prefix					++expr --expr +expr -expr ~ !
//Arithmetic	multiplicative			* / %
//				additive				+ -
//Shift			shift					<< >> >>>
//Relational	comparison				< > <= >= instanceof
//				equality				== !=
//Bitwise		bitwise AND				&
//				bitwise exclusive OR	^
//				bitwise inclusive OR	|
//Logical		logical AND				&&
//				logical OR				||
//Ternary		ternary					? :
//Assignment	assignment				= += -= *= /= %= &= ^= |= <<= >>= >>>=

