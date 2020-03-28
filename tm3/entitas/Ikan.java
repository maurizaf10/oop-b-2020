package entitas;

public class Ikan extends Hewan{
	private String statusGantiAir;

    public Ikan(){
        super();
        this.statusGantiAir = "Belum";
    }
    public Ikan(String statusGantiAir) {
        super();
        this.statusGantiAir = statusGantiAir;
    }
    public void cetak() {
    	System.out.println("=============================");
        System.out.println("Id : " + getId());
        System.out.println("Pemilik : " + getPemilik());
        System.out.println("Status Ganti Air : " + getStatusGantiAir());
    }
    // setter
    public void setStatusGantiAir(String statusGantiAir){
    	this.statusGantiAir = statusGantiAir; 
    }
    // getter
    public String getStatusGantiAir(){
    	return statusGantiAir;
    }
}