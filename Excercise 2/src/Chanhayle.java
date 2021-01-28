import java.util.Scanner;
public class Chanhayle {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra \"x\" " );
        int x ;
        x = scanner.nextInt();
        String s = (x%2==0)?"x là số chẵn":"x là số lẻ";
        System.out.println(s);

    }
}
