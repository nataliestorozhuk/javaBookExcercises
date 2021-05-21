import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.io.*;
import java.lang.reflect.Array;
import java.sql.Date;
import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.*;

public class I6ArraysAndTheArrayListClass {

    public static void run() {

        // printValuesFromArray();
        // copyValuesFromOneArrayToAnother();
        stringArray();

    }

    public static void printValuesFromArray() {

        int[] refernces = { 5, 7, 9, 1, 5 };

        for (int i = 0; i < refernces.length; i++) {
            System.out.println(refernces[i]);
        }

    }

    public static void copyValuesFromOneArrayToAnother() {

        int[] numberArray1 = { 5, 3, 6, 4, 1, 1, 3, 6, 9 };
        int[] numberArray2 = new int[numberArray1.length];

        for (int i = 0; i < numberArray1.length; i++) {
            numberArray2[i] = numberArray1[i];
            System.out.println(numberArray2[i] + "\t\t" + numberArray1[i]);

        }

    }

    public static void stringArray() {
        int totalStringInArray = 0;
        String[] names = { "Einstein", "Newton", "Copernicus", "Kepler" };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            totalStringInArray += names[i].length();
        }
        System.out.println(totalStringInArray);
    }
}