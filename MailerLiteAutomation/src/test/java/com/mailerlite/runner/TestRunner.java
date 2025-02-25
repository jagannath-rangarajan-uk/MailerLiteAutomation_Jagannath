package com.mailerlite.runner;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        TestListenerAdapter tla = new TestListenerAdapter();
        testNG.addListener(tla);

        List<String> suites = new ArrayList<>();
        suites.add("testng.xml");

        testNG.setTestSuites(suites);
        testNG.run();
    }
}
