//Escribir un m�todo en Java que permita comprobar si la diagonal principal de una matriz cuadrada de enteros tiene en cada posici�n un valor igual a la suma de todos los valores de las posiciones anteriores de dicha diagonal. 
//
//Por ejemplo, la siguiente matriz comprueba la regla:
//1 2 3
//4 1 6
//7 8 2
//
//Pero esta otra, no la comprueba:
//1 2 3
//4 2 6
//7 8 2

public class Ejercicio00 {
	public boolean comprobar(int[][] matriz){
		int sumaDeLasAnteriores = matriz[0][0];
		for(int i = 1; i<matriz.length;i++){
			if(matriz[i][i] == sumaDeLasAnteriores){
				sumaDeLasAnteriores = sumaDeLasAnteriores + matriz[i][i];
				
			}else{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] ejemplo = {
				{1,2,3},
				{4,-1,6},
				{7,8,0}
		};
		
		Ejercicio00 miEjercicio = new Ejercicio00();
		System.out.println(miEjercicio.comprobar(ejemplo));
	}
}

