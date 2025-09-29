import java.util.Scanner;
public class Fermat{
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("input your 3 values a:");
    int a = in.nextInt();
    System.out.println("b:");
    int b = in.nextInt();
    System.out.print("c:");
    int c = in.nextInt();
    System.out.println("now n:");
    int n = in.nextInt();
    
    if(Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n) && n <= 2){
     System.out.print("Fermat was wrong!!!");   
    }else{
     System.out.print("No, that doesnt work bud");
    }
    }
}