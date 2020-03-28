package entitas;

public class Anjing extends Hewan{
	private String statusSuntikRabies;

    public Anjing() {
        super();
        this.statusSuntikRabies = "Sudah";
    }
    public Anjing(String statusSuntikRabies) {
        super();
        this.statusSuntikRabies = statusSuntikRabies;
    }
    public void cetak() {
    	System.out.println("=============================");
        System.out.println("Id : " + getId());
        System.out.println("Pemilik : " + getPemilik());
        System.out.println("Status Suntik Rabies : " + getStatusSuntikRabies());
    }
    // setter
    public void setStatusSuntikRabies(String statusSuntikRabies){
    	this.statusSuntikRabies = statusSuntikRabies; 
    }
    // getter
    public String getStatusSuntikRabies(){
    	return statusSuntikRabies;
    }
    
}