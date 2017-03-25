
public class CallingMethods {
public static void main(String[]args){
	String river="Mississippi";
	String river1;
	String river2;
	String river3;
	int length;
	System.out.println(river);
	river1="Mississippi".toUpperCase();
	System.out.println(river1);
	river2="MISSISSIPPI".toLowerCase();
	System.out.println(river2);
	river3=river.replace("i","!");
	river3=river.replace("s","$");
	System.out.println(river3);
	length="Mississippi".length();
	System.out.println(length);
}
}
