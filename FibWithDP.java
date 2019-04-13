public class FibWithDP {

  public static void main(String[] args) {
    System.out.println(getFibNum(6));
  }

  public static int getFibNum(int num) {
    if (num == 0)
      return 0;
    int[] fib = new int[num + 1];
    fib[0] = 0;
    fib[1] = 1;
    for (int i = 2; i < fib.length; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib[num];
  }
}