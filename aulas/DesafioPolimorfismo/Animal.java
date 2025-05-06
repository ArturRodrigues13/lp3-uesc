package DesafioPolimorfismo;

public class Animal {

	public void emitir_som() {

		System.out.println("Som genérico...");
	}
}

class Gato extends Animal{

	public void emitir_som() {

		System.out.println("Miau...");
	}
}

class Cachorro extends Animal {

	public void emitir_som() {

		System.out.println("Au Au...");
	}
}
