public class Test {
    public static void main(String[] args) {
        ArrayStack<Integer>s= new ArrayStack<>(2);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.push(10);
        s.push(20);
        System.out.println("\n");


        ArrayStack <Integer> st=new ArrayStack<>(10);
        for (int i = 1; i <=10 ; i++) {
            if(i%3!=0) st.push(i*2);
            else st.pop();
        }
        System.out.println("\n");



        LinkedStack <Integer>sta=new LinkedStack<>();
        sta.push(1);
        sta.push(2);
        System.out.println(sta.size());
        sta.removeAll();
        System.out.println(sta.size());
        System.out.println(sta.popbottom());
        System.out.println("\n");

    }
}