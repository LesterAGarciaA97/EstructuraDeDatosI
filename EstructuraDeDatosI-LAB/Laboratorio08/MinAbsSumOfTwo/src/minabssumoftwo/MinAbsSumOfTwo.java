package minabssumoftwo;
import java.util.Arrays;
public class MinAbsSumOfTwo {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] A) {
                int N = A.length;
                Arrays.sort(A);
                int cola = 0;
                int cabeza = N - 1;
                int sumaMinima = Math.abs(A[cola] + A[cabeza]);
                while (cola <= cabeza) {
                    int sumaActual = A[cola] + A[cabeza];
                    sumaMinima = Math.min(sumaMinima, Math.abs(sumaActual));
                    // Si el resultado de la suma se vuelve positivo se debe saber que puede ser movido hacia la izquierda
                    if (sumaActual <= 0) {
                        cola++;
                    } else {
                        cabeza--;
                    }
                }
                return sumaMinima;
            }
        }
    }
}
