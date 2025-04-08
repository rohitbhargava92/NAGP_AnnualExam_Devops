package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringOperatorCheck {

    @Test(description = "Verify Concatenation of Strings", groups = {"regression","smoke"})
    public void TestAdditionOfStrings() {
        String a="Rohit";
        String b="Bhargava";
        Assert.assertEquals(a+b, "RohitBhargava", "Concatenation of strings is not correct");
    }

    @Test(description = "Verify CharAt", groups = {"regression"})
    public void TestCharAtOfStrings() {
        String a="Rohit";
        Assert.assertEquals(String.valueOf(a.charAt(0)), "R", "Char At is not correct");
    }
}