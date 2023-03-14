package pruebasCajaBlanca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumaNumerosTest {

	@ParameterizedTest
	@MethodSource("sumaDeNumeros")
	void testSumaNumeros(int num1, int expected) {
		SumaNumeros imp = new SumaNumeros();
		int resultado = imp.sumaNumeros(num1);
		assertEquals(expected, resultado);
	}
	
	private static Stream<Arguments> sumaDeNumeros(){
		return Stream.of(
				Arguments.of(1,0), 
				Arguments.of(2,2),
				Arguments.of(3,2)
				);
	}

}
