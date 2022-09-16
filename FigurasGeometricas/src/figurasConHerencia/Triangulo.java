package figurasConHerencia;

import java.util.Objects;

public class Triangulo extends Figura {
	
	public double base, altura;
	
	

	public Triangulo(Color color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	

	@Override
	public double getArea() {
		return base * altura / 2;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public double getPerimetro() {
		return 5;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(altura, base);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangulo other = (Triangulo) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Double.doubleToLongBits(base) == Double.doubleToLongBits(other.base);
	}



	
	
	

}
