package figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboTest {

	@Test
	public void constructorTest() {
		assertNotNull(new Cubo(2));
	}

}
