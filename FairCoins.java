public class FairCoins {
  /**
   * Calculate log base 2 of the given integer
   *
   * @param x Some integer
   * @return log_2(x)
   */
  private static int log2(int x) {
    // Use change-of-base formula to implement log2 method
    return (int) (Math.log(x) / Math.log(2));
  }

  /**
   * Given an integer n, representing the starting number of fair coins,
   * return the number of expected rounds before only a single coin remains.
   *
   * @param n The starting number of fair coins
   * @return The expected number of rounds of flipping, after which only a single coin remains.
   */
  public static int get_expected_number_of_rounds(int n) {
    // Handle invalid input
    if (n<1) return 0;

    return log2(n);
  }

  public static void main(String[] args) {
    // Test some inputs [0,32]
    for (int i = 0; i < 33; i++) {
      int expected_number_of_rounds = get_expected_number_of_rounds(i);
      System.out.println(String.format("With %d fair coins, there are %d expected rounds.", i, expected_number_of_rounds));
    }
  }
}
