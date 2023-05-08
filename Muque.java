import java.util.Scanner;

public class Muque extends Hero {
  public void a() {
    System.out.println("SELECIONE UM <Golpe> : ");
    System.out.println("========================");
    System.out.println("1 = CHUTE ");
    System.out.println("2 = TORNADO ");
    System.out.println("3 = BERSERKER ");
    System.out.println("#############################");
    Scanner golpe = new Scanner(System.in);
    y = golpe.nextInt();
    jogar.jogando();
  }
  public void Individualidade() {
    HP = HP+5 ;
  }
}
