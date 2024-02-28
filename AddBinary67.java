class AddBinary67 {
    public static void main(String[] args) {
        AddBinary67 a=new AddBinary67();
        System.out.println(a.addBinary("1010","1011"));
    }
    public String addBinary(String a, String b) {
        StringBuffer sb=new StringBuffer("");
        int ai=a.length()-1,bi=b.length()-1,next=0;
        while(ai>=0 || bi>=0 || next==1){
            if(ai>=0 && a.charAt(ai--)=='1'){
                next+=1;
            }
            if(bi>=0 && b.charAt(bi--)=='1'){
                next+=1;
            }
            sb.append(next%2);
            next=next/2%2;
        }
        return sb.reverse().toString();
    }
}
