// 12S24013 - ADRYAN JULIANTO PANJAITAN
// 12S24008 - ROSPIKA SARAH YOSEFIN SIREGAR

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] name = new String[4];

        fungsi1(name);
        fungsi2(name);
    }
    
    public static void fungsi1(String[] name) {
        int i;

        for (i = 0; i <= 3; i++) {
            name[i] = "";
        }
    }
    
    public static void fungsi2(String[] name) {
        int j, k;

        for (j = 0; j <= 3; j++) {
            name[j] = input.nextLine();
            if (name[j].equals("---")) {
                name[j] = "";
                k = j;
                j = 4;
            } else {
                k = j;
            }
        }
        fungsi3(name);
    }
    
    public static void fungsi3(String[] name) {
        int x;

        for (x = 0; x <= 3; x++) {
            System.out.println(name[x]);
        }
    }
}
