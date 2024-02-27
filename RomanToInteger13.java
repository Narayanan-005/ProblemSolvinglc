import java.util.*;
class RomanToInteger13 {
    public static void main(String[] args) {
        RomanToInteger13 obj=new RomanToInteger13();
        System.out.println(obj.romanToInt("LVIII"));
    }
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int tot=0,l=s.length();
        for(int i=0;i<l;i++){
            if(i<l-1 && s.charAt(i)=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                tot+=map.get(s.charAt(i+1))-map.get(s.charAt(i++));
            }else if(i<l-1 && s.charAt(i)=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                tot+=map.get(s.charAt(i+1))-map.get(s.charAt(i++));
            }else if(i<l-1 && s.charAt(i)=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                tot+=map.get(s.charAt(i+1))-map.get(s.charAt(i++));
            }else{
                tot+=map.get(s.charAt(i));
            }
        }
        return tot;
    }
}
