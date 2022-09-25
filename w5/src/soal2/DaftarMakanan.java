package soal2;

public class DaftarMakanan {
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	
	public String getNamaMakanan(int id) {
		return nama_makanan[id];
	}
	public void setNamaMakanan(String nama_makanan, int id) {
		this.nama_makanan[id] = nama_makanan;
	}
	public void setHargaMakanan(double harga_makanan, int id) {
		this.harga_makanan[id] = harga_makanan;
	}
	public double getHargaMakanan(int id) {
		return harga_makanan[id];
	}
	public void setStok(int stok, int id) {
		this.stok[id] = stok;
	}
	public int getStok(int id) {
		return stok[id];
	}
	DaftarMakanan() {
		this.nama_makanan = new String[10];
		this.harga_makanan = new double[10];
		this.stok = new int[10];
	}
	
	public void kurangStok(int id, int jumlah) {
		this.stok[id] -= jumlah;
	}
}
