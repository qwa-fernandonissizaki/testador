import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteSoma {

	@Test
	public void testarSoma() {
		Teste t = new Teste();
		int resultado = t.somar(10, 15);
		assertEquals(25, resultado);
	}
}
