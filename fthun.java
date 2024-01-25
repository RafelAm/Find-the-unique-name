
public class FindUniqTest {
    private double precision = 0.0000000000001;
    
    @Test
    public void sampleTestCases() {
        assertEquals(1.0, Kata.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}


// Make sure your class is public
 public class Kata {
    public static double findUniq(double arr[]) {
    
      
      // Declaramos un for para recorrer el array desde la posicion 0
      for(int i = 0; i< arr.length; i++){
        // Inicializamos un contador a 0
        int count = 0;
        // Si la posicion i es diferente a -1 entramos
        if(arr[i] != -1){
          // Segundo for para recorrer el array de nuevo
        for(int j = i +1; j < arr.length; j++){
          // Si array posicion i es igual a array posicion j 
          // Y si j es diferente al máximo de longitud de la array entra
          if(arr[i] == arr[j] && j != arr.length){
            // Cuenta 1 cada vez que hace una vuelta
            count++;
            // Cambia el número de la posición por un -1 para que vuelve a entrar al bucle
            arr[j]= -1;
          }
        }
      // Si el contador es igual a o devuelve la posicion actual del array
        if(count == 0){
          return arr[i];
        }
      }
    }

    // Cuando sale de los dos bucles muestra la ultima posición se le resta 1
    // porque sinos sale out of bounds
      return arr[arr.length-1];
    }
}
