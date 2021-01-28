import java.util.Random;
public class montyHallParadox {
    static Random randomGenerator  = new Random();
    static int iterations = 1000;

    public static void main(String [] args)
    {
        int winningStrat = 0;
        int strategy2 = 0;
        for(int i = 0; i < iterations; i++)
        {
            int prze = randomGenerator.nextInt(3);
            int playerOption = randomGenerator.nextInt(3);
            //The host selects a new door without the prize.
            int hostOption = chooseAlterDoor(prze, playerOption);
            //Switch player's Choice.
            int playerOption2 = chooseAlterDoor(playerOption, hostOption);
            if(playerOption2 == prze)
                winningStrat++;
            strategy2 = 1000 - winningStrat;
        }
        System.out.println("After 1000 runs, strategy 1 yielded " + winningStrat
                + " wins strategy 2 yielded " + strategy2 );
    }
    /***
     * This method picks a random door other than door1
     * or door2.
     * @param door1
     * @param door2
     * @return
     */
    static int chooseAlterDoor(int door1,int door2)
    {
        int door3;
        do
            door3 = randomGenerator.nextInt(3);
            while (door3 == door1 || door3 == door2);
            return door3;

    }
}
