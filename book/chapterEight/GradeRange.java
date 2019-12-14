//******************************************************
// GradeRange.java
// Demonstrates the use of an array of objects.
//******************************************************

public class GradeRange{
  
  //----------------------------------------------------
  // Create an array of Grade objects and prints them.
  //----------------------------------------------------
  public static void main(String[] args) {
    
    Grade[] grades = {
      new Grade("A", 95), new Grade("A-", 90),
      new Grade("B+", 87), new Grade("B", 85), new Grade("B-", 80), 
      new Grade("C+", 77), new Grade("C", 75), new Grade("C-", 70),
      new Grade("D+", 67), new Grade("D", 65), new Grade("D-", 60),
      new Grade("F", 0)
    };

    for (Grade letterGrade : grades) 
       System.out.println(letterGrade);
    
  }  

}

class Grade {
  
  private String name;
  private int lowerBound;
  
  //-----------------------------------------------------
  // Constructor
  //----------------------------------------------------
  public Grade(String grade, int cutoff) { 
    name = grade;
    lowerBound = cutoff;
  }

  // Return a string representation of this grade
  public String toString() {
    return name + "\t" + lowerBound;
  }
  
  // name mutator
  public void setName(String grade) {
    name = grade;
  }

  // lower bound mutator.
  public void setLowerBound(int cutoff) {
    lowerBound = cutoff;
  }

  // name accesor 
  public String getName() {
    return name;
  }

  // lower bound accesor 
  public int getLowerBound() {
    return lowerBound;
  }
}
