package fish;
import java.util.*;
public class Fish {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] A, int[] B) {
                int vivos = A.length;
                Stack<Integer> S = new Stack<Integer>();
                for (int i = 0; i < A.length; i++) {
                    if (B[i] == 1) {
                        S.push(A[i]);
                    } else if (B[i] == 0) {
                        if (!S.empty() && A[i] < S.peek()) {
                            vivos--;
                        } else {
                            while (!S.empty() && A[i] > S.peek()) {
                                S.pop();
                                vivos--;
                            }
                            if (!S.empty()) {
                                vivos--;
                            }
                        }
                    }
                }
                return vivos;
            }
        }
    }
}
