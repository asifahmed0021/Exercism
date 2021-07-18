import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class Sieve {
    int num;
    Sieve(int maxPrime) {
        this.num=maxPrime;
    }

    List<Integer> getPrimes() {
        List<Integer> sieve=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<=num;i++) sieve.add(1);
        for(int i=2;i*i<=num;i++){
            if(sieve.get(i)==0) continue;
            for(int mul=i;mul*i<=num;mul++){
                sieve.set(i*mul,0);
            }
        }
        for(int i=2;i<=num;i++) {
            if (sieve.get(i) == 1) ans.add(i);
        }
        return ans;
    }
}
