package empresa;

public class EmpleadoDePlantaPermanente extends Empleado {
	 
	private int antiguedad;
	private static final double VALOR_HORA = 300;
	private static final double VALOR_ANIO = 100;
	
	public EmpleadoDePlantaPermanente(boolean casado, int hijos, int horasTrabajadas, int antiguedad) {
		super(casado, hijos, horasTrabajadas);
		this.antiguedad = antiguedad;
		
	}

	@Override
	public double getSalario() {
		return this.getSalarioFamiliar() 
		+ this.getHorasTrabajadas() * EmpleadoDePlantaPermanente.getValorHora()
		+ this.getAntiguedad() * EmpleadoDePlantaPermanente.getValorAnio();
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public static double getValorHora() {
		return VALOR_HORA;
	}

	public static double getValorAnio() {
		return VALOR_ANIO;
	}
}
