package figurasConHerencia;

import java.util.Objects;

public abstract class Figura {
	
	private Color color;
	
	public Figura(Color color) {
		this.color = color;
	}
	public Color getColor() {
		return this.color;
	}
	@Override
	public int hashCode() {
		return Objects.hash(color);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return color == other.color;
	}
	public abstract double getArea();
	public abstract double getPerimetro();

}
