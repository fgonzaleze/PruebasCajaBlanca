package pruebasCajaBlanca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CuentaImparesTest {

	@ParameterizedTest
	@MethodSource("cuentadeImpares")
	void testCuentaImpares(int num1, int expected) {
		CuentaImpares imp = new CuentaImpares();
		int resultado = imp.cuentaImpares(num1);
		assertEquals(expected, resultado);
	}
	
	private static Stream<Arguments> cuentadeImpares(){
		return Stream.of(
				Arguments.of(1,1), // en 1, hay 1 impar
				Arguments.of(2,1), // en 2, hay 1 impar, el 1
				Arguments.of(3,2) // en 3, hay 2 impares, el 1 y el 3
				);
	}
}


