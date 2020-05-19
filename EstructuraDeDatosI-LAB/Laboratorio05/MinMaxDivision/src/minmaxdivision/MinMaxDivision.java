package minmaxdivision;
public class MinMaxDivision {
    public static void main(String[] args) {
        class Solution {
            public int solution(int K, int M, int[] A) {
                int Min = 0;
                int Max = 0;
                for (int i = 0; i < A.length; i++) {
                    Max += A[i];
                    Min = Math.max(Min, A[i]);
                }
                int resultado = Max;
                while (Min <= Max) {
                    int mid = (Min + Max) / 2;
                    if (solucionDivision(mid, K - 1, A)) {
                        Max = mid - 1;
                        resultado = mid;
                    } else {
                        Min = mid + 1;
                    }
                }
                return resultado;
            }
            private boolean solucionDivision(int mid, int k, int[] a) {
                int suma = 0;
                for (int i = 0; i < a.length; i++) {
                    suma += a[i];
                    if (suma > mid) {
                        suma = a[i];
                        k--;
                    }
                    if (k < 0) {
                        return false;
                    }
                }
                return true;
            }
        }
    }
}
