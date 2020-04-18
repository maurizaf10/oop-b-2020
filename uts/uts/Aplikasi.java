package uts;
import java.util.Scanner;
import java.util.Vector;
import java.util.*;

public class Aplikasi {

	Scanner scan = new Scanner(System.in);
	Vector<Mahasiswa> vecMahasiswa = new Vector<Mahasiswa>();	
	
	int menu, nim;
	String nama, kelas;
	
	Mahasiswa m;

	public Aplikasi() {
		do {
			System.out.println("Merekam Data Mahasiswa");
			System.out.println("================");
			System.out.println("1. Tambah Mahasiswa");
			System.out.println("2. Hapus Mahasiswa");
			System.out.println("3. Tampilkan Mahasiswa");
			System.out.println("4. Ubah Mahasiswa");
			System.out.println("5. Exit");
			System.out.print("Pilih >> ");
			menu = scan.nextInt();scan.nextLine();
			if (menu == 1) {
				System.out.print("Masukan nim [8 Angka] : ");
				nim = scan.nextInt();
				scan.nextLine();
				do {
					System.out.print("Masukan nama [3 - 50 huruf] : ");
					nama = scan.nextLine();
				} while (nama.length() < 3 || nama.length() > 50);
				do {
					System.out.print("Pilih kelas [Kelas A|Kelas B|Kelas C|Kelas D] : ");
					kelas = scan.nextLine();
				} while (!kelas.equals("Kelas A") && !kelas.equals("Kelas B") && !kelas.equals("Kelas C") && !kelas.equals("Kelas D"));
				
				// id = "" + Math.abs(rand.nextInt() % 10) + Math.abs(rand.nextInt() % 10) + Math.abs(rand.nextInt() % 10);

				m = new Mahasiswa(nim, nama, kelas);
				vecMahasiswa.add(m);
								
			} else if (menu == 2) {
				viewMahasiswa();
				int index = 0, flag = 0;
				System.out.print("Masukan nama untuk menghapus : ");
				nama = scan.nextLine();
				for (Mahasiswa mahasiswa : vecMahasiswa) {
					if(mahasiswa.getNama().equals(nama)) {
						flag=1;
						vecMahasiswa.remove(index);
						break;
					}
					index++;
				}
				if(flag == 0){
					System.out.println("Data mahasiswa tidak ada!");
					System.out.println("Press enter to continue");
					scan.nextLine();
				}
			} else if (menu == 3) {
				if(vecMahasiswa.size()==0) {
					System.out.println("Data mahasiswa tidak ada!");
					System.out.println("Press enter to continue");
					scan.nextLine();
				}else {
					viewMahasiswa();
				}
							
			}else if(menu == 4) {
				
			}
		} while (menu != 5);
	}

	private void viewMahasiswa() {
		System.out.println("Mahasiswa List");
		System.out.println("===========");
		for (Mahasiswa m : vecMahasiswa) {
			System.out.println(	m.getNim() + " " + m.getNama() + " " + m.getKelas());
		}
		System.out.println("===========");
	}
	
	public static void main(String[] args) {
		new Aplikasi();
	}
}
