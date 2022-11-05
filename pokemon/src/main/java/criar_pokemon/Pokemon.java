package criar_pokemon;

public class Pokemon {

	String nome;
	String genero;
	Integer numero;
	Integer ataque;
	Integer defesa;
	Integer saude;
	Integer ataqueEspecial;
	Integer defesaEspecial;
	Integer velocidade;
	String golpe1;
	String golpe2;
	String golpe3;
	String golpe4;
	
public Pokemon() {		
}
	
public void golpear(Integer golpe) {
	if(golpe == 1) System.out.println("Golpe: " + golpe1);
	if(golpe == 2) System.out.println("Golpe: " + golpe2);
	if(golpe == 3) System.out.println("Golpe: " + golpe3);
	if(golpe == 4) System.out.println("Golpe: " + golpe4);
	
	}
	
public void restaurarVida() {
	System.out.println("Vida restaurada!");
}
	
public void defender() {
	System.out.println("Ataque defendido...");

}
	
}
