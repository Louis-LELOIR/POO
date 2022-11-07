public class Voiture {
  private String modele;
  private int prix;
  private Pilote pilote;

  public Voiture(String modele, int prix, Pilote pilote) {
    this.modele = modele;
    this.prix = prix;
    this.pilote = pilote;
  }

  public void demarrer() {
    System.out.println("La voiture démarre.");
  }

  public void arret() {
    System.out.println("La voiture est arretée.");
  }

  public void deplacer() {
    System.out.println("La voiture se déplace.");
  }

  public void conduire() {
    System.out.println(pilote.getNom() + " conduit une voiture " + modele + "...");
  }
}