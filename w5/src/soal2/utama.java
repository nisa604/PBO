package soal2;
/*import java.util.Scanner;
*/
public class utama {

	public static void main(String[] args) {
		System.out.println("Daftar menu ");
		System.out.println("------------------------------");
		resto menu = new resto();
		menu.tambahMenuMakanan("1. Batagor", 5_000);
		resto.nextId();
		menu.tambahMenuMakanan("2. Roti bakar", 12_000);
		resto.nextId();
		menu.tambahMenuMakanan("3. indomie+telor", 10_000);
		resto.nextId();
		menu.tambahMenuMakanan("4. Kwe", 12_000);
		resto.nextId();
	/*	menu.PemesananMakanan(null, 0, 0);
		*/
		
		menu.tampilMenuMakanan();

	}

}
