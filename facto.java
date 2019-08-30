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
}
