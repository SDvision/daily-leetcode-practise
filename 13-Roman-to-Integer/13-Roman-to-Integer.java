class Solution {
    public int romanToInt(String s) {
        int solution = 0;
        for(int i = 0; i < s.length(); i++) {
            int currentValue = getValue(s.charAt(i));
            int nextValue = 0;
            if (i < s.length() -1 ) {
                nextValue = getValue(s.charAt(i+1));
            } 
            if (currentValue < nextValue) {
                solution += (nextValue - currentValue);
                i++;
            } else {
                solution += currentValue;
            }
        }
        return solution;
    }
    public int getValue(char i) {
        switch(i) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}
