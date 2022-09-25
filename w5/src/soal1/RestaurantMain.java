package soal1;

public class RestaurantMain {

	public static void main(String[] args) {
		Restoran menu = new Restoran();
		menu.tambahMenuMakanan("Bala-bala", 1_000, 20);
		Restoran.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restoran.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 15);
		Restoran.nextId();
		menu.tambahMenuMakanan("Melon", 1_000, 20);
		Restoran.nextId();
	/*	menu.PemesananMakanan(null, 0, 0);
		*/
		
		menu.tampilMenuMakanan();

	}

}
