using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace numersSum_noOperator
{
    class Program
    {
        //This algorithm allows to make sums without using de sum operator "+"
        static void Main(string[] args)
        {
            //Variables declaration
            int Neg = -1; //Negative variable
            int Pos = 1; //Positive variable
            double n1 = 0, n2 = 0, Result = 0; //First and Second number and a variable for the result
            bool var1 = false;//Validates that it is a number in the first data
            bool var2 = false;//Validates that it is a number in the second data

            //Using variables as double type enable us to use real numbers

            //Capturing values
            while (var1 == false)
            {
                Console.WriteLine("Type the first number, letters and blank spaces are not admitted");
                var1 = double.TryParse(Console.ReadLine(), out n1);
            }

            while (var2 == false)
            {
                Console.WriteLine("Type the second number, letters and blank spaces are not admitted");
                var2 = double.TryParse(Console.ReadLine(), out n2);
            }

            //If structure to evalute the different cases
            if ((n1 > 0) && (n2 > 0))//Case 1: The two numbers are positive numbers
            {
                Result = ((n1 * Neg) - (n2)) * Neg;
                Console.WriteLine("The sum result is " + Result);
                Console.ReadLine();
            }
            else if ((n1 < 0) && (n2 < 0))//Case 2: The two numbers are negative
            {
                Result = ((n1) - (n2 * Neg));
                Console.WriteLine("The sum result is " + Result);
                Console.ReadLine();
            }
            else if ((n1 > 0) && (n2 < 0))//Case 3: The first number is positive and the second number is negative
            {
                Result = ((n1 * Neg) - (n2 * Pos)) * Neg;
                Console.WriteLine("The sum result is " + Result);
                Console.ReadLine();
            }
            else if ((n1 < 0) && (n2 > 0))//Case 4: The first number is negative and the second number is positive
            {
                Result = ((n1 * Pos) - (n2 * Neg));
                Console.WriteLine("The sum result is " + Result);
                Console.ReadLine();
            }
        }
    }
}