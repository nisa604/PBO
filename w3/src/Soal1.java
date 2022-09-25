import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Masukkan string : ");
			s = input.nextLine();
			if(s.length() < 1)
				System.out.println("Tolong masukkan teks");
		} while (s.length() < 1);
		String[] words = s.split(" |\\!|\\,|\\?|\\.|\\_|\\'|\\@");
		int n = words.length;
		
		System.out.println(n);
		for (String w : words) {
			System.out.println(w);
		}
	}

}
