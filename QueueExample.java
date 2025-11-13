class MyQueue<T> {
    public int size;
    public int max_size;
    public int left;
    public int right;

    public Object[] data = new Object[1000];
    public int index;

    public MyQueue() {
        max_size = 10000;
        size = 0;
        left = 0;
        right = 0;
    }

    public void enqueue(T item) {
        data[right] = item;
        right = (right + 1) % max_size;
        size++;
    }

    public T dequeue() {
        T deletedElement = (T) data[left];
        left = (left + 1) % max_size;
        size--;
        return deletedElement;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    // 返回队列中的元素数量
    public int size() {
        return size;
    }
}

public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        // do some test if needed
    }
}

// 我的Junit測試會測這個Object，這邊以下請不要修改
// ---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
// ---------------------------------------------------------------------------------