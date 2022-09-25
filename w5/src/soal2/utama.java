package soal2;
import java.util.Scanner;

public class utama {

	public static void main(String[] args) {
	resto menu = new resto();
	Scanner input = new Scanner(System.in);
	String keputusan = "y";
	menu.tambahMenu("Batagor", 5_000, 15);
	resto.nextId();
	menu.tambahMenu("Roti bakar", 12_000, 15);
	resto.nextId();
	menu.tambahMenu("Indomie+telor", 10_000, 15);
	resto.nextId();
	menu.tambahMenu("Kwetiau", 12_000, 15);
	resto.nextId();
	menu.tambahMenu("Nasi Goreng", 5_000, 15);
	resto.nextId();
	menu.tambahMenu("Teh Manis", 5_000, 15);
	resto.nextId();
	menu.tambahMenu("Air Mineral", 5_000, 15);
	resto.nextId();
	menu.tambahMenu("Jus Alpukat", 5_000, 15);
	resto.nextId();
	menu.tambahMenu("Teh Botol", 5_000, 15);
	resto.nextId();
	menu.tambahMenu("Kopi", 5_000, 15);
	resto.nextId();
	menu.pesan();
	
	while(keputusan.equals("y")) {
		System.out.println("Pesan lagi? (y/n)");
		keputusan=input.next();
		if(keputusan.equals("y")) {
			menu.pesan();
		}else {
			System.out.println("Terima kasih");
			break;
		}
	}
	}

}
