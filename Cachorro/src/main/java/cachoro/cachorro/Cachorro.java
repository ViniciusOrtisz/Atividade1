/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cachoro.cachorro;
/**
 *
 * @author aluno
 */

      
public class Cachorro {

public String nome;
public int peso;
public String corOlhos;
public int qntPatas;
public String raca;
public int idade;
public String funcao;
public int qntRacaoPorDia;
public int tamanho;
  

public static void main(String[] args){

Cachorro cachorro1 = new Cachorro();
cachorro1.nome = "Pluto"; 
cachorro1.corOlhos = "Azuis"; 
cachorro1.peso = 15; 
cachorro1.qntPatas = 4; 
cachorro1.raca = "Vira-Lata";
cachorro1.idade = 5;
cachorro1.funcao = "Policial";
cachorro1.qntRacaoPorDia = 6;
cachorro1.tamanho = 70;

Cachorro cachorro2 = new Cachorro();
cachorro2.nome = "Bob"; 
cachorro2.corOlhos = "Verdes"; 
cachorro2.peso = 29; 
cachorro2.qntPatas = 4; 
cachorro2.raca = "Vira-Lata";
cachorro2.idade = 5;
cachorro2.funcao = "Existir";
cachorro2.qntRacaoPorDia = 6;
cachorro2.tamanho = 85;

Cachorro cachorro3 = new Cachorro();
cachorro3.nome = "Belinha"; 
cachorro3.corOlhos = "Pretos"; 
cachorro3.peso = 55; 
cachorro3.qntPatas = 4; 
cachorro3.raca = "Vira-Lata";
cachorro3.idade = 5;
cachorro3.funcao = "Ajudante";
cachorro3.qntRacaoPorDia = 6;
cachorro3.tamanho = 33;

Cachorro cachorro4 = new Cachorro();
cachorro4.nome = "Robert"; 
cachorro4.corOlhos = "Amarelos"; 
cachorro4.peso = 21; 
cachorro4.qntPatas = 4; 
cachorro4.raca = "Chiuaua";
cachorro4.idade = 7;
cachorro4.funcao = "Suporte";
cachorro4.qntRacaoPorDia = 6;
cachorro4.tamanho = 44;

Cachorro cachorro5 = new Cachorro();
cachorro5.nome = "Rex"; 
cachorro5.corOlhos = "Brancos"; 
cachorro5.peso = 22; 
cachorro5.qntPatas = 3; 
cachorro5.raca = "Pastor Alemao";
cachorro5.idade = 8;
cachorro5.funcao = "Caçador";
cachorro5.qntRacaoPorDia = 6;
cachorro5.tamanho = 59;


}
	public void latir(){
		if(tamanho > 60)
			System.out.println("Wooof, Wooof!");
		else if(tamanho > 14)
			System.out.println("Ruff!, Ruff!");
		else
			System.out.println("Yip!, Yip!");
	}
}

