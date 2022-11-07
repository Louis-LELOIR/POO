import etudiant.Etudiant;
import segment.Segment;

class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    //Ch ien monPetitCaniche = new Chien("Caniche", 3, "Blanc");
    //mo nPetitCaniche.aboyer();
    //mo nPetitCaniche.dormir();

    // Voiture rouge = new Voiture("Ferrari Enzo", 1500000000, new Pilote);
    // choumiPilote.demarrer();
    // choumiPilote.conduire();

    // Etudiant etudiant = new Etudiant("Philippe");
    // etudiant.travailler();
    // etudiant.seReposer();
    Segment segment = new Segment(10, 5);
    System.out.println(segment.calculerLongueur());
    System.out.println(segment.appartient(4));

    
  }

  