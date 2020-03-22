public class Mahasiswa{
	String nim;
	String nama;
	String kelas;

	public Mahasiswa(){
		nim = "18090103";
		nama = "Farkhan Mauriza";
		kelas = "4B";
	}

	public Mahasiswa(String nim, String nama, String kelas){
		nim = nim;
		this.nama = nama;
		this.kelas = kelas;
	}

	public void cetak(){
		System.out.println("NIM : " + nim);
		System.out.println("Nama : " + nama);
		System.out.println("Kelas : " + kelas);
	}
}