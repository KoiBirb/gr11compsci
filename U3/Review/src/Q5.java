public class Q5 {
        public static void main(String[] args) {
            Stack s = new Stack(10);

            System.out.println("Adding 10 and 13 to stack.");
            s.push(10);
            s.push(13);
            System.out.println("Top of stack: " + s.top());
            System.out.println("Items in stack: " + s.size());
            System.out.println("Removing top item.");
            s.pop();
            System.out.println("Top of stack: " + s.top());
            System.out.println("Items in stack: " + s.size());
            System.out.println("Adding a new item.");
            s.push(40);
            System.out.println("Top of stack: " + s.top());
            System.out.println("Items in stack: " + s.size());
        }
}
