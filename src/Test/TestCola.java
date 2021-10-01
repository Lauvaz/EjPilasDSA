package Test;

import main.FullStackException;
import main.Stack;
import main.StackImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCola {
    Stack<Integer> q;
    @BeforeEach
    void setUp() throws Exception{
        this.q = (StackImpl<Integer>) new StackImpl<Integer>(5);
        this.q.push(1);
        this.q.push(2);
        this.q.push(3);
    }

    @AfterEach
    void tearDown() {
        this.q = null;
    }

    @Test
    void TestPush() throws Exception {
        Assertions.assertEquals(3,this.q.size());
        this.q.push(4);
        this.q.push(5);
        Assertions.assertEquals(5,this.q.size());
    }
    @Test
    void TestPushFull() throws Exception {
        Assertions.assertEquals(3,this.q.size());
        this.q.push(4);
        this.q.push(5);
        this.q.push(6);
        Assertions.assertEquals(5,this.q.size());
    }
}