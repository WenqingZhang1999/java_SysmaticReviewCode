
public class Test_SwitchCase {
    public static void main(String args[]) {
        // char grade = args[0].charAt(0);
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            default:
                System.out.println("未知等级");
                break;
            case 'H':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("你需要再努力努力");
                break;

        }
        System.out.println("你的等级是 " + grade);
    }
}