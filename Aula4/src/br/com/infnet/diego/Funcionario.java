package br.com.infnet.diego;

public class Funcionario {

	private String Matricula = "123456";
	private String Nome = "Machado de Assis";
	private String Cargo = "Jornalista";
	private Double Salario = 4321.67;

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salarioBt) {
		Salario = salarioBt;
	}

	private double SalarioLq;
	private double Imposto;

	public double calcularSalario() {

		if (Salario <= 1000) {
			Imposto = 0.0;
			SalarioLq = Salario;
		} else if ((Salario > 1000) && (Salario <= 3000)) {
			Imposto = 15.0;
			SalarioLq = Salario - ((Salario * Imposto) / 100);
		} else if (Salario > 3000) {
			Imposto = 20.0;
			SalarioLq = Salario - ((Salario * Imposto) / 100);
		}

		System.out.println("Matrícula: ");
		System.out.println("Nome: ");
		System.out.println("Cargo: ");
		System.out.println("Salário Bruto: ");
		System.out.println("Imposto: ");
		System.out.println("Salário Líquido: ");
		return Imposto;
	}
}