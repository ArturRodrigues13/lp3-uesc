package DesafioFuncionario;

class Funcionario {
	public String nome;
	public double salarioBase;

	Funcionario(String nome, double salarioBase) {
		this.salarioBase = salarioBase;
		this.nome = nome;
	}

	void exibirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário Base: R$ " + this.salarioBase);
	}
}

class Gerente extends Funcionario {
	public double bonusGerencial;

	Gerente(String nome, double salarioBase, double bonusGerencial) {
		super(nome,salarioBase);
		this.bonusGerencial = bonusGerencial;
	}

	void exibirDados() {
		super.exibirDados();
		System.out.println("Bonus Gerencial: R$ " + this.bonusGerencial);
		System.out.println("Salário Total: R$ " + (this.salarioBase + this.bonusGerencial));
	}
}
