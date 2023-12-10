package pk;

public class EquipeFoot implements Comparable<EquipeFoot> {
	private String entraineur;
	private String nom;
	private int id;
	public EquipeFoot(String entraineur, String nom, int id) {
		super();
		this.entraineur = entraineur;
		this.nom = nom;
		this.id = id;
	}
	@Override
	public int compareTo(EquipeFoot e1) {
		return this.nom.compareTo(e1.nom); 
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
