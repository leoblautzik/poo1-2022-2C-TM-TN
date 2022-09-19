package empresaTM;

public abstract class Empleado {

	private int hijos;
	private boolean casado;
	private int horasTrabajadas;
	
	protected int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	private static final double VALOR_HIJO = 200;
	private static final double VALOR_CASADO = 100;
	
	public Empleado(boolean casado, int hijos, int horasTrabajadas) {
		this.hijos = hijos;
		this.casado = casado;
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSalarioFamiliar() {
		double salarioF = hijos * Empleado.VALOR_HIJO;
		if(casado)
			salarioF += Empleado.VALOR_CASADO;
		return salarioF;
	}

	public abstract double getSalario();

}
