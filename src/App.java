public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //List l1 = new List();
        //l1.length = 12;
        //l1.first = "a";
        //System.out.print(l1.length + " " + l1. first+ "\n");
        //l1.print_out();

        List l1 = new List();
        l1.append(4);
        l1.append(5); 
        l1.append(6); 
        l1.append(36);
        l1.append_begin(9);
        l1.append_begin(8);
        l1.append_begin(427);
        System.out.println(l1.array);
        // System.out.println(l1.get(6));
        String el = l1.pop();
        System.out.println(el);
        System.out.println(l1.array);
        l1.remove_first();
        System.out.println(l1.array);
        // System.out.println(l1.get(3));
        // System.out.println(l1.get(-3));
        l1.set(3,2);
        System.out.println(l1.array);

    }    
}