package empresa;

public class Empresa {

	public static void main(String[] args) {
		
		Gerente pipo = new Gerente(true, 2, 100, 10);
		System.out.println(pipo.getSalario());
		EmpleadoDePlantaPermanente lucas = new EmpleadoDePlantaPermanente(true, 2, 100, 10);
		System.out.println(lucas.getSalario());
	}

}
