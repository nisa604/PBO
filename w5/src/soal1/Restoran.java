package soal1;

public class Restoran {
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	public static byte id=0;
	
	public void setNamaMakanan(String[] nama_makanan) {
		// TODO Auto-generated method stub
		this.nama_makanan = nama_makanan;
	}
	public String[] getNamaMakanan() {
		return this.nama_makanan;
	}
	public void setHargaMakanan(double[] harga_makanan) {
		this.harga_makanan = harga_makanan;
	}
	public double[] getHargaMakanan() {
		return harga_makanan;
	}
	public void setStok(int[] stok) {
		this.stok = stok;
	}
	public int[] getStok() {
		return stok;
	}
	public Restoran() {
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}
	
	public void tambahMenuMakanan (String nama, double harga, int stok) {
		this.nama_makanan[id] = nama;
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
	}
	public void tampilMenuMakanan () {
		for(int i=0; i<=id; i++) {
			if(!isOutOfStock(i)) {
				System.out.println(nama_makanan[i] + "[" +stok[i]+ "]" + "\tRp. " +harga_makanan[i]);
			}
		}
	}
	public boolean isOutOfStock(int id) {
		if(stok[id] == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static void nextId() {
		id++;
	}

}
