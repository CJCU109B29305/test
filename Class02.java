class C{
    public static void is_prime(int n){
        int sum = 0;
        for(int i = 1 ;i <= n+1;i++){
            if(n%i == 0){
                sum += i ;
                if(sum == 1+n){
                    System.out.println("YES");
                    break;    
                }
                else{
                    System.out.println("NO");
                    break;
                    
                }
            }  
        }
    }
}
public class Class02 {
    public static void main(String[]args){
        C.is_prime(39);
    }
}
