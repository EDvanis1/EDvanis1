package lmms;

public class Essais {

    public static void main(String[] args) {
  
      String nom ;
      nom = "Amani";
      String prenom = "Ahodjinan EDvanis";
      int age = 19;
      System.out.println("Mon nom est " + nom + " et j'ai comme prenoms "+ prenom + ", cette année j'ai "+ age +" ans");

      int a = 5;
      int b = 2;
      float c = (float) a/b;
      System.out.println("Le resultat est "+ c);

      String favoriteCity = "Buenos Aires";
      int numberOfTrips = 5;
      String story = "I've traveled to " + favoriteCity+ "" +numberOfTrips+ " time!";
      System.out.println(story);

      System.out.println("Hello World !");

      String exemple = "hello";
      exemple = exemple.toUpperCase();
      exemple = exemple.replace("HELL", "YEAH");
      System.out.println(exemple);
      

    }
}

