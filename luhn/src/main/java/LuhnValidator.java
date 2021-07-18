class LuhnValidator {

    boolean isValid(String str) {
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') continue;
            if(!Character.isDigit(str.charAt(i))) return false;
            s+=str.charAt(i);
        }
        if(s.length()<2) return false;
        int sum=0;
        int l=s.length();
        for(int i=s.length()-2;i>=0;i-=2){
            int curr=Integer.valueOf(Character.toString(s.charAt(i)));
            if(curr*2>=10) sum+=curr*2 -9;
            else sum+=curr*2;
        }
        for(int i=s.length()-1;i>=0;i-=2){
            int curr=Integer.valueOf(Character.toString(s.charAt(i)));
            sum+=curr;
        }
        return sum%10==0;
    }

}
