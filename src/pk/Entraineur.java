package pk;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Entraineur extends EquipeFoot{
	EquipeFoot[] tab2 = new EquipeFoot[3];

	public Entraineur(String entraineur, String nom, int id, EquipeFoot[] tab2) {
		super(entraineur, nom, id);
		this.tab2 = tab2;
	}
	//remplissage de tableau
 public void remplire() {
	 tab2[0]= new EquipeFoot("entraineur1","equipe1",123);
	 tab2[1]= new EquipeFoot("entraineur2","equipe2",124);
	 tab2[2]= new EquipeFoot("entraineur3","equipe3",125);
 }
 public void trier(Comparator<EquipeFoot>cmp) {
	 Arrays.sort(tab2,cmp);
 }
 public boolean ajouter(int pos,EquipeFoot e1) {
	 if(pos>=0 && pos<tab2.length) {
		 ArrayList<EquipeFoot> liste= new  ArrayList<EquipeFoot>(Arrays. asList(tab2));
		 liste.add(pos,e1);
		 tab2= liste.toArray(new EquipeFoot[liste.size()]);
	 }
	 throw new IllegalArgumentException("veuillez inserer une position valide");
 }
 public boolean existe(EquipeFoot e2) {
	 for(EquipeFoot e3: tab2) 
		 if(e3.equals(e2))
			 return true;
	 return false;
	 
 }
 public boolean supprimer(EquipeFoot e2) {
	 if(!this.existe(e2)) return false;
	 ArrayList<EquipeFoot> liste= new  ArrayList<EquipeFoot>(Arrays. asList(tab2));
	 liste.remove(e2);
	 tab2=liste.toArray(new EquipeFoot[liste.size()]);
	 return true; 
 }
 public int NbrElement() {
	 int cpt=0;
	 for(EquipeFoot e2: tab2) {
		 if(e2!= null)
			 cpt++;
	 }
	 return cpt;	 
 }
 public void inverser() {
	 ArrayList<EquipeFoot> liste= new  ArrayList<EquipeFoot> (Arrays.asList(tab2));
	 Collections.reverse(liste);
	 tab2=liste.toArray(new  EquipeFoot[liste.size()]);
 }
 public void afficherElements() {
	 System.out.println("Les elements du taleau");
        for(EquipeFoot e2: tab2) {
        	if(e2!=null)
        		System.out.println(e2);
        }	 
 }
 public boolean egalits(EquipeFoot[] e3) {
	 return Arrays.equals(this.tab2, e3);
	 
 }
 }
 
 
 
 

