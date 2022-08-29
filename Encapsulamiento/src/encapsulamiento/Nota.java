package encapsulamiento;

public class Nota {
	
	private int valorNota;

	 /**
     * pre : valorInicial está comprendido entre 0 y 10.
     * post: inicializa la Nota con el valor indicado.
     */

	public Nota(int valorInicial) {
		if(valorInicial < 0 || valorInicial > 10)
			throw new Error("Nota inválida");
		valorNota = valorInicial;
		
	}
	/**
     * post: devuelve el valor numérico de la Nota,
     *       comprendido entre 0 y 10.
     */
    public int obtenerValor() { 
    	return this.valorNota;
    }
    
    /**
     * post: indica si la Nota permite o no la aprobación.
     */
    public boolean aprobado() {
    	return this.obtenerValor() >= 4;
    }

	
	

}
