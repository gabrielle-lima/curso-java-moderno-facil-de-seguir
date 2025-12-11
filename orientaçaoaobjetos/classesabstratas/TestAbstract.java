package classesabstratas;

abstract class Carro {
	int codigo = 10;

	Carro (int cod) {
		codigo = cod;
	}

    abstract void acelerar();

    void frear() {
        System.out.println("O carro está freando...");
    }
}

class Caminhao extends Carro {
	Caminhao (int codigo) {
		super (codigo);
	}

    void acelerar() {
        System.out.println("O caminhão está acelerando lentamente...");
    }
}

