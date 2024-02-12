class Solution {
    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();
        int i;
        for (i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));
            // add opening into stk
            if (ch.equals("(") || ch.equals("{") || ch.equals("[")) {
                st.push(ch);
                continue;
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (ch.equals(")")) {
                    if (!st.pop().equals("("))
                        return false;
                } if (ch.equals("]")) {
                    if (!st.pop().equals("["))
                        return false;
                } if (ch.equals("}")) {
                    if (!st.pop().equals("{"))
                        return false;
                }
            }
        }
        if (i == s.length() && st.isEmpty()) {
            return true;
        }
        return false;
    }
}