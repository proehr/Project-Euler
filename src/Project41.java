public class Project41 {

    private boolean[] sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean[] prime = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        prime[0]=false;
        prime[1]=false;


        return prime;
    }

    public int solution(){
        boolean[] prime = sieveOfEratosthenes(10000000);
        for(int i=prime.length-1;i>0;i--){
            if(prime[i]==true){
                String digitString = Integer.toString(i);
                boolean isPandigital = true;
                for(int k=1;k<=digitString.length();k++){
                    if(!digitString.contains(Integer.toString(k))){
                        isPandigital=false;
                        break;
                    }
                }
                if(isPandigital){
                    return i;
                }
            }
        }
        return 0;
    }


}
