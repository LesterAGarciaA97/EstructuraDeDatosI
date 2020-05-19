package oddoccurrencesinarray;

/**
 *
 * @author Lester Andrés García Aquino
 */
public class OddOccurrencesInArray {

    public static void main(String[] args) {
        
        class OddOcurrenceSolution {
            
            public int solution(int[] a) {
                if (a.length == 1) { //Compares the array length with size 1
                    return a[0]; //If array 'a' size is 1, the function will return a 0 value
                }
                int oddOcurrence = 0; //Declaration of 'oddOcurrence' variable
                for (int i = 0; i < a.length; i++) {
                    oddOcurrence = oddOcurrence ^ a[i]; //Elevates 'oddOcurrence' current value up to the value that is contained in a[i]
                }
                return oddOcurrence; //To finish algorithm, return Odd ocurrence value in the respective array studied previously
            }
        }
    }
}