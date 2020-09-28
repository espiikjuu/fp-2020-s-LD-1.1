public class Numbers {
    static String check(int n ) {
        int sum =1;
        for(int i=2; i * i <= n; i++){
            if(n % i==0){
                if(i*i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        if (sum==n) {
            return "perfect";
        }
        else if (sum>n) {
            return "abundant";
        }
        else {
            return "deficient";
        }

    }
    public static void main (String[] args) {
        System.out.println(check(496));
    }

}
