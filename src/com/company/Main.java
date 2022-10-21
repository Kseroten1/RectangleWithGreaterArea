package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i != 0) {
            int[] diameters = new int[6];
            System.out.println("Provide 6 diameters, 2 for each rectangle");
            for (int j = 0; j<=5 ; j++){
                diameters[j] = scanner.nextInt();
            }
            int[] rectangles = new int[3];
            rectangles[0] = diameters[0]*diameters[1];
            rectangles[1] = diameters[2]*diameters[3];
            rectangles[2] = diameters[4]*diameters[5];
            int answer = 1;
            if (rectangles[1] > rectangles[0] && rectangles[1] > rectangles[2]){
                answer = 2;
            }
            if (rectangles[2] > rectangles[0] && rectangles[2] > rectangles[1]){
                answer = 3;
            }

            System.out.printf("Rectangle with biggest area is %d%n",answer);
        }
    }
}
