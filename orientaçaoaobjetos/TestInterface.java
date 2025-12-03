interface Animal {
	void fazerSom();
}

class Cachorro implements Animal {
	public void fazerSom()  {
	System.out.println("Au au");
	}
}

class Gato implements Animal {
	public void fazerSom() {
	System.out.println("Miau miau");
	}
}

public class TestInterface {
	public static void main(String[] args) {
	Cachorro cachorro = new Cachorro();
	cachorro.fazerSom();
	Gato gato = new Gato();
	gato.fazerSom();
	}
}