package com.salah.cs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class LogicGateTest {
    @Test
    public void testNot() {
        int res = LogicGate.NOT(0);
        Assert.assertEquals(res, 1);
        res = LogicGate.NOT(1);
        Assert.assertEquals(res, 0);
        res = LogicGate.NOT(10);
        Assert.assertEquals(res, 0);
        res = LogicGate.NOT(-10);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testOr() {
        int res = LogicGate.OR(0, 0);
        Assert.assertEquals(res, 0);
        res = LogicGate.OR(1, 0);
        Assert.assertEquals(res, 1);
        res = LogicGate.OR(1, 1);
        Assert.assertEquals(res, 1);
        res = LogicGate.OR(-1, -1);
        Assert.assertEquals(res, 0);
        res = LogicGate.OR(-10, 9);
        Assert.assertEquals(res, 1);
    }

    @Test
    public void testAnd() {
        int res = LogicGate.AND(0, 0);
        Assert.assertEquals(res, 0);
        res = LogicGate.AND(1, 0);
        Assert.assertEquals(res, 0);
        res = LogicGate.AND(1, 1);
        Assert.assertEquals(res, 1);
        res = LogicGate.AND(-1, -1);
        Assert.assertEquals(res, 0);
        res = LogicGate.AND(-10, 9);
        Assert.assertEquals(res, 0);
    }
    @Test
    public void testXor() {
        int res = LogicGate.XOR(0, 0);
        Assert.assertEquals(res, 0);
//        res = LogicGate.AND(1, 0);
//        Assert.assertEquals(res, 0);
//        res = LogicGate.AND(1, 1);
//        Assert.assertEquals(res, 1);
//        res = LogicGate.AND(-1, -1);
//        Assert.assertEquals(res, 0);
//        res = LogicGate.AND(-10, 9);
//        Assert.assertEquals(res, 0);
    }
}