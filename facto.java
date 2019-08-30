class Main {
  public static void main(String[] args) {
    facto(5);
  }

  public static void facto(double n){
    double factorial = 1;
        while ( n!=0) {
      factorial=factorial*n;
      n--;
    }
  System.out.println(factorial);}

public static void primo(int n){
       int a=0;    
         for(int i=1;i<(n+1);i++){
         if(n%i==0){
             a++;
            }
         }
         if(a!=2){
              System.out.println("No es primo");
            }else{
                System.out.println("Es primo");
         }
     }
}
}
