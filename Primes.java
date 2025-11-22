public class Primes {
    public static void main(String[] args) {
        Boolean[] prime = new Boolean[31];
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
        System.out.println("Prime numbers up to 30:");
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) { 
                count++; 
                System.out.println(i); 
            }  
        }
        System.out.println("There are " + count + " primes between 2 and 30 (33% are primes)");
    }

 
}