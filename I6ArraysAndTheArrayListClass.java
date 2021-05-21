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

        printValuesFromArray();

    }

    public static void printValuesFromArray() {

        int[] refernces = { 5, 7, 9, 1, 5 };

        for (int i = 0; i < refernces.length; i++) {
            System.out.println(refernces[i]);
        }

    }
}