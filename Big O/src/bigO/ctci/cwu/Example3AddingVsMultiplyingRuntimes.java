package bigO.ctci.cwu;

/**
 * Example3AddingVsMultiplyingRuntimes represents the example on page 43 of Cracking the Coding Interview book.
 * @author Chris Wu
 * @version 1.0
 */
public class Example3AddingVsMultiplyingRuntimes
{

    /**
     * The entry point of the program
     * @param args is the command line arguments (unused)
     */
    public static void main(final String[] args)
    {
        int[] arrA;
        int[] arrB;

        arrA = new int[]{0, 1, 2, 3};
        arrB = new int[]{4, 5, 6, 7};

        // addRuntimes: O(A + B)
        for(int a : arrA)                // do A chunks of work
        {
            System.out.println(a);
        }

        for(int b : arrB)                 // do B chunks of work
        {
            System.out.println(b);
        }

        // ==========================================================================

        // multiplyRuntimes: O(A * B)
        for(int a : arrA)                                       // for every element in arrA
        {
            for(int b : arrB)                                   // do B chunks of work
            {
                System.out.println("a=" + a + ", b=" + b);
            }
        }
    }
}