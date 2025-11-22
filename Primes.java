public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Boolean[] prime = new Boolean[n+1];
        for (int i = 0; prime.length>i; i++){
            prime[i] = true;
        }
        prime[0] = false; prime [1] = false; prime[2] = true;
        for (int i = 3; prime.length>i;i++){
            int temp = i;
            for (int j = 2; temp>j;j++){
                if (temp % j == 0) {
                    prime[i] = false;
                }
            }
         
        }
       int count = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) { 
                count++; 
                System.out.println(i); 
            }  
         
        }
        System.out.println("There are " + count + " primes between 2 and " + n + " (" +  (count * 100) / n + "% are primes)") ;
    }

 
}