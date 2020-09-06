import java.util.Scanner;
/*
  Uses RoomDimension class to calculate the total cost to cover a room floor with carpet.
*/
public class RoomCarpet{
  private RoomDimension size;
  private double carpetCost;

  /*
    Custom constructor for the class.
    @param dim RoomDimension class object.
    @param cost the cost for per square of carpet.
  */
  public RoomCarpet(RoomDimension dim, double cost){
    carpetCost = cost;
    size = dim;
  }

  /*
    Returns the total cost to cover a room floor with carpet.
    @return the total cost calculated by calling on getArea() method from RoomDimension class object.
  */
  public double getTotalCost(){
    double totalCost = size.getArea() * carpetCost;
    return totalCost;
  }

  /*
  Name: Chinzorig Batgerel
  CPTS 233: MicroAssignment #1
  Date: 9/5/2020
  gitRepo url: https://github.com/chinzo-0927/Fall_233_MA1.git
  */
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //Asks for the dimensions and the cost of carpet per square.
    System.out.println("Enter the length and the width of the room:");

    double length = scan.nextDouble();
    double width = scan.nextDouble();

    System.out.println("Enter the cost for per square foot of carpet: ");

    double cost = scan.nextDouble();

    RoomCarpet room = new RoomCarpet(new RoomDimension(length, width), cost);
    double totalCost = room.getTotalCost();

    System.out.println("The total cost of carpet will be: " + totalCost);
  }
}
