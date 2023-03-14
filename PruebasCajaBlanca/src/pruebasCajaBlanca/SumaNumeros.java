package pruebasCajaBlanca;

public class SumaNumeros {

	public int sumaNumeros(int num) {
		int suma = 0;
		for (int i = 1; i < num; i++) { // el for debería ser i <= num
			if(i%2==0) {
				suma += i;
			}
		}
		return suma;
	}
}


