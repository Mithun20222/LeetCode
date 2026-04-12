class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String t = tokens[i];
            if (!t.equals("+") && !t.equals("-") &&
                !t.equals("*") && !t.equals("/")) {
                st.push(Integer.parseInt(t));
            } else {
                int b = st.pop();
                int a = st.pop();
                if (t.equals("+")) {
                    st.push(a + b);
                } else if (t.equals("-")) {
                    st.push(a - b);
                } else if (t.equals("*")) {
                    st.push(a * b);
                } else if (t.equals("/")) {
                    st.push(a / b);
                }
            }
        }

        return st.pop();
    }
}
