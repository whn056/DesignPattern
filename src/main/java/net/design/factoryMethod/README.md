# 工厂方法模式
解决简单工厂不满足“开放-封闭原则”的问题  
 
工厂接口（IFactory）  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
$\uparrow$  
工厂实现类（UndergraduateFactory，VolunteerFactory）

业务接口（ILeiFeng）  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
$\uparrow$  
业务实现类（Undergraduate，Volunteer）

客户端（Client）：创建工厂实现对象，调用创建业务对象方法
