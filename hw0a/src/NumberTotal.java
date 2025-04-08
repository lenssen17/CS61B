/**
 * Exercise sourced from Practice-It by the University of Washington.
 * Original problems available at: https://practiceit.cs.washington.edu/
 *
 * @author Erik Kizior
 */

// TODO: What is the output of the following program?
public class NumberTotal {
    public static void main(String[] args) {
        int total = 25;
        for (int number = 1; number <= (total / 2); number++) {
            total = total - number;
            System.out.println(total + " " + number);
        }
    }
}

/* Before running the code, type your answer below.

24 1
22 2
19 3
15 4
10 5

Then, click the green play button to check your work. */