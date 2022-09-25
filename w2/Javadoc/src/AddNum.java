import java.io.*;

/**
<h1>Add Two Numbers!</h1>
The AddNum program implementans an application
Simply add two given integer numbers and prints
the output on the screen.
<p>
<b>Note:</b> Giving proper comments in your program makes it more user friendly and it is assumed as a high quality code.
user friendly and it is assumed as a high quality code.

@author : Nurul Anisah
@version : 1.0
@since : 2022-08-29
*/

public class AddNum {
	/** 
	 * This method is used to add two integers. This is
	 * a the simplest form of a class method, just to
	 * show the usage of various javadoc tags
	 * @param numA this the first parameter to AddNum method
	 * @param numB this the second parameter to AddNum method
	 * @return int this returns sum of numA and numB 
	 */
	public int addNum(int numA, int numB) {
		return numA +numB;
	}
	
	/**
	 * this is the main method which use of addNum method.
	 * @param args usused.
	 * @exception IOException on input error.
	 * @see IOException
	 */
	
	public static void main(String args[]) throws IOException {
		AddNum obj = new addNum();
		int sum = obj.addNum(10,20);
	
	system.out.println("Sum of 10 and 20 is : " +sum); 
	}
}

