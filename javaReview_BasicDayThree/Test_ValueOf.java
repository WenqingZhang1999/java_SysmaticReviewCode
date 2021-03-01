public class Test_ValueOf {
    public static void main(String args[]) {
        Integer x = Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");

        Integer b = Integer.valueOf("444", 16); // 使用 16 进制
        int f = 0x444;
        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
    }
}