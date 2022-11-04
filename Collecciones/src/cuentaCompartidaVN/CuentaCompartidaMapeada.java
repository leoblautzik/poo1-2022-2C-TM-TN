package cuentaCompartidaVN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CuentaCompartidaMapeada {

	private Map<Integer, List<Consumo>> cuenta;
	private double cubierto;
	private int cantComensales;

	public CuentaCompartidaMapeada(int n, double cubierto) {
		this.cuenta = new HashMap<Integer, List<Consumo>>();
		this.cubierto = cubierto;
		this.cantComensales = n;
	}

	public void agregarConsumoAlComensal(int comensal, String detalle, double precio) throws ComensalInvalidoException {
		if(comensal < 1 || comensal > this.cantComensales)
			throw new ComensalInvalidoException("Comensal invalido");
		
		List<Consumo> l;
		if (!cuenta.containsKey(comensal)) {
			l = new ArrayList<Consumo>();
			cuenta.put(comensal, l);
		} else
			l = cuenta.get(comensal);

		l.add(new Consumo(detalle, precio));

	}
	
	public String consultarConsumosDelComensal(int comensal) {
		String s = "Consumos del comensal: " + comensal + "\n";
		List<Consumo> laux = cuenta.get(comensal);
		
		for(Consumo cadaConsumo : laux) {
			s += cadaConsumo.getDescripcion() + "     " + cadaConsumo.getPrecio() + "\n";
		}
		return s;
	}
	
	public String consumoMaximo() {
		String s = "";
		Consumo candidato = new Consumo("", 0);
		Integer comensalHambriento = 0;
		for (Map.Entry<Integer, List<Consumo>> cadaUno : cuenta.entrySet()) {
			Integer comensal = cadaUno.getKey();
			List<Consumo> listaDeConsumos = cadaUno.getValue();
			for(Consumo c : listaDeConsumos) {
				if(c.getPrecio() > candidato.getPrecio()) {
					candidato = c;
					comensalHambriento = comensal;
				}
			}
		}
		s += "Consumo maximo: " + candidato + "\n";
		s += "Consumido por:  " + comensalHambriento + "\n";
				
		return s;
		
	}

	public static void main(String[] args) throws ComensalInvalidoException {
		CuentaCompartidaMapeada ccm = new CuentaCompartidaMapeada(8, 150);
		ccm.agregarConsumoAlComensal(2, "Milanga", 1200);
		ccm.agregarConsumoAlComensal(2, "Papitas", 600);
		ccm.agregarConsumoAlComensal(8, "Filet", 1300);
		ccm.agregarConsumoAlComensal(8, "Filet", 1300);
		
		System.out.println(ccm.consultarConsumosDelComensal(2));
		System.out.println(ccm.consumoMaximo());
	}

}
