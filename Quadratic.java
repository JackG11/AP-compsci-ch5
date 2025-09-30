import java.util.Scanner;
public class Quadratic{
public static void main(String[]args){
  Scanner in  = new Scanner(System.in);
  boolean inputValid1, inputValid2, inputValid3;
  int a, b, c;
  inputValid1 = inputValid2 = inputValid3 = false;
  a = b = c = 0;
  System.out.println("Place your numbers in for the quadratic formula: ax^2 + bx + c = 0");
  double minus = (-b - Math.sqrt(Math.pow(b, 2) - 4* a * c))/2* a;
  double plus = (-b + Math.sqrt(Math.pow(b, 2) - 4* a * c))/2* a;
while(inputValid1 == false){
    System.out.println("a: ");
    if(in.hasNextInt()){
        a = in.nextInt();
        inputValid1 = true;
        
    }else if(in.hasNextDouble()){
        double badDouble = in.nextDouble();
        System.out.println("Invalid input:" + badDouble + " is a decimal. ENTER AN INTEGER");
    }else{
        String badInput = in.next();
        System.out.println("Invalid input:" + badInput + " is NOT a number. ENTER AN INTEGER");
    }
}
while(inputValid2 == false){
    System.out.println("b: ");
    if(in.hasNextInt()){
        a = in.nextInt();
        inputValid1 = true;
        
    }else if(in.hasNextDouble()){
        double badDouble = in.nextDouble();
        System.out.println("Invalid input:" + badDouble + " is a decimal. ENTER AN INTEGER");
    }else{
        String badInput = in.next();
        System.out.println("Invalid input:" + badInput + " is NOT a number. ENTER AN INTEGER");
    }
}
while(inputValid3 == false){
    System.out.println("c: ");
    if(in.hasNextInt()){
        a = in.nextInt();
        inputValid1 = true;
        
    }else if(in.hasNextDouble()){
        double badDouble = in.nextDouble();
        System.out.println("Invalid input:" + badDouble + " is a decimal. ENTER AN INTEGER");
    }else{
        String badInput = in.next();
        System.out.println("Invalid input:" + badInput + " is NOT a number. ENTER AN INTEGER");
    }
}
  if(Math.pow(b, 2) - 4* a * c < 0 || a == 0){
      System.out.println("ERROR");
  }else if(Math.pow(b, 2) - 4* a * c == 0){
      if(minus != 0){
          System.out.println("X = " + minus);
      }else if(plus !=0){
          System.out.println("X = " + plus);
      }else{
          System.out.println("ERROR");
      }
}else if(Math.pow(b, 2) - 4* a * c > 0){
    System.out.println("X = " + minus + " X = " + plus);
}
}
}