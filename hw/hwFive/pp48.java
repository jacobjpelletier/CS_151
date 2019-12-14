/*
Problem 1. Textbook 9th edition, page 187 Programming project 4.8
*/

public class pp48 // AKA FLightTest
{
    public static void main(String[] args)
    {
        System.out.println("\n---------------------------------CREATE THREE FLIGHT OBJECTS---------------------------");
        Flight aircanada_TtoN = new Flight("air canada", 9999, "Toronto", "New York City");
        System.out.println(aircanada_TtoN);
        Flight aircanada_MtoM = new Flight("air canada", 9998, "Montreal", "Miami");
        System.out.println(aircanada_MtoM);
        Flight aircanada_QtoL = new Flight("air canada", 9997, "Quebec City", "Los Angelas");
        System.out.println(aircanada_QtoL);

        System.out.println("\n---------------------------------TEST GETTERS FOR ONE FLIGHT---------------------------");
        System.out.println(aircanada_TtoN.getName());
        System.out.println(aircanada_TtoN.getNum());
        System.out.println(aircanada_TtoN.getOri());
        System.out.println(aircanada_TtoN.getDest());

        System.out.println("\n---------------------------------TEST GETTERS FOR ANOTHER FLIGHT---------------------------");
        System.out.println(aircanada_MtoM.getName());
        System.out.println(aircanada_MtoM.getNum());
        System.out.println(aircanada_MtoM.getOri());
        System.out.println(aircanada_MtoM.getDest());

        System.out.println("\n---------------------------------TEST SETTERS FOR OTHER FLIGHT---------------------------");
        aircanada_MtoM.setName("southwest");
        aircanada_MtoM.setNum(1111);
        aircanada_MtoM.setOri("Memphis");
        aircanada_MtoM.setDest("Manchester");
        System.out.println(aircanada_MtoM.getName());
        System.out.println(aircanada_MtoM.getNum());
        System.out.println(aircanada_MtoM.getOri());
        System.out.println(aircanada_MtoM.getDest());
    }
}

class Flight
{
    private String airlineName, origin, destination;
    private int airlineNumber;

    //------------------------------------------------------------------------------------------------------------------
    //  Constructor
    //------------------------------------------------------------------------------------------------------------------
    public Flight(String name, int number, String from, String to)
    {
        airlineName = name;
        airlineNumber = number;
        origin = from;
        destination = to;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  GETTER: airlineName
    //------------------------------------------------------------------------------------------------------------------
    public String getName()
    {
        return airlineName;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  GETTER: origin
    //------------------------------------------------------------------------------------------------------------------
    public String getOri()
    {
        return origin;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  GETTER: destination
    //------------------------------------------------------------------------------------------------------------------
    public String getDest()
    {
        return destination;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  GETTER: airlineNumber
    //------------------------------------------------------------------------------------------------------------------
    public int getNum()
    {
        return airlineNumber;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  SETTER: airlineName
    //------------------------------------------------------------------------------------------------------------------
    public void setName(String name)
    {
        this.airlineName = name;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  SETTER: origin
    //------------------------------------------------------------------------------------------------------------------
    public void setOri(String from)
    {
        this.origin = from;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  SETTER: destination
    //------------------------------------------------------------------------------------------------------------------
    public void setDest(String to)
    {
        this.destination = to;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  SETTER: airlineNumber
    //------------------------------------------------------------------------------------------------------------------
    public void setNum(int number)
    {
        this.airlineNumber = number;
    }

    //------------------------------------------------------------------------------------------------------------------
    //  toString method
    //------------------------------------------------------------------------------------------------------------------
    public String toString()
    {
        return ("Airline Name: " + airlineName + "\tAirline Number: " + airlineNumber +
        "\tOrigin: " + origin + "\t\tDestination: " + destination + "\n");
    }
}