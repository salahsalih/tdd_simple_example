package com.salah.cs;

public class LogicGate {
    public static int NOT(int input) {
        input = getInputWeight(input);
        if (input >= 1)
            return 0;
//        else if (input <= 0)
            return 1;
//        return -1;
    }

    public static int OR(int input1, int input2) {
        input1 = getInputWeight(input1);
        input2 = getInputWeight(input2);
        int sum = input1 + input2;
        if (sum > 1)
            return 1;
//        if (sum < 0)
//            return 0;
        return sum;
    }

    public static int AND(int input1, int input2) {
        input1 = getInputWeight(input1);
        input2 = getInputWeight(input2);
        int sum = input1 * input2;
        if (sum > 1)
            return 1;
        if (sum < 0)
            return 0;
        return sum;
    }

    public static int XOR(int input1, int input2) {
        int r = AND(input1, NOT(input2));
        int l = AND(NOT(input1), input2);
        int res = OR(r, l);
        return res;
    }


    private static int getInputWeight(int input) {
        if (input >= 1)
            return 1;
        return 0;
    }
}
