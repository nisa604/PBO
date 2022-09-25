package soal2;

import java.util.Scanner;

public class resto{
	private DaftarMakanan menu;
	private static byte id=0;
	
	resto() {
		menu = new DaftarMakanan();
	}
	public void tambahMenu(String nama, double harga, int stok) {
		menu.setNamaMakanan(nama, id);
		menu.setHargaMakanan(harga, id);
		menu.setStok(stok, id);
	}
	public boolean IsOutOfStock(int id) {
		if(menu.getStok(id)==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void nextId() {
		id++;
	}
	public void jumlahMakanan(int id,int jumlah) {
		int idMenu = (byte) id;
		double harga;
		harga = jumlah*menu.getHargaMakanan(idMenu);
		System.out.println("Total pesanan "+harga);
	}
	public void pesanMakanan(int id, int jumlah) {
		id=id-1;
		int idMenu=(byte) id;
		if(jumlah<0)
			System.out.println("jumlah ga boleh kurang dari 0");
		if((menu.getStok(idMenu)-jumlah)<0)
			System.out.println("Mohon maaf stok tidak cukup");
		else {
			System.out.println(menu.getNamaMakanan(idMenu)+"sebanyak"+jumlah);
			menu.kurangStok(idMenu, jumlah);
			jumlahMakanan(idMenu, jumlah);
			System.out.println("-------------------------");
		}
	}
	public void pesan() {
		byte a,b;
		Scanner input = new Scanner(System.in);
		tampilMenu();
		System.out.println();
		System.out.println("No menu : ");
		a=input.nextByte();
		System.out.println("Jumlah pesanan : ");
		b=input.nextByte();
		pesanMakanan(a,b);
	}
	public void tampilMenu() {
		String status = "Habis";
		System.out.println("--------Menu Makanan--------");
		for(byte i=0;i<=id;i++) {
			if(!IsOutOfStock(i)) {
				System.out.printf("%-2d. %-15s %-15d", i+1, menu.getNamaMakanan(i), menu.getStok(i));
				System.out.println("Rp. "+menu.getHargaMakanan(i));
			}else {
				System.out.printf("%-2d. %-15s %-15s", i+1, menu.getNamaMakanan(i), status);
				System.out.println("Rp. " + menu.getHargaMakanan(i));
			}
		}
	}
}