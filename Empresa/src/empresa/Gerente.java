package empresa;

public class Gerente extends EmpleadoDePlantaPermanente {
	
	private static final double VALOR_HORA = 400;
	private static final double VALOR_ANIO = 150;
	
	public Gerente(boolean casado, int hijos, int horasTrabajadas, int antiguedad) {
		super(casado, hijos, horasTrabajadas, antiguedad);
		
	}
	
	@Override
	public double getSalario() {
		return this.getSalarioFamiliar() 
		+ this.getHorasTrabajadas() * Gerente.getValorHora()
		+ this.getAntiguedad() * Gerente.getValorAnio();
	}
	
	public static double getValorHora() {
		return VALOR_HORA;
	}

	public static double getValorAnio() {
		return VALOR_ANIO;
	}


}
