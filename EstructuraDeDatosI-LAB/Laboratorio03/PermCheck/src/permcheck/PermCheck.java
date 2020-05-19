package permcheck;
/**
 *
 * @author Lester Andrés García Aquino
 */
public class PermCheck {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] Array) { //Integer type array declaration
                int[] Permutation = new int[Array.length]; //Declaring de array called permutation and this array will have as value the length of 'Array'
                for (int i = 0; i < Array.length; i++) {
                    if (Array[i] - 1 >= Array.length || Permutation[Array[i] - 1] != 0) {
                        return 0; //Return 0, that means the Array is not a permutation
                    }
                    Permutation[Array[i] - 1]++;
                }
                return 1; //Return 1, that means the Array is a permutation
            }
        }
    }
}