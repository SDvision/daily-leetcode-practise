class Solution {
    void generateFormation(int n, int open, int close, List<String> formation, String generateString) {
        if (n == open && n == close) {
            formation.add(generateString);
            return;
        }
        
        if ( n > open && open > close) {
            generateString += "(";
            generateFormation(n, open + 1, close, formation, generateString);

            generateString = generateString.substring(0, generateString.length() - 1);
            
            generateString += ")";
            generateFormation(n, open, close + 1, formation, generateString);
        } else if ( n > open && open == close) {
            generateString += "(";
            generateFormation(n, open + 1, close, formation, generateString);
        } else if ( n == open && open > close) {    
            generateString += ")";
            generateFormation(n, open, close + 1, formation, generateString);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> formation = new ArrayList<>();
        int open = 0;
        int close = 0;

        generateFormation(n, open, close, formation, "");

        return formation;
    }
}