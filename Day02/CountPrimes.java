package Day02;
public class CountPrimes {
    public static void main(String[] args) {
        int totalPrimes=countPrimes(5);
        System.out.println(totalPrimes);
    }
    public static int countPrimes(int n) {
        int c=0;
        Boolean [] p=new Boolean[n];
        for(int i=0;i<n;i++){
            p[i]=true;
        }
        if(n>0){
            p[0] =false;
        }
        if(n>1){
            p[1] =false;
        }
        for(int i =2;i*i<=n;i++){
            
            if(p[i]==true){
                for(int j=2;j*i<n;j++){
                    p[j*i]=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(p[i]==true){
                c++;
            }
        }
    return c;
    }
}

