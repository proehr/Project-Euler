public class Project35 {

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

        return prime;
    }

    public int solution(){
        boolean[] primes = sieveOfEratosthenes(1000000);
        int count =0;
        for(int i=2;i<1000000;i++){
            if(primes[i]){
                String number = Integer.toString(i);
                boolean isCircular = true;
                for(int j=1;j<number.length();j++){
                    number=number.substring(1)+number.substring(0,1);
                    if(!primes[Integer.parseInt(number)]){
                        isCircular=false;
                        break;
                    }
                }
                if(isCircular){
                    count++;
                }

            }
        }
        return count;
    }
}
