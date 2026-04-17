# 简单工厂
## 一、接口 / 抽象类
Operation
- 声明统一的抽象方法 (getResult)
## 二、具体实现类
AddOperation、SubOperation、MulOperation、DivOperation
- 实现抽象方法 (getResult)
## 三、工厂类
OperationFactory
1. 接收客户端参数
2. 创建对应的实现类对象
3. 给客户端返回实现类对象
## 四、客户端
Client
1. 创建工厂类
2. 调用工厂类的创建方法，获取对应的实现类
3. 执行对应实现类的逻辑方法