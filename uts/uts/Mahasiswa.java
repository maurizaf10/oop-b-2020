package uts;

public class Mahasiswa {

	private int nim;
	private String nama;
	private String kelas;
	

	public Mahasiswa(int nim, String nama, String kelas) {
		super();
		this.nim = nim;
		this.nama = nama;
		this.kelas = kelas;		
	}

	public int getNim() {
		return nim;
	}

	public void setNim(int nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKelas() {
		return kelas;
	}

	public void setKelas(String kelas) {
		this.kelas = kelas;
	}

	
}

