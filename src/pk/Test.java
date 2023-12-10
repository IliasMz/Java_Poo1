package pk;

public class Test {

	public static void main(String[] args) {
		Joueur joueur1 = new Joueur("Entraineur1", "Equipe1", 1, "Joueur1", null);
        Joueur joueur2 = new Joueur("Entraineur2", "Equipe2", 2, "Joueur2", null);
        Joueur joueur3 = new Joueur("Entraineur3", "Equipe3", 3, "Joueur3", null);
        EquipeFoot[] e3= new EquipeFoot[3];
        Entraineur e1 = new Entraineur("entraineur1","equipe3",124,e3);
        System.out.println("remplire votre tableau");
        e1.remplire();
        System.out.println("avant le tri");
        e1.afficherElements();
        /*e1.ajouter(0, joueur1);
        System.out.println("apres l'ajout du joueur: ");
        e1.afficherElements();*/
        EquipeFoot equipeTest = new EquipeFoot("Entraineur2", "Equipe2", 2);
        System.out.println("L'équipe existe : " + e1.existe(equipeTest));

        e1.supprimer(equipeTest);

        // Afficher les éléments après la suppression
        System.out.println("Après la suppression de l'équipe 2 :");
        e1.afficherElements();
        

	}

}
