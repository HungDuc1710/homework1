import java.util.Scanner;
public class chuvivadientich {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhập bán kính hình tròn \"r\"");
        Scanner scanner = new Scanner(System.in);
        double r; 
        r = scanner.nextDouble();
        double chuvihinhtron = 2 * r* Math.PI ;
        double dientich = r*r*Math.PI;
        System.out.println("Chu vi hình tròn là:"+chuvihinhtron);
        System.out.println("Diện tích hình tròn là:"+dientich);


    }
}
