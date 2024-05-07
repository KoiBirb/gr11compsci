public class Stack {

    public final int size;
    private int Top;
    private int[] stack;

    public Stack (int size){
        this.size = size;
        stack = new int[size];
        Top = 0;
    }

    public boolean push (int value){
       if (Top < size) {
           stack[Top] = value;
           Top++;
           return true;
       } else {
           return false;
       }
    }

    public int pop (){
        if (Top > 0) {
            Top--;
            int temp = stack[Top];
            stack[Top] = 0;
            return temp;
        } else {
            return -1;
        }
    }

    public int top (){
        if (Top > 0) {
            return stack[Top - 1];
        } else {
            return -1;
        }
    }

    public boolean isEmpty(){
        return Top == 0;
    }

    public int size(){
        return Top;
    }

    public void makeEmpty(){
        for (int i = 0; i < size; i++){
            stack[i] = 0;
        }
        Top = 0;
    }
}
