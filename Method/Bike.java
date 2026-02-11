class Bike
{
  //Non static var
  String bname;
  String color;

  //Costructor
  Bike(){
   System.out.println("Bike Showroom");
  }
  Bike(String bname,String color)
  {
	this();
    this.bname=bname;
	this.color=color;
  }

  //MultiLine Non static Ini
  {
    System.out.println("Lovely Professional University");
  }


  public void displayAttributes()
  {
    System.out.println("Bike Name : "+bname);
	System.out.println("Bike Color : "+color);
  }
}
