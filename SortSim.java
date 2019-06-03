
import java.util.Random;
import java.util.Scanner;

/**
 * A class to manage a textual numeric sorting simulation.
 * 
 * @author Sean Barker
 */
public class SortSim {

    /**
     * Pause duration after each update (ms).
     */
    private final long simDelay;

    /**
     * The data being sorted.
     */
    private final int[] data;

    /**
     * Setup a new sorting simulation on an array of the specified size and range of random values.
     * 
     * @param size The size of the new array.
     * @param maxVal Random values will be distributed between 0 and maxVal.
     */
    public SortSim(int size, int maxVal) {
        clear();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter simulation delay in ms (e.g., 1000): ");
        simDelay = sc.nextLong();
        sc.close();
        clear();
        data = genRandArray(size, maxVal);
    }
    
    /**
     * Get the simulation's array.
     */
    public int[] getData() {
        return data;
    }

    /**
     * Generate a random array of ints.
     * @param size The size of the new array.
     * @param maxVal Random values will be distributed between 0 and maxVal.
     * @return The array of random data.
     */
    private static int[] genRandArray(int size, int maxVal) {
        Random rand = new Random();
        int[] randArray = new int[size];
        for (int i = 0; i < size; i++) {
            randArray[i] = rand.nextInt(maxVal);
        }
        return randArray;
    }

    /**
     * Clear the BlueJ terminal.
     */
    private static void clear() {
        System.out.print('\u000C');
    }

    /**
     * Interpret the value -1 as a gap and all others as their literal values.
     */
    private String strVal(int index) {
        return data[index] == -1 ? "__" : (data[index] + "");
    }

    /**
     * Update the simulation display.
     * 
     * @param swap Whether the array was just changed.
     * @param emph1 The first index to emphasize, or -1.
     * @param emph2 The second index to emphasize, or -1.
     * @param comment An arbitrary comment to show on the simulation display, or null.
     */
    public void update(boolean swap, int emph1, int emph2, String comment) {
        clear();
        String s = "";
        for (int i = 0; i < data.length; i++) {
            if (i == emph1 || i == emph2) {
                if (swap) {
                    s += "*" + strVal(i) + "*\t";
                } else {
                    s += ">" + strVal(i) + "<\t";
                }
            } else {
                s += " " + strVal(i) + "\t";
            }
        }
        System.out.println(s);
        if (comment != null) {
            System.out.println(comment);
        }
        try {
            Thread.sleep(simDelay);
        } catch (InterruptedException e) {}
    }

    /**
     * Notify the simulator that the sort is finished.
     */
    public void finish() {
        clear();
        String s = "";
        for (int i = 0; i < data.length; i++) {
            s += " " + strVal(i) + "\t";
        }
        System.out.println(s);
        System.out.println("finished!");
    }

}
