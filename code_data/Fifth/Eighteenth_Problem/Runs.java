package code_data.Fifth.Eighteenth_Problem;
// ********************************************************************
// Runs.java
//
// Finds the length of the longest run of heads in 100 flips of a coin.
// ********************************************************************

public class Runs
{
    public static void main (String[] args)
    {
        final int FLIPS = 100; // number of coin flips

        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0;     // length of the maximum run so far
        int head_up = 0, head_down = 0;
        // Create a coin object
        Coin coin = new Coin();
        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++)
        {
            // Flip the coin & print the result
            coin.flip();
            if (coin.isHeads())
            {
                currentRun++;
                head_up++;
            }
            else{
                head_down++;
                if(currentRun > maxRun){
                    maxRun = currentRun;
                    currentRun = 0;
                }
                else currentRun = 0;
            }
            System.out.println(coin.toString());
            // Update the run information
        }
        System.out.println("The number of Head are: " + head_up);
        System.out.println("The number of Tail are: " + head_down);
        System.out.println("The number of max_run are: " + maxRun);
        // Print the results

    }
}
