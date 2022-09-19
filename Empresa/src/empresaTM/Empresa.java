package empresaTM;

public class Empresa {
	private String CUIT;
	private String razonSocial;
	private Empleado[] empleados;
	private int cantEmpleados = 0;
	
	public Empresa(String cUIT, String razonSocial, int ce) {
		CUIT = cUIT;
		this.razonSocial = razonSocial;
		this.empleados = new Empleado[ce];
		
	}
	
	public void agregarEmpleado(Empleado e) {
		if(cantEmpleados < empleados.length) {
			empleados[cantEmpleados] = e;
			cantEmpleados ++;
		}
		else System.err.println("No hay mas vacantes");
	}
	
	public double getMontoTotal() {
		double montoTotal = 0;
		for (Empleado cadaEmpleado : empleados) {
			montoTotal += cadaEmpleado.getSalario();
			System.out.println(cadaEmpleado.getSalario());
		}
		return montoTotal;
	}
	
	public static void main(String[] args) {
		Empresa acme = new Empresa("12-34567890-4", "Acme", 4);
		
		Empleado tito = new EmpleadoPlantaTemporario(true, 0, 80);
		Empleado julia = new EmpleadoPlantaPermanente(true, 2, 80, 6);
		Empleado pablo = new EmpleadoPlantaPermanente(false, 0, 160, 4);
		Empleado ana = new Gerente(true, 1, 160, 10);
		acme.agregarEmpleado(ana);
		acme.agregarEmpleado(pablo);
		acme.agregarEmpleado(julia);
		acme.agregarEmpleado(tito);
		
		System.out.println(acme.getMontoTotal());
	
	}

}
