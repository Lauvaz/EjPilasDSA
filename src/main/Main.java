package main;

public class Main {

    public static void main(String[] args) {
        System.out.println("TEST");
        Stack<Integer> s = new StackImpl<Integer>(5);

        try {
            s.push(5);
            System.out.println(s.size());
            s.push(12);
            System.out.println(s.size());

            Stack<String> s2 = new StackImpl<String>(3);
            s2.push("hola");
            System.out.println(s2.size());
            s2.push("adeu");
            System.out.println(s2.size());
            s2.push("adeu");
            System.out.println(s2.size());
            s2.push("adeu");
            System.out.println(s2.size());


            s2.pop();
            System.out.println(s2.size());
            s2.pop();
            System.out.println(s2.size());
            s2.pop();
            System.out.println(s2.size());



        } catch (EmptyStackException empty) {
            System.out.println("Stack is Empty");
            //
        } catch (FullStackException full) {
            System.out.println("Stack is Full");

            //
        }
         finally {
            //
        }
    }
}
