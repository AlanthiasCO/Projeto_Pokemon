package criar_pokemon;

public class Pokemon {

	public String nome;
	public String genero;
	public Integer numero;
	public Integer ataque;
	public Integer defesa;
	public Integer saude;
	public Integer ataqueEspecial;
	public Integer defesaEspecial;
	public Integer velocidade;
	private String golpe1;
	private String golpe2;
	private String golpe3;
	private String golpe4;

	//parametros	
public Pokemon(String nome, String genero, Integer numero, Integer ataque,
		Integer defesa, Integer saude, Integer ataqueEspecial, Integer defesaEspecial,
		Integer velocidade) {		
	this.nome = nome;
	this.genero = genero;
	this.numero = numero;
	this.ataque = ataque;
	this.defesa = defesa;
	this.saude = saude;
	this.ataqueEspecial = ataqueEspecial;
	this.defesaEspecial = defesaEspecial;
	this.velocidade = velocidade;
}
	
//sem parametros
public Pokemon() {
	
}

public void golpear(Integer golpe) {
	if(golpe == 1) System.out.println("Golpe: " + golpe1);
	if(golpe == 2) System.out.println("Golpe: " + getGolpe2());
	if(golpe == 3) System.out.println("Golpe: " + getGolpe3());
	if(golpe == 4) System.out.println("Golpe: " + getGolpe4());
	
	}
	
public void restaurarVida() {
	System.out.println("Vida restaurada!");
}
	
public void defender() {
	System.out.println("Ataque defendido...");

}

//GETTERS E SETTERS
public String getGolpe1() {
	return golpe1;
}

public void setGolpe1(String golpe1) {
	this.golpe1 = golpe1;
}

public String getGolpe2() {
	return golpe2;
}

public void setGolpe2(String golpe2) {
	this.golpe2 = golpe2;
}


public String getGolpe3() {
	return golpe3;
}


public void setGolpe3(String golpe3) {
	this.golpe3 = golpe3;
}


public String getGolpe4() {
	return golpe4;
}


public void setGolpe4(String golpe4) {
	this.golpe4 = golpe4;
}

}


