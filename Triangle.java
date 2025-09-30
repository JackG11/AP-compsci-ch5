import java.util.Scanner;
public class Triangle{
public static void main(String[]args){
  Scanner in  = new Scanner(System.in);
  boolean invalid1, invalid2, invalid3, retry;
  invalid1 = invalid2 = invalid3 = retry = false;
  int stick1, stick2, stick3;
  stick1 = stick2 = stick3 = 0;
  System.out.println("Put in your triangle lengths:");
  while(invalid1 == false){
      System.out.println("Stick 1:");
      if(in.hasNextInt()){
          stick1 = in.nextInt();
          invalid1 = true;
      }else if(in.hasNextDouble()){
          double badDouble = in.nextDouble();
          System.out.println( badDouble + " contains decimal points, please put in an integer.");
      }else{
          String badString = in.nextLine();
          System.out.println( badString + " is not a integer, please put in an integer.");
      }
  }
  while(invalid2 == false){
      System.out.println("Stick 2:");
      if(in.hasNextInt()){
          stick2 = in.nextInt();
          invalid2 = true;
      }else if(in.hasNextDouble()){
          double badDouble = in.nextDouble();
          System.out.println(badDouble + " contains decimal points, please put in an integer.");
      }else{
          String badString = in.nextLine();
          System.out.println( badString + " is not a integer, please put in an integer.");
          }
      }
  while(invalid3 == false){
      System.out.println("Stick 3:");
      if(in.hasNextInt()){
          stick3 = in.nextInt();
          invalid3 = true;
      }else if(in.hasNextDouble()){
          double badDouble = in.nextDouble();
          System.out.println(badDouble + " contains decimal points, please put in an integer.");
      }else{
          String badString = in.nextLine();
          System.out.println( badString + " is not a integer, please put in an integer.");
      }
  }
  if(stick1 > stick2 + stick3 || stick2 > stick1 + stick3 || stick3 > stick2 + stick1){
     System.out.println(" YOU CANNOT make a triangle");
  }else if(stick1 <= 0 || stick2 <= 0 || stick3 <= 0){
      System.out.println("ERROR");
  }else{
      System.out.println("YOU CAN FORM A TRIANGLE!!");
  }
}
}