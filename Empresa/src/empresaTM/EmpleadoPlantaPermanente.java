package empresaTM;

public class EmpleadoPlantaPermanente extends Empleado {

	private static final double VALOR_HORA = 300;
	private static final double VALOR_ANIO = 100;
	private int aniosDeAntiguedad;

	protected int getAniosDeAntiguedad() {
		return aniosDeAntiguedad;
	}

	public EmpleadoPlantaPermanente(boolean casado, int hijos, int horasTrabajadas, int antiguedad) {
		super(casado, hijos, horasTrabajadas);
		this.aniosDeAntiguedad = antiguedad;
	}

	@Override
	public double getSalario() {
		double salario = super.getSalarioFamiliar();
		salario += super.getHorasTrabajadas() * EmpleadoPlantaPermanente.VALOR_HORA;
		salario += this.aniosDeAntiguedad * EmpleadoPlantaPermanente.VALOR_ANIO;
		return salario;
	}

}
