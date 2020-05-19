package dominator;
/**
 *
 * @author Lester Andrés García Aquino
 */
public class Dominator {

    public static void main(String[] args) {

        class DominatorSolution {

            public int solution(int[] a) {

                int size = 0; 
                int value = 0;
                
                for (int i = 0; i < a.length; i++) {
                    if (size == 0) {
                        size++;
                        value = a[i];
                    } else if (size != 0) {
                        if (value != a[i]) {
                            size--;
                        } else {
                            size++;
                        }
                    }
                }
                int candidate = -1;
                if (size != 0) {
                    candidate = value;
                }
                int count = 0;
                int index = -1, cIndex = -1;
                for (int i = 0; i < a.length; i++) {
                    if (candidate == a[i]) {
                        count++;
                        cIndex = i;
                    }
                }
                if (count > a.length / 2) {
                    index = cIndex;
                }
                return index;
            }
        }
    }
}
