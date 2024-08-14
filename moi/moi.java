package lmms;
/*
public class moi {
    public static void main(String[] args){
        sayHelloTo("world");
    }
    private static void sayHelloTo(String recipient){
      System.out.println("Hello " + recipient);
    }
  
}**/

/*public class moi {

  public static void main(String[] args){
    int j = 20, i = 0;
    try{
      System.out.println(j/i);
    }
    catch (Exception e){
      System.out.println("L'erreur suivante s'est produite : " + e.getMessage());
    }
  }
}**/

/*import java.util.Scanner;

public class moi {

  public static void main(String[] args){
    int val1;
    System.out.println("Entrez un nombre entier svp");
    Scanner lire = new Scanner(System.in);
    val1 = lire.nextInt();
    if (val1==2) {
      System.out.print("La valeur saisie est corecte");
    }
  }
}**/

/*public class moi {

  public static void main(String[] args){
    sayHelloTo("world");
  }
  
  private static void sayHelloTo(String recipient){
    System.out.println("Hello "+ recipient);
  } 
  public static void
}**/

/*public class moi {

  public static void main(String[] argrs){

   bonjour();

  }

  public static void bonjour(){

    for (int i = 0; i < 10; i++){
      if (i == 2 || i == 5){
        continue;
      }
    }
    System.out.println("Valeur de i : " + i + ".");
  }
}

/*public class moi {

  public static void main(String[] agrs){
      EDvanis(0);
  }

  static void EDvanis(int nomberOfTrees){
    int numbreOfTrees = 0;
    while (numbreOfTrees < 10) {
      numbreOfTrees += 1;
      System.out.println("I planted " + numbreOfTrees + " trees");
    }
    System.out.println("I have a forest!");
  }
}**/

/*
public class moi {
  public static void main(String[] args){

    if (args.length==1){
      sayHelloTo(args[0]);
    }
    else{
      sayHelloTo("World");
    }
  }
  
  private static void sayHelloTo(String recipient){
    System.out.println("Hello " + recipient + " !");
  }
  
}*/

/**
 * moi
 */

/**public class moi {

  //Création de classe en POO 

class Book{
  // propriété d'une classe

  String title;
  String author;
  int numbreOfPage;
  String publisher;

  // Constructeur de la classe Book

  Book(String title, String author, int numbreOfPage, String publisher){
  //Initilise l'attribut title avec la valeur de l'argument title

  this.title = title;
  this.author = author;
  this.numbreOfPage = numbreOfPage;
  this.publisher = publisher;
  //Ou faire:
  
  
  }
}**/

/**
 * moi
 */

 /*public class moi {
 
  public static void main(String[] args) {
    Marque apple = new Marque("apple");
    System.out.println(apple.nom);
    Telephone iphone = new Telephone(34000, "iphone", apple);
    System.out.println(iphone.pixels);
  }

 static class Telephone{
  int pixels;
  String nom; 
  Marque marque;

  public Telephone(int pixels, String nom, Marque marque){
    this.pixels = pixels;
    this.nom = nom;
    this.marque = marque;
  }
 }

 static class Marque{
  String nom;

  public Marque(String nom){
    this.nom = nom;
  }
 }
 }**/

 /**
  * moi
  */
 /*public class moi {
 
  public class FigureGeometrique{
    private int x;
    private int y;
    public void moveTo(int newX, int newY){
      this.x = newX;
      this.y = newY;
    }
  }

  public class Carre extends FigureGeometrique{ 
    private long cote;
    public long getCote(){
      return cote;
    }
    public long getperimetre(){
      return 4*cote;
    }
  }
  public class moi{
    public static void main(String[] args) {
      FigureGeometrique carre = new FigureGeometrique();
      figure.moveTo(1, 1);
      Carre carre = new Carre();
      carre.moveTo(2, 2);
    }
  }
 }**/

 /*public class moi {
 
  static class EDvanis{
    String nom;
    String prenoms;
    int age;

    public EDvanis(String nom, String prenoms, int age){
      this.nom = nom;
      this.prenoms = prenoms;
      this.age = age;
    }
  }
  
  public static void main(String[] args) {
    EDvanis edgar = new EDvanis("Amani", "Ahodjinan", 19);
    System.out.println(edgar.prenoms);
  }
 }*/

 /*public class moi {
 
  public static void main(String[] args) {
    Voiture voiture = new Voiture();
    voiture.start();

    Bateau bateau = new Bateau();
    bateau.start();
  }

  static class Vehicule{
    void start(){
      System.out.println("Vrooom");
    }
  }

  static class Voiture extends Vehicule{

    @Override
   void start(){
    super.start();
    allumerFeux();

   }
  }

  static class Bateau extends Vehicule{

  }

  static void allumerFeux(){
    System.out.println("Allumage feux");
  }
 }*/

 /*public class moi {
 
  public static void main(String[] args) {
    
    int[] monTableau = new int[] {6, 2, 3, 7, 3, 4, 1};

    monTableau[1] = 9;

    for (int i = 0; i < monTableau.length; i++) {
      System.out.println(monTableau[i]);
    }
    
  }
 }*/

  public class moi {
  
    public static void main(String[] args) {
      int x=3;
      int y=20;
  
      System.out.println(x>y);
    }
  }
