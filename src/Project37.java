public class Project37 {

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
        boolean[] primes = sieveOfEratosthenes(1000000);
        int count =0;
        int sum = 0;
        for(int i=10;i<1000000;i++){
            if(primes[i]){
                boolean truncatable = true;
                for(int j =10;j<i;j*=10){
                    if(!primes[i/j] || !primes[i%j]){
                        truncatable=false;
                        break;
                    }
                }
                if(truncatable){
                    sum+=i;
                    count++;
                    System.out.println(i);
                }
            }
        }
        System.out.println(count);
        return sum;
    }
}
