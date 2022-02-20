class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        addParen(n, n, list, 0, new char[n*2]);
        return list;
    }
    
    private void addParen(int leftParen, int rightParen, List<String> list, int index, char[] str){
        if(leftParen<0 || rightParen < leftParen) return;
        if(leftParen==0 && rightParen==0){
            list.add(String.valueOf(str));
        }else{
            if(leftParen > 0){
                str[index] = '(';
                addParen(leftParen-1, rightParen, list, index+1, str);
            }
            if(rightParen > 0){
                str[index] = ')';
                addParen(leftParen, rightParen-1, list, index+1, str);
            }
        }
    }
}