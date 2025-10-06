package lab3;

import java.util.Scanner;

public class Utils {
    private static Scanner sc = new Scanner(System.in);

    public int getInt(String msg) {
        System.out.print(msg + ": ");
        return sc.nextInt();
    }

    public int getInt() {
        return getInt("enter Integer");
    }

    public String getString(String msg) {
        System.out.print(msg + ": ");
        return sc.next();
    }

    public String getString() {
        return getString("enter String");
    }


}
