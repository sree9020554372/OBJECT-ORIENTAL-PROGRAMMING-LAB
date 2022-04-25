class Vehicle{
 String vehicleno;
 String vname;
 String owner;
 Vehicle(){
 }
 Vehicle(String no,String name,String own){
  vehicleno=no;
  vname=name;
  owner=own;
 }
 void display(){
	 System.out.println("  Vehicle No:"+vehicleno);
	 System.out.println("  Vehicle Name:"+vname);
	 System.out.println("  Owner Name:"+owner);
 }
}
public class VehicleDetails{
  public static void main(String args[]){
   Vehicle[] obj=new Vehicle[3];
   obj[0]= new Vehicle("KL 34 7012","CAR","Anilkumar");
   obj[1]= new Vehicle("KL 34 702","BIKE","Sreejith");
   obj[2]= new Vehicle("KL 34 7002","SCOOTER","kichu");
   System.out.println("\nDETAILS OF VEHICLE 1:");
   obj[0].display();
   System.out.println("\nDETAILS OF VEHICLE 2:");
   obj[1].display();
   System.out.println("\nDETAILS OF VEHICLE 3:");
   obj[2].display();
  }
}
