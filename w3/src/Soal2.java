import java.util.Scanner;
public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("==================");
		for(int i=0;i<3;i++) {
			String s = input.next();
			int angka = input.nextInt();
			System.out.printf("%-15s",s);
			System.out.printf("%03d\n",angka);
		}
		System.out.println("==================");
	}
}
