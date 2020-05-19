package cyclicrotation;
/**
 *
 * @author Lester Andrés García Aquino
 */
public class CyclicRotation {

    public static void main(String[] args) {

        class CyclicRotationSolution {

            public int[] solution(int[] a, int b) {
                int n = a.length;
                if (n == 0) {
                    return a;
                }
                if (b >= n) {
                    b = b % n;
                }
                if (b == 0) {
                    return a;
                }
                int[] rotateArray = new int[n];
                for (int i = 0; i < n; i++) {
                    rotateArray[i] = (i < b) ? a[n + i - b] : a[i - b];
                }
                return rotateArray;
            }
        }

    }
}