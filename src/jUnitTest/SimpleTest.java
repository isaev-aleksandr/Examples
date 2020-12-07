package jUnitTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @BeforeEach
    public void before() {
        System.out.println("before");
    }

    @AfterEach
    public void after() {
        System.out.println("after");
    }

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }
}