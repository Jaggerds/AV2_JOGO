import java.util.Scanner;

public class Raio extends Hero {
  public void a() {
    System.out.println("SELECIONE UM <Golpe> : ");
    System.out.println("========================");
    System.out.println("1 = OPTIC BLAST ");
    System.out.println("2 = MEGA OPTIC ");
    System.out.println("3 = SUPER OPTIC ");
    System.out.println("########################");
    Scanner golpe = new Scanner(System.in);
    y = golpe.nextInt();
    jogar.jogando();
  }
  public void Individualidade() {
    dano=dano+3;
  }
}
