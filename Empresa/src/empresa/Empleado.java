package empresa;

public abstract class Empleado {
	
	private boolean casado;
	private int hijos;
	private int horasTrabajadas;

	public abstract double getSalario();

	public Empleado(boolean casado, int hijos, int horasTrabajadas) {
		super();
		this.casado = casado;
		this.hijos = hijos;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double getSalarioFamiliar() {
		double salario = this.hijos * 200;
		if (casado) {
			salario += 100;
		}
		return salario;
			
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	
	
	
	
}
