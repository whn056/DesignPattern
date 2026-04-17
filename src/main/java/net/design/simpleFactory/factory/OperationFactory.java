package net.design.simpleFactory.factory;

import net.design.simpleFactory.IOperation;
import net.design.simpleFactory.impl.AddIOperation;
import net.design.simpleFactory.impl.DivisionIOperation;
import net.design.simpleFactory.impl.MinusIOperation;
import net.design.simpleFactory.impl.MultiplyIOperation;

/**
 * 工厂类
 *
 * @author whn
 * @since 2026/4/17 09:58
 */
public class OperationFactory {
    public static IOperation createOperation(String operate) {
        IOperation IOperation = null;
        switch (operate) {
            case "+":
                IOperation = new AddIOperation();
                break;
            case "-":
                IOperation = new MinusIOperation();
                break;
            case "*":
                IOperation = new MultiplyIOperation();
                break;
            case "/":
                IOperation = new DivisionIOperation();
                break;
            default:
                break;
        }
        return IOperation;
    }
}
