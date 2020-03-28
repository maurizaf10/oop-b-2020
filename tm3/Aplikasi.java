import entitas.*;
public class Aplikasi{
	public static void main(String args[]){
		Hewan hewan = new Hewan();
		Anjing anjing = new Anjing();
		Ikan ikan = new Ikan();

		hewan.cetak();
		anjing.cetak();
		ikan.cetak();
	}
}