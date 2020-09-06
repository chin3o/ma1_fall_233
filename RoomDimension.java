/*
  RoomDimension class uses the given length and width of a room to calculate the total area of the room.
*/
public class RoomDimension{
  //private fields for the length and width
  private double length;
  private double width;

  /*
    Custom constructor for the class.
    Initializes the private fields.
    @param len the length of the room.
    @param w the width of the room.
  */
  public RoomDimension(double len, double w){
    length = len;
    width = w;
  }

  /*
    Calculates the area using the fields of the class and returns the total area of the room.
    @return the total area of the room. Found by multiplying the length with the width.
  */
  public double getArea(){
    double area = length * width;
    return area;
  }

}
