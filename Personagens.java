
public class Personagens{
  public int vilao = 200;
  public int HP = 200;
  public void Individualidade(){}
  public int dano;
  public void HP_H(int D6){
    HP = HP - dano;
    System.out.println("Vida atual do Herói = "+HP);
    System.out.println("============================");
  }
  public void Villain(int dados){
    vilao = vilao - dano;
    System.out.println("============================");
    System.out.println("Vida atual do Vilão = "+vilao);
  }
}