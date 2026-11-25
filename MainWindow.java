package ui ;
import com.sun.org.apache.xpath.internal.operations.Operation;

import java.util.Scanner;

public class MainWindow {
    private static final String OPERATION_EXIT="EXIT";
    private static final String OPERATION_JX="JX";
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重(公斤)");
        double ti= sc.nextDouble();
        System.out.println("请输入身高(米)");
        double gao= sc.nextDouble();

        double bmi =ti/(gao*gao);
        System.out.println("BMI指数:"+bmi);
        if(bmi<18.5) {
            System.out.println("偏瘦");
        }
        else if(bmi>=18.5&bmi<24.9) {
            System.out.println("正常");
        }
        else if(bmi>=24.9&bmi<27) {
            System.out.println("超重");
        }
        else if(bmi>=27&bmi<30) {
            System.out.println("肥胖");
        }
        else {
            System.out.println("严重肥胖");
        }
        System.out.println("请开始输入,EXIT  退出");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            String in = scan.next().toString();
            if(OPERATION_EXIT.equals(in.toUpperCase())) {
                System.out.println("您已成功退出");
                break;
            }




        }
    }
}