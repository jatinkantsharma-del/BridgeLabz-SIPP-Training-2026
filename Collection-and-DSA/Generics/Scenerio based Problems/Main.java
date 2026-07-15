import java.util.*;

// -------------------- Pair<T, U> --------------------
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void display() {
        System.out.println("First : " + first);
        System.out.println("Second: " + second);
    }
}

// -------------------- Generic Stack<T> --------------------
class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

// -------------------- Repository<T> --------------------
class Repository<T> {
    private List<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public List<T> getAll() {
        return data;
    }

    public void display() {
        for (T item : data) {
            System.out.println(item);
        }
    }
}

// -------------------- Employee Entity --------------------
class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

// -------------------- Generic Interface --------------------
interface Printer<T> {
    void print(T value);
}

class StringPrinter implements Printer<String> {
    public void print(String value) {
        System.out.println("Printing: " + value);
    }
}

// -------------------- Generic Constructor --------------------
class Box<T> {
    private T value;

    public <U> Box(U input, T value) {
        this.value = value;
        System.out.println("Generic Constructor Value: " + input);
    }

    public T getValue() {
        return value;
    }
}

// -------------------- Main Class --------------------
public class Main {

    // Generic Method (Comparable Bound)
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (T element : arr) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    // Wildcard <?>
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    // Upper Bounded Wildcard
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }

    // Lower Bounded Wildcard
    public static void addNumbers(List<? super Integer> list) {
        list.add(100);
        list.add(200);
    }

    public static void main(String[] args) {

        // 1. Pair<T,U>
        System.out.println("----- Pair -----");
        Pair<String, Integer> pair = new Pair<>("Hemant", 21);
        pair.display();

        // 2. Generic Stack
        System.out.println("\n----- Stack -----");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek : " + stack.peek());
        System.out.println("Pop  : " + stack.pop());
        System.out.println("Peek : " + stack.peek());

        // 3. Generic findMax()
        System.out.println("\n----- findMax -----");
        Integer[] nums = { 12, 45, 6, 89, 23 };
        System.out.println("Maximum = " + findMax(nums));

        String[] words = { "Apple", "Mango", "Banana" };
        System.out.println("Maximum = " + findMax(words));

        // 4. Generic Repository
        System.out.println("\n----- Repository -----");
        Repository<Employee> repo = new Repository<>();
        repo.add(new Employee(101, "Rahul"));
        repo.add(new Employee(102, "Aman"));
        repo.add(new Employee(103, "Riya"));

        repo.display();

        // 5. Wildcard <?>
        System.out.println("\n----- Wildcard List<?> -----");
        List<String> names = Arrays.asList("A", "B", "C");
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        printList(names);
        printList(numbers);

        // 6. Upper Bounded Wildcard
        System.out.println("\n----- ? extends Number -----");
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        System.out.println("Sum = " + sumNumbers(list1));

        // 7. Lower Bounded Wildcard
        System.out.println("\n----- ? super Integer -----");
        List<Number> list2 = new ArrayList<>();
        addNumbers(list2);
        printList(list2);

        // 8. Generic Interface
        System.out.println("\n----- Generic Interface -----");
        Printer<String> printer = new StringPrinter();
        printer.print("Hello Java");

        // 9. Generic Constructor
        System.out.println("\n----- Generic Constructor -----");
        Box<Integer> box = new Box<>("Constructor", 500);
        System.out.println("Box Value = " + box.getValue());

        // 10. Streams with Generics
        System.out.println("\n----- Streams -----");
        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango");

        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}