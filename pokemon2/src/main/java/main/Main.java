package main;

import criar_pokemon.Pokemon;

public class Main {
	
public static void main( String[] args ) {
	System.out.println("Testando Pokemons!\n");
	
	Pokemon bubasauro = new Pokemon();
	bubasauro.nome = "Bubasauro";
	bubasauro.genero = "F";
	bubasauro.numero = 1;
	bubasauro.ataque = 10;
	bubasauro.defesa = 10;
	bubasauro.saude = 10;
	bubasauro.ataqueEspecial = 15;
	bubasauro.defesaEspecial = 15;
	bubasauro.velocidade = 10;
	bubasauro.setGolpe1("TACKLE");
	bubasauro.setGolpe2("GROWL");
	bubasauro.setGolpe3("LEECH SEED");
	bubasauro.setGolpe4("VINE WHIP");
	bubasauro.getGolpe1();
	bubasauro.getGolpe2();
	bubasauro.getGolpe3();
	bubasauro.getGolpe4();

}
}
