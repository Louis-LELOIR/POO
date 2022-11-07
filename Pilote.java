public class Pilote {
  private String nom;
  private int age;

  public Pilote(String nom, int age) {
    this.nom = nom;
    this.age = age;
  }

  public void conduire() {
    System.out.println(this.nom + " est entrain de conduire ");
  }

  public String getNom() {
    return this.nom;
  }
}