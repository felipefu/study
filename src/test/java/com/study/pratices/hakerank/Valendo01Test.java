package com.study.pratices.hakerank;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class Valendo01Test {

    @Test
    public void testChallenge00() {

        Assert.assertEquals(List.of(1, 2), Valendo01.processLogs(List.of("1 2 50", "1 7 70", "1 3 20", "2 2 17"), 2));
        Assert.assertEquals(List.of(1, 2), Valendo01.processLogs(List.of("9 7 50", "22 7 20", "33 7 50", "22 7 30"), 3));

    }

}
