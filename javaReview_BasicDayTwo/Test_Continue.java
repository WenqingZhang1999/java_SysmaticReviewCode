public class Test_Continue {
    public static void main(String args[]) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int x : numbers) {
            if (x <= 50) {
                System.out.print("金毛子");

                if (x == 30) {
                    continue;
                }
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}
