package Java.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>();
        while (n != 0) {
            l.add(input.nextInt());
            n--;
        }
        int q = input.nextInt();
        while (q != 0) {
            String action = input.next();
            int x, y;
            if (action.equalsIgnoreCase("insert")) {
                x = input.nextInt();
                y = input.nextInt();
                l.add(x, y);
            } else if (action.equalsIgnoreCase("delete")) {
                x = input.nextInt();
                l.remove(x);
            }
            q--;
        }
        for (Integer i : l) {
            System.out.print(i.toString() + " ");
        }
    }
}