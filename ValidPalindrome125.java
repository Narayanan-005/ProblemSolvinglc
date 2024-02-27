class ValidPalindrome125 {
    public static void main(String[] args) {
        ValidPalindrome125 obj=new ValidPalindrome125();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int start=0,end=s.length()-1;
        while(start<=end){
            if(!Character.isLetter(s.charAt(start)) && !Character.isDigit(s.charAt(start))){
                start++;
            }else if(!Character.isLetter(s.charAt(end)) && !Character.isDigit(s.charAt(end))){
                end--;
            }else if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
