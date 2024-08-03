import java.util.Stack;

class MinStack {
    private final Stack<Integer> st;
    private final Stack<Integer> minst;

    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();
    }

    public void push(int info) {
        st.push(info);
        if(minst.isEmpty() || info<=minst.peek()) minst.push(info);
    }

    public void pop() {
        int a = minst.peek();
        if (st.pop()==a) minst.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minst.peek();
    }
}