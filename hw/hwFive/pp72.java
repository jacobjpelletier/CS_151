/*
Problem 2. Textbook 9th edition, pages 349/350 Programming projects 7.2 and 7.3 (they go together).
*/

import java.util.Scanner;

public class pp72
{
    //------------------------------------------------------------------------------------------------------------------
    //  TEST SUITE: tests Student, Address, and Course objects
    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args)
    {
        Scanner setNumData = new Scanner(System.in);
        Scanner setChoice = new Scanner(System.in);
        Scanner setStringData = new Scanner(System.in);

        int setTest;
        double setScore;
        String setString;
        String choice;

        //--------------------------------------------------------------------------------------------------------------
        //  TEST A: creates two new addresses with Adress object
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nWELCOME TO HOMEWORK FIVE PROBLEM TWO TEST SUITE!");
        System.out.println("\n\n\nTEST A:");
        System.out.println("Creating new Address objects. . .");
        Address school = new Address("123 Abc Ave.", "Abcville", "CT", "06000");
        Address jHome = new Address("456 Xyz Ave.", "Xyzville", "CT", "06999");
        System.out.println("\nSchool address: \n" + school.toString());
        System.out.println("\nHome address: \n" + jHome.toString());
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------
        //  TEST B: 1. creates a new student with Student object using default constructor (no test score arguments).
        //          2. tests toString method
        //          3. get score from defaultly constructed object
        //          4. get avaerage of defaultly constructed object
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("TEST B:");
        System.out.println("Creating new Student object with default parameters. . .\n");
        Student jacob = new Student("Jacob", "Pelletier", jHome, school);
        System.out.println(jacob + "\n");

        //--------------------------------------------------------------------------------------------------------------
        //  TEST C: 1. get user data that refers to which test number user wants to edit
        //          2. edit test score
        //          3. get new test average
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("TEST C:");
        // test score data methods
        System.out.print("\nTesting Student Object Score Methods. . .\n");
        System.out.println("Score you requested: " + jacob.getTestScore());
        System.out.print("Enter test you would like to edit (1, 2, or 3): ");
        setTest = setNumData.nextInt();
        System.out.print("Enter a new score: ");
        setScore = setNumData.nextDouble();
        jacob.setTestScore(setTest, setScore);
        System.out.println("jacob's test average: " + jacob.getAverage() + "\n");
        // test student name methods
        System.out.print("Testing Student Object Name Methods. . .\n");
        System.out.println("Ok, Let's change jacob's name. . .");
        System.out.print("Enter a new first name: ");
        setString = setStringData.nextLine();
        jacob.setFirstName(setString);
        System.out.println("New first name is: " + jacob.getFirstName());
        System.out.print("Enter a new last name: ");
        setString = setStringData.nextLine();
        jacob.setLastName(setString);
        System.out.println("New last name is: " + jacob.getLastName());
        // test student address methods
        System.out.print("\nTesting Student Object Address Methods. . .\n");
        System.out.println("Ok, Let's change jacob's address. . .");
        Address newSchool = new Address("zzz Road.", "City", "AZ", "86000");
        Address newHome = new Address("aaa Lane", "Town", "AZ", "86999");
        jacob.setSchoolAddress(newSchool);
        jacob.setHomeAddress(newHome);
        System.out.println("New school address is: " + jacob.getSchoolAddress() + ".");
        System.out.println("New home address is: " + jacob.getHomeAddress() + ".");
        // toString of modified object
        System.out.println("\nReturning same default Student object from before but modified. . .\n");
        System.out.println(jacob);


        //--------------------------------------------------------------------------------------------------------------
        //  TEST D: 1. creates 5 new student objects with constructor which takes in student scores
        //          2. creates a course named calculus
        //          3. adds 5 new student objects to course roll
        //          4. gets course roll
        //          5. gets course class average
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("\nTEST D:");
        System.out.println("Creating new Student ojbects. . .\n");
        Student calcStudent1 = new Student("one", "1", jHome, school, 65, 72, 76);
        Student calcStudent2 = new Student("two", "2", jHome, school, 90, 90, 86);
        Student calcStudent3 = new Student("three", "3", jHome, school, 84, 80, 94);
        Student calcStudent4 = new Student("four", "4", jHome, school, 78, 86, 80);
        Student calcStudent5 = new Student("five", "5", jHome, school, 65, 75, 95);

        System.out.println("Creating new Course object. . .\n");
        Course calculus = new Course("calculus");

        System.out.println("Adding new Student objects to Course object. . .\n");
        calculus.addStudent(calcStudent1);
        calculus.addStudent(calcStudent2);
        calculus.addStudent(calcStudent3);
        calculus.addStudent(calcStudent4);
        calculus.addStudent(calcStudent5);

        System.out.print("See class roll? (\"y\" or \"n\"): ");
        choice = setChoice.nextLine();
        if (choice.equals("y"))
            System.out.println("Calculus class roll: " + calculus.roll());
        else
            System.out.println("You chose not to see class roll.");

        System.out.print("See class average? (\"y\" or \"n\"): ");
        choice = setChoice.nextLine();
        if (choice.equals("y"))
            System.out.println("Calculus class average: " + calculus.getAverage() + "\n");
        else
            System.out.println("You chose not to see class average.\n");
    }
}

class Student
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private double test1, test2, test3, testAverage;

    //------------------------------------------------------------------------------------------------------------------
    //  Constructor: Set up this student with the specified values
    //------------------------------------------------------------------------------------------------------------------
    public Student(String first, String last, Address home, Address school, double score1, double score2,
                   double score3)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test1 = score1;
        test2 = score2;
        test3 = score3;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  Alternative constructor: Set up this student with the specified values, with default test scores
    //------------------------------------------------------------------------------------------------------------------
    public Student(String first, String last, Address home, Address school)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test1 = 0d;
        test2 = 0d;
        test3 = 0d;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  Gets test score
    //------------------------------------------------------------------------------------------------------------------
    public double getTestScore()
    {
        int testToAssess;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter test number to see score (1, 2, or 3): ");
        testToAssess = scan.nextInt();

        if(testToAssess == 1)
            return (test1);
        else
            if (testToAssess == 2)
                return (test2);
            else
                return(test3);
    }

    //------------------------------------------------------------------------------------------------------------------
    //  Sets new score for a test
    //------------------------------------------------------------------------------------------------------------------
    public void setTestScore(int testNum, double newScore)
    {
        if(testNum == 1)
            test1 = newScore;
        else
            if (testNum == 2)
                test2 = newScore;
            else
                test3 = newScore;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Returns average of test scores
    //------------------------------------------------------------------------------------------------------------------
    public double getAverage()
    {
        testAverage = (test1 + test2 + test3)/3;
        return testAverage;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  Set new first name
    //------------------------------------------------------------------------------------------------------------------
    public void setFirstName(String first)
    {
        firstName = first;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Get first name
    //------------------------------------------------------------------------------------------------------------------
    public String getFirstName()
    {
        return firstName;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  Set new last name
    //------------------------------------------------------------------------------------------------------------------
    public void setLastName(String last)
    {
        lastName = last;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Get last name
    //------------------------------------------------------------------------------------------------------------------
    public String getLastName()
    {
        return lastName;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  Set new home address
    //------------------------------------------------------------------------------------------------------------------
    public void setHomeAddress(Address home)
    {
        homeAddress = home;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Get home address
    //------------------------------------------------------------------------------------------------------------------
    public Address getHomeAddress()
    {
        return homeAddress;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  Set new school address
    //------------------------------------------------------------------------------------------------------------------
    public void setSchoolAddress(Address school)
    {
        schoolAddress = school;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Get school address
    //------------------------------------------------------------------------------------------------------------------
    public Address getSchoolAddress()
    {
        return schoolAddress;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  Returns a string description of this Student object
    //------------------------------------------------------------------------------------------------------------------
    public String toString()
    {
        String result;

        result = "NAME: " + firstName + " " + lastName + "\n";
        result += "HOME ADDRESS: " + homeAddress + "\n";
        result += "SCHOOL ADDRESS: " + schoolAddress + "\n";
        result += "GRADES:\t" + "Test One: " + test1 + "\t" + "Test Two: " + test2 + "\t" + "Test Three: " + test3 + "\t";

        return result;
    }
}

class Address
{
    private String streetAddress, city, state, zipCode;

    //------------------------------------------------------------------------------------------------------------------
    //  Constructor: Sets up this address with the specified data
    //------------------------------------------------------------------------------------------------------------------
    public Address (String street, String town, String st, String zip)
    {
        streetAddress = street;
        city = town;
        state = st;
        zipCode = zip;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  Returns a description of this Address object
    //------------------------------------------------------------------------------------------------------------------
    public String toString()
    {
        String result;

        result = streetAddress + ", ";
        result += city + ", " + state + " " + zipCode;

        return result;
    }
}

class Course
{
   private String course;
   private int enrollment;
   private double classAverage;
   private Student student1, student2, student3, student4, student5;

   //-------------------------------------------------------------------------------------------------------------------
   //  Constructor: sets up a Course object given some String input (course name)
   //-------------------------------------------------------------------------------------------------------------------
   public Course(String courseName)
   {
        course = courseName;
        enrollment = 0;
   }
   //-------------------------------------------------------------------------------------------------------------------
   //  Adds new student to course. works for up to five students.
   //-------------------------------------------------------------------------------------------------------------------
   public void addStudent(Student studentName)
   {
        enrollment++;
        switch(enrollment)
        {
            case 1:
                student1 = studentName;
                break;
            case 2:
                student2 = studentName;
                break;
            case 3:
                student3 = studentName;
                break;
            case 4:
                student4 = studentName;
                break;
            case 5:
                student5 = studentName;
                break;
        }
   }
   //-------------------------------------------------------------------------------------------------------------------
   //  Returns roll of all student enrolled
   //-------------------------------------------------------------------------------------------------------------------
   public String roll() {
       return("\nTotal Enrollment: " + enrollment + "\n\nStudents: \n\n" + student1 + ",\n\n" + student2 + ",\n\n"
               + student3 + ",\n\n" + student4 + ",\n\n" + student5 + ".\n\n");
   }

   //-------------------------------------------------------------------------------------------------------------------
   //  Returns class average
   //-------------------------------------------------------------------------------------------------------------------
   public double getAverage()
   {
       classAverage = (student1.getAverage() + student2.getAverage() + student3.getAverage() + student4.getAverage()
               + student5.getAverage())/5;

       return classAverage;
   }
}