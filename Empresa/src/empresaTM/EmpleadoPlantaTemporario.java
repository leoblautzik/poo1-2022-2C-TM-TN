package empresaTM;

public class EmpleadoPlantaTemporario extends Empleado {
private static final double VALOR_HORA = 200;
	
	public EmpleadoPlantaTemporario(boolean casado, int hijos, int horasTrabajadas) {
		super(casado, hijos, horasTrabajadas);
	}

	@Override
	public double getSalario() {
		double salario = super.getSalarioFamiliar();
		salario += super.getHorasTrabajadas() * EmpleadoPlantaTemporario.VALOR_HORA;
		return salario;
	}

}
