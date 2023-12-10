package pk;

import java.util.List;

public class Joueur extends EquipeFoot implements Comparable<EquipeFoot> {
	private String NomJoueur;
	private List<EquipeFoot> tab;
	public Joueur(String entraineur, String nom, int id, String nomJoueur, List<EquipeFoot> tab) {
		super(entraineur, nom, id);
		NomJoueur = nomJoueur;
		this.setTab(tab);
	}
	public int comapreTo(Joueur e3) {
		return this.NomJoueur.compareTo(e3.NomJoueur);
	}
	public List<EquipeFoot> getTab() {
		return tab;
	}
	public void setTab(List<EquipeFoot> tab) {
		this.tab = tab;
	}
}
