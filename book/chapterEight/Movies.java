import java.text.NumberFormat;

//********************************************************
//  Movies.java 	
//  Demonstrates the use of an array of objects
//********************************************************

public class Movies {

  //------------------------------------------------------
  // Creates a DVDCollection object and adds DVDs to it.
  // Prints reports on the status of the collection.
  //------------------------------------------------------
  public static void main(String[] args) {
    
    DVDCollection movies = new DVDCollection(); // new DVDCollection object called movies
     
    movies.addDVD("The Godfather", "Francis Ford Coppola", 1972, 24.95, true);
    movies.addDVD("District 9", "Neill Blomkamp", 2009, 19.95, false);
    movies.addDVD("Iron Man", "Jon Favreau", 2008, 15.95, false);
    movies.addDVD("All About Eve", "Joseph Mankiewicz", 1950, 17.50, false);
    movies.addDVD("The Matrix", "Andy and Lana Wachowski", 1999, 19.95, true);
    
    System.out.println(movies);
    
    movies.addDVD("Iron Man 2", "Jon Favreau", 2010, 22.99, false);
    movies.addDVD("Casablanca", "Michael Curtiz", 1942, 19.95, false);
    
    System.out.println(movies);
  }
}

class DVDCollection {

    private DVD[] collection; // new array of object type DVD called collection
    private int count;
    private double totalCost;

    //-------------------------------------------------------
    //  Constructor
    //-------------------------------------------------------
    public DVDCollection() {
      collection = new DVD[100]; // 100 nulls of DVD
      count = 0;
      totalCost = 0.0;
    }

    // Adds a DVD to the collection, increasing the size of the collection
    public void addDVD(String title, String director, int year, double cost, boolean bluray) {
      if (count == collection.length)
        increaseSize();

      collection[count] = new DVD(title, director, year, cost, bluray);
      totalCost += cost;
      count++;
    }

    // Returns a report describing the DVD collection
    public String toString() {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String report = "-------------------------------------------------\n";
      report += "My DVD Collection\n\n";

      report += "Number of DVDs: " + count + "\n";
      report += "Total cost: " + fmt.format(totalCost) + "\n";
      report += "Average cost: " + fmt.format(totalCost / count);

      report += "\n\nDVD List:\n\n";

      for (int dvd = 0; dvd < count; dvd++)
        report += collection[dvd].toString() + "\n";

      return report;
    }

    // Increases the capacity of the collection by creating a larger array
    private void increaseSize() {
      DVD[] temp = new DVD[collection.length * 2]; // creates a new array of DVDs twice as big as the current

      for (int dvd = 0; dvd < collection.length; dvd++) // copy each DVD from current collection to new collection
        temp[dvd] = collection[dvd];

      collection = temp; // set object collection variable to new temp array
    }
}

class DVD {

    private String title, director;
    private int year;
    private double cost;
    private boolean bluray;

    public DVD(String title, String director, int year, double cost, boolean bluray) {
      this.title = title;
      this.director = director;
      this.year = year;
      this.cost = cost;
      this.bluray = bluray;
    }

    // returns a string of this DVD
    public String toString() {

      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String description;

      description = fmt.format(cost) + "\t" + year + "\t";
      description += title + "\t" + director;
      if (bluray) {
        description += "\t" + "Blu-ray";
      }

      return description;
    }
}
