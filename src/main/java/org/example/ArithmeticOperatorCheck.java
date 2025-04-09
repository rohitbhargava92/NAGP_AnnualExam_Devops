package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticOperatorCheck extends BaseTest {

    @Test(description = "Verify Addition of Numbers", groups = {"regression","smoke"})
    public void TestAdditionOfNumbers() {
        int a=9;
        int b=10;
        extentTest= extentReports.createTest("TestAdditionOfNumbers", "Verify Addition of Numbers");
        Assert.assertEquals(a+b, 19, "Addition of numbers is not correct");
    }

    @Test(description = "Verify Subtraction of Numbers", groups = {"regression"})
    public void TestSubtractionOfNumbers() {
        int a=19;
        int b=10;
        extentTest= extentReports.createTest("TestSubtractionOfNumbers", "Verify Subtraction of Numbers");
        Assert.assertEquals(a-b, 9, "Subtraction of numbers is not correct");
    }

    @Test(description = "Verify Subtraction of Numbers", groups = {"regression"})
    public void TestMultiplicationOfNumbers() {
        int a=9;
        int b=10;
        extentTest= extentReports.createTest("TestMultiplicationOfNumbers", "Verify Multiplication of Numbers");
        Assert.assertEquals(a*b, 90, "Multiplication of numbers is not correct");
    }

    @Test(description = "Verify Subtraction of Numbers", groups = {"regression","smoke"})
    public void TestDivisionOfNumbers() {
        int a=9;
        int b=3;
        extentTest= extentReports.createTest("TestDivisionOfNumbers", "Verify Division of Numbers");
        Assert.assertEquals(a/b, 3, "Division of numbers is not correct");
    }
}