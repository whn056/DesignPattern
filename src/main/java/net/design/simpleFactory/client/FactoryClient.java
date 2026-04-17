package net.design.simpleFactory.client;

import net.design.simpleFactory.IOperation;
import net.design.simpleFactory.factory.OperationFactory;

import java.math.BigDecimal;

/**
 * 客户端
 *
 * @author whn
 * @since 2026/4/17 10:02
 */
public class FactoryClient {
    public static void main(String[] args) {
        while(true) {
            System.out.println("请输入操作类型（+、-、*、/，输入 q / Q 退出）：");
            String operationType = new java.util.Scanner(System.in).next();
            if("q".equalsIgnoreCase(operationType)) {
                break;
            }
            if(!"+-*/".contains(operationType)) {
                System.out.println("输入的操作类型有误！");
                continue;
            }
            System.out.println("请输入第一个数字：");
            double number1 = new java.util.Scanner(System.in).nextDouble();
            System.out.println("请输入第二个数字：");
            double number2 = new java.util.Scanner(System.in).nextDouble();
            IOperation IOperation = OperationFactory.createOperation(operationType);
            System.out.print("运算结果：");
            String result = IOperation.getResult(BigDecimal.valueOf(number1), BigDecimal.valueOf(number2));
            System.out.println(number1 + " " + operationType + " " + number2 + " = " + result);
            System.out.println();
        }
    }
}
