package bigO.ctci.cwu;

/**
 * Example2PairSumSequence represents the example 2 on page 41 of Cracking the Coding Interview book.
 * @author Chris Wu
 * @version 1.0
 */
public class Example2PairSumSequence
{
    /**
     * @param n is number of iterations to perform pair sum
     * @return the sum of  (0 + 1) + (1 +2) + (2 + 3) + ... + ((n-1) + (n)), w/ base case being n = 0
     */
    public static int pairSumSequence(final int n)
    {
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    private static int pairSum(final int a,
                               final int b)
    {
        return a + b;
    }

    /**
     * The entry point of the program
     * @param args is the command line arguments (unused)
     */
    public static void main(final String[] args)
    {
        System.out.println(pairSumSequence(0)); //  0 base case
        System.out.println(pairSumSequence(1)); // (0 + 1)
        System.out.println(pairSumSequence(2)); // (0 + 1) + (1 + 2)
        System.out.println(pairSumSequence(3)); // (0 + 1) + (1 + 2) + (2 + 3)
    }
}

/*
Notes

There'll be roughly O(n) calls to pairSum. However, those calls do NOT exist simultaneously on the call stack,
so we only need O(1) space.

Lesson: just b/c we have n calls, it doesn't mean it takes O(n) time
 */