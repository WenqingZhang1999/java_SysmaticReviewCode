public class Test_Break {
    public static void main(String args[]) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int x : numbers) {
            // x 等于 30 时跳出循环
            if (x <= 50) {
                System.out.print("小哈子");
                if (x == 30) {
                    break;
                }
            }
            System.out.print(x);
            System.out.print("\n");
        }
        System.out.println("金毛子");
    }
}
