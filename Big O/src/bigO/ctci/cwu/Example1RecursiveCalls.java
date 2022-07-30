package bigO.ctci.cwu;

/**
 * Example1RecursiveCalls represents the first example on page 40 of Cracking the Coding Interview book.
 * @author Chris Wu
 * @version 1.0
 */
public class Example1RecursiveCalls
{
    /**
     * @param n is an int to be recursively summed down to 0
     * @return the sum of n+(n-1)+(n-2)...+0
     */
    public static int sum(final int n)
    {
        if(n <= 0) // base case
        {
            return 0;
        }
        return n + sum(n - 1);
    }

    /**
     * The entry point of the program
     * @param args is the command line arguments (unused)
     */
    public static void main(final String[] args)
    {
        System.out.println(sum(0)); // 0
        System.out.println(sum(1)); // 1 + 0
        System.out.println(sum(2)); // 2 + 1 + 0
        System.out.println(sum(3)); // 3 + 2 + 1 + 0
    }
}

/*
Notes

Each call stack adds a level to the stack, and takes up memory:
sum(3)
   -> sum(2)
     -> sum(1)
       -> sum(0)

Code like this takes O(n) time and O(n) space
 */