package com.company;

import java.util.Scanner;
import java.lang.Integer;

public class Main {

    public static void main(String[] args) {
        Integer num = -1;
        Scanner sc = new Scanner(System.in);
        byte byteNum = num.byteValue();
        char charNum = (char)byteNum;
        int finalInt = charNum;
        System.out.println(finalInt);
    }
}

/*   REASON   */
/*byte data type is of 8 bit number with range of -128 to +127.
So it can easily store -1.
The char data type is a single 16-bit Unicode character.
It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
There are no negative chars.
 */
