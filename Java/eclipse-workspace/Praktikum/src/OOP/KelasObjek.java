package OOP;

public class KelasObjek {
	private int Panjang;
	private int Lebar;
	private int Luas;
	
	public void KelasObjek() {
		Luas = Panjang*Lebar;
	}
	public void setPanjang (int Panjang) {
		this.Panjang = Panjang;
	}
	public void setLebar (int Lebar) {
		this.Lebar = Lebar;
	}
	public int getPanjang() {
		return Panjang;
	}
	public int getLebar() {
		return Lebar;
	}
	public int getLuas() {
		return Luas;
	}
	
}
