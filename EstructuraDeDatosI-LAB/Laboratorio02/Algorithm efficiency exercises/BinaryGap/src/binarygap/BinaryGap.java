package binarygap;

/**
 *
 * @author Lester Andrés García Aquino
 */
public class BinaryGap {

    public static void main(String[] args) {
        class BinaryGapSolution {
            
            public int solution(int n) {

                //Base and Edge Cases
                if (n < 5) {
                    return 0;
                } else if (n == 5) {
                    return 1;
                } else if (n < 9) {
                    return 0;
                }

                String bin = Integer.toBinaryString(n); //Integer represented in a binary string
                int maxCount = 0; //Max Count
                int cCount = 0; //Count

                for (int i = 1; i < bin.length(); i++) //Loop that travels through a binary string from de second element
                {
                    if (bin.charAt(i) == '0') {
                        cCount++; //Increment 'Count' if the digit is 0
                    } else if (cCount > 0) //Digit is 1, if Count is not 0
                    {
                        maxCount = (cCount > maxCount) ? cCount : maxCount; //Set 'maxCount' if Count is greater than it
                        cCount = 0; //Reset 'Count'
                    }
                }
                return maxCount; //Return 'maxCount'
            }
        }
    }
}
