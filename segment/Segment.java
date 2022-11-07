package segment;

public class Segment {
  //les 2 extremites du segment
  pr ivate int extr1;
  private int extr2;

  public Segment(int ext1, int ext2) {
    this.ordonne(ext1, ext2);
  }
  p

    if (ext1 >= ext2) {
      this.extr1 = ext2;
      this.extr2 = ext1;
    } else {
      this.extr1 = ext1;
      this.extr2 = ext2;
    }
  }

  public int calculerLongueur(){
    return this.extr2 - this.ex tr1 ;
  }

  public boolean appartient(int x){
    return (x >= this.extr1 && x <= this.extr2);
  }

  public int getExtr1(){
    return this.extr1;
  }
  public int getExtr2(){
    return this.extr2;
  }
  public void setExtr1(int newInput){
    this.extr1 = newInput;
  }
  public void setExtr2(int newInput){
    this.extr2 = newInput;
  }
  public String toString(){
    return "abscisse 1 = " + extr1 + "abscisse 2 = " + extr2;
  }
}  

   

   

   

   