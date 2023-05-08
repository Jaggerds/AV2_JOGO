// Importando 
import java.util.Random;
import java.util.Scanner;
// SubClasse Hero da Classe Personagens
public class Hero extends Personagens {
// variaveis
public int number;
public int y;
// Dados do Heroi
  public class Jogar extends Personagens{
    public int dados;
    public int x;
    public void jogando() {
    Random random = new Random();
    dados = (random.nextInt(7));
          if (dados == 0) {
            jogando();
          } else {
            if (dados <= 2) {
              System.out.println("Golpe Fraco!");
              System.out.println("=================");
              dano = 40;
              Villain(dados);
            } else if (dados <= 5) {
              System.out.println("Golpe Meadiano!");
              System.out.println("=================");
              dano = 40;
              Villain(dados);
            } else if (dados == 6) {
              System.out.println("Golpe Forte!");
              System.out.println("=================");
              dano = 40;
              Villain(dados);
            }
          }
        }
  }
//instanciando Metodo Jogar()
  Jogar jogar = new Jogar();
// Seleção de Herói
    Vilao v = new Vilao();
  public void selecao_de_H() {
    System.out.println("#############################");
    System.out.println("Selecione Um Héroi a seguir: ");
    System.out.println("=============================");
    System.out.println("1 = Muque-Man ");
    System.out.println("2 = Raio-Laser ");
    System.out.println("3 = Relâmpago ");
    System.out.println("#############################");
    Scanner heroi = new Scanner(System.in);
    number = heroi.nextInt();
// Se (number == 1) faz isso
    if (number == 1) {
        System.out.println("==================================");
        System.out.println("HERÓI <Muque-Man> SELECIONADO");
        System.out.println("==================================");
        Muque m = new Muque();
      for(int y = 0; y<6;y++){
        m.a();
        m.Individualidade();
        v.golpes();
      }
    } 
// Se (number == 2) faz isso
    else if (number == 2) {
        System.out.println("==================================");
        System.out.println("HERÓI <Raio-Laser> FOI SELECIONADO");
        System.out.println("==================================");
        Raio raio = new Raio();
      for(int y = 0; y<6;y++){
      raio.a();
      raio.Individualidade();
      v.golpes();
      
      }
// Se (number == 3) faz isso
    } else if (number == 3) {
        System.out.println("==================================");
        System.out.println("HERÓI <Relâmpago> FOI SELECIONADO ");
        System.out.println("==================================");
        R r = new R();
      for(int y = 0; y<6;y++){
      r.a();
      r.Individualidade();
      v.golpes();
      }
    } else {
      System.out.println("#########> Invalido <#########");
      System.out.println("<Nenhum> Héroi foi selecionado");
      System.out.println("######> Tente novamente <#####");
      System.out.println("");
      selecao_de_H();
    }
  }
}
