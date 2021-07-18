public class Twofer {
    public String twofer(String name) {
            String ans="One for ";
            if(name==null){
                ans="One for you, one for me.";
            }
            else if(name==""){
                ans="One for , one for me.";
            }
            else{
                ans+=name+", one for me.";
            }
            return ans;
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
