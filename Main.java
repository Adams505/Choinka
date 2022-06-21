import java.util.Scanner;
class Main {
  public static void main(String[] args) {
System.out.println("Podaj długość stoku:");
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    for(int i=0;i<x;i++)
      {
        for(int j=0;j<i;j++)
          {
            System.out.print(" x ");
          }
       System.out.println(" ");
      }
  }
}