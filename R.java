import java.util.Scanner;

public class R extends Hero {
  public void a() {
    System.out.println("SELECIONE UM <Golpe> : ");
    System.out.println("========================");
    System.out.println("1 = Lightning Attack ");
    System.out.println("2 = Lightning Storm ");
    System.out.println("3 = Hail Storm ");
    System.out.println("########################");
    Scanner golpe = new Scanner(System.in);
    y = golpe.nextInt();
    jogar.jogando();
  }
  public void Individualidade() {
    vilao=vilao-3;
  }
}