package empresaTM;

public class Gerente extends EmpleadoPlantaPermanente {
	
	private static final double VALOR_HORA = 400;
	private static final double VALOR_ANIO = 150;
	
	public Gerente(boolean casado, int hijos, int horasTrabajadas, int antiguedad) {
		super(casado, hijos, horasTrabajadas, antiguedad);
		
	}
	
	@Override
	public double getSalario() {
		double salario = super.getSalarioFamiliar();
		salario += super.getHorasTrabajadas() * Gerente.VALOR_HORA;
		salario += super.getAniosDeAntiguedad() * Gerente.VALOR_ANIO;
		return salario;
	}

}
