import java.util.Scanner;

public class hw1_202310955 {
    public static void main(String[] args) {

        System.out.println("이름, 학번, 전공을 분리하여 입력하세요");
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름 :");
        String name = scanner.next();

        System.out.println("학번 :");
        String grade = scanner.next();

        System.out.println("전공 :");
        String major = scanner.next();

        System.out.println("이름은 " + name + ", 학번은 " + grade+", 전공은 " + major + " 입니다.");
    }
}