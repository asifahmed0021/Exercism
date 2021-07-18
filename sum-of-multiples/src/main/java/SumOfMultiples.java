class SumOfMultiples {

    int number;
    int[] s;

    SumOfMultiples(int number, int[] set) {
        this.number=number;
        s = new int[set.length];
        for(int i=0;i<set.length;i++){
            s[i]=set[i];
        }
    }

    int getSum() {
        int ans=0;
        for(int i=0;i<s.length;i++){
            int curr=s[i];
            int mul=1;
            while(mul*curr<number){
                ans+=mul*curr;
                mul++;
            }
        }
        return ans;
    }

}
