class Solution {
    public int reverse(int x) {
        String str = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try{
            return x < 0 ? Integer.parseInt(str)*-1 : Integer.parseInt(str);
        }catch(NumberFormatException e){
            return 0;
        }
    }
}