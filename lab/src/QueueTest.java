import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @org.junit.jupiter.api.Test
    void add() {
        Queue<String> q = new Queue<>();
        q.add("This is a queue");
        q.add("Queues are a great data structure");
        q.add("My teacher, Miss Orms, loves queues");
        assertEquals("This is a queue", q.remove());
    }

    @org.junit.jupiter.api.Test
    void remove() {
        Queue<String> q = new Queue<>();
        q.add("This is a queue");
        q.add("Queues are a great data structure");
        q.add("My teacher, Miss Orms, loves queues");
        q.remove();
        assertEquals("Queues are a great data structure", q.remove());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        Queue<String> q = new Queue<>();
        q.add("This is a queue");
        q.add("Queues are a great data structure");
        q.add("My teacher, Miss Orms, loves queues");
        q.remove();
        q.remove();
        assertEquals("My teacher, Miss Orms, loves queues", q.peek());
    }

    @org.junit.jupiter.api.Test
    void size() {
        Queue<String> q = new Queue<>();
        q.add("This is a queue");
        q.add("Queues are a great data structure");
        q.add("My teacher, Miss Orms, loves queues");
        assertEquals(3, q.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Queue<String> q = new Queue<>();
        q.add("This is a queue");
        q.add("Queues are a great data structure");
        q.add("My teacher, Miss Orms, loves queues");
        Queue<String> w = new Queue<>();
        assertEquals(3, q.size());
        assertEquals(0, w.size());

    }
}