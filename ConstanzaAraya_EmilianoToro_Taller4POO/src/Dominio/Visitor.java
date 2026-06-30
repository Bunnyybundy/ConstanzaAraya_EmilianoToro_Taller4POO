package Dominio;

public interface Visitor {
	
	void visitar(Pokemon pokemon);

	void visitar(Item item);

	void visitar(Supporter supporter);

	void visitar(Energia energia);



}
