// Importando 
import java.util.Random;
// SubClasse Vilao
// da Classe Personagens
public class Vilao extends Personagens {
// variaveis
  int D6;
  int V;
// instanciando Ramdom
  Random R = new Random();
// Metodo para golpes e ramdom  
  public void golpes() {
// N* dado de forma randômica entre 0 até 6
D6 = R.nextInt(7);
// se N* = 0
    if (D6 == 0) {
      golpes();
    }
// se N* igual ou menor que 2
    else if (D6 <= 2) {
      dano = 10;
      HP_H(D6);
    } 
// se N* igual ou menor que 5
    else if (D6 <= 5) {
      dano = 20;
      HP_H(D6);
    } 
// se N* for nenhum desses
    else if(D6 == 6){
      dano = 10;
      HP_H(D6);
    }
    V = (R.nextInt(4));
    if (V == 1) {
      System.out.println("==========================");
      System.out.println(" <SPLIT KICK> UTILIZADO! ");
      System.out.println("==========================");
    } else if (V == 2) {
      System.out.println("==========================");
      System.out.println(" <BIT LASER> UTILIZADO! ");
      System.out.println("==========================");
    } else if (V == 3) {
      System.out.println("==========================");
      System.out.println(" <SHOCKWAVE> UTILIZADO! ");
      System.out.println("==========================");
    }else if(V>3){
      golpes();
    }
  }    
}

