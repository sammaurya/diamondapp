package com.github.sammaurya.diamonds.logic;

import com.github.sammaurya.diamonds.ui.OutputInterface;


/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
        implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out) {
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        int count = 2;
        //Upper border +--+
        mOut.print("+");
        for (int i = 1; i <= (size * 2); i++) {
            mOut.print("-");
        }
        mOut.println("+");

        int space = size - 1;
        //
        for (int x = 1; x <= (size * 2) - 1; x++) {
            mOut.print("|");

            if (x < size) {
                //Print Space
                for (int i = x; i <= space; i++) {
                    mOut.print(" ");
                }
                mOut.print("/");
                if (x > 1) {
                    //print ----
                    if (x % 2 == 0) {
                        for (int k = 1; k <= count; k++) {
                            mOut.print("-");
                        }
                    }
                    //print ====
                    else {
                        for (int k = 1; k <= count; k++) {
                            mOut.print("=");
                        }
                    }
                    count = count + 2;
                }
                mOut.print("\\");
                //Print Space
                for (int i = x; i <= space; i++) {
                    mOut.print(" ");
                }
            } else if (x == size) {
                mOut.print("<");
                if (x != 1) {
                    if (x % 2 == 0) {
                        for (int k = 1; k <= count; k++) {
                            mOut.print("-");
                        }
                    }
                    //print ====
                    else {
                        for (int k = 1; k <= count; k++) {
                            mOut.print("=");
                        }
                    }
                }
                count = count - 2;
                mOut.print(">");
            } else if (x > size) {
                for (int i = x; i > space + 1; i--) {
                    mOut.print(" ");
                }
                mOut.print("\\");
                if (x < (size * 2) - 1) {
                    if (x % 2 == 0) {
                        for (int k = 1; k <= count; k++) {
                            mOut.print("-");
                        }
                    }
                    //print ====
                    else {
                        for (int k = 1; k <= count; k++) {
                            mOut.print("=");
                        }
                    }
                    count = count - 2;
                }
                mOut.print("/");
                for (int i = x; i > space + 1; i--) {
                    mOut.print(" ");
                }
            }

            mOut.println("|");
        }
        mOut.print("+");
        for (int i = 1; i <= (size * 2); i++) {
            mOut.print("-");
        }
        mOut.println("+");
    }

}

