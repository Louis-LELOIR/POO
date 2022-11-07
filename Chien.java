public class Chien {
  private String race;
  private int age;
  private String couleur;

  public Chien(String race, int age, String couleur) {
    this.race = race;
    this.age = age;
    this.couleur = couleur;
  }

  public void aboyer() {
    System.out.println("Ouaf Ouaf");
  }

  public void dormir(){
    System.out.println("ZZzzzzzz....");
  }
}