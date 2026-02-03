import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void push() {
        Stack s = new Stack();
        s.push(5);
        s.push(18);
        s.push(74);
        assertEquals(74, s.peek());
    }

    @Test
    void pop() {
        Stack s = new Stack();
        s.push(999);
        s.push(1000);
        assertEquals(1000, s.pop());
        assertEquals(999, s.pop());
    }

    @Test
    void peek() {
        Stack s = new Stack();
        s.push(220);
        s.push(15);
        assertEquals(15, s.peek());
        s.pop();
        assertEquals(220, s.peek());
    }

    @Test
    void size() {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals(4, s.size());
        s.pop();
        assertEquals(3, s.size());
    }

    @Test
    void isEmpty() {
        Stack s = new Stack();
        assertTrue(s.isEmpty());
        s.push(14);
        assertFalse(s.isEmpty());
    }
}