package SK3;
import java.util.Scanner;

public class Numbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intList;
		int size;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nHow many integers do you want to sort? ");
		size = scan.nextInt();
		intList = new int[size];
		
		System.out.println("\nEnter the numbers . . ");
		for(int i = 0; i<size; i++)
			intList[i] = scan.nextInt();
		Sorting.selectionSort(intList);
		
		System.out.println("\nEnter the numbers . . ");
		for(int i = 0; i<size; i++)
			System.out.print(intList[i] + " ");
		System.out.println ();	
	}

}
