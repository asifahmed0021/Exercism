class IsbnVerifier {
//3-598-21507-X
    boolean isValid(String s) {
        int dash=countDash(s);
        if(s.length()>13 || s.length()<10) return false;
        if(dash==3 && s.length()!=13) return false;
        if(dash==0 && s.length()!=10) return false;
        String str="";
        for(int i=0;i<s.length();i++) if(s.charAt(i)!='-') str+=s.charAt(i);
        if(!Character.isDigit(str.charAt(str.length()-1)) && str.charAt(str.length()-1)!='X') return false;
        for(int i=0;i<str.length()-1;i++){
            if(!Character.isDigit(str.charAt(i))) return false;
        }
        int sum=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='X') sum+=10;
            else{
                sum+=Integer.parseInt(Character.toString(str.charAt(i)))*(10-i);
            }
        }
        return sum%11==0;
    }

    int countDash(String s){
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-') ans++;
        }
        return ans;
    }

}
