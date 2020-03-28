package entitas;

public class Hewan{
	private String id;
    private String pemilik;
    private String statusPenitipan;

    public Hewan(){
    	id = "001";
        pemilik = "Zelano";
        statusPenitipan = "ada";
    }
    public Hewan(String id, String pemilik, String statusPenitipan) {
        this.id = id;
        this.pemilik = pemilik;
        this.statusPenitipan = statusPenitipan;
    }
    public void cetak(){
    	System.out.println(id + " : " + pemilik + " : " + statusPenitipan);
    }
    // setter
    public void setId(String id){
        this.id = id;
    }
    public void setPemilik(String pemilik){
    	this.pemilik = pemilik;
    }
    public void setStatusPenitipan(String statusPenitipan){
    	this.statusPenitipan = statusPenitipan;
    }
    // getter
    public String getId(){
    	return id;
    }
    public String getPemilik(){
    	return pemilik;
    }
    public String statusPenitipan(){
    	return statusPenitipan;
    }
    String info(){
        return id = pemilik;
    }
    
    String status(){
        return statusPenitipan;
    }
}