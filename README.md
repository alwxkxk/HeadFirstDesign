# HeadFirstDesign
设计模式代码，本质是将代码中经常变化的代码提取出来，以提高扩展性、可维护性。
点击类名再 `ctrl + alt + u` 可以看类图关系。

- Strategy 策略模式 , 委托（delegate），使用委托的方式实现了某些算法可设置替换。（说白了就是声明成一人接口，再创建不同的类来实现，根据需要来选择不同的类来使用。）
- Observer 观察者模式，建立一对多依赖，更新时会收到通知。
- Decorator 装饰者模式，装饰者和被装饰者对象有相同的超类型，使用时将对象传进去然后动态地添加值，装饰过后其类型依旧不变。
- Factory  工厂模式：

工厂模式定义一个创建对象的接口，但是交由子类决定要实例化哪一个，对应的是抽象类PizzaStore里的抽象函数createPizza。

抽象工厂模式提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。对应的是PizzaIngredientFactory这个接口，由NYPizzaIngredientFactory实现，在CheesePizza里的prepare()使用。

区别：
1. 工厂模式用来创建一个对象，抽象工厂模式用来创建一堆相关对象。
2. 工厂模式（abstract class）需要扩展(extents)一个类，覆盖它的工厂方法，而抽象工厂模式是一个接口(interface)，通过对象的组合(implements)来实现。

- Singleton 单例模式，相对于全局变量，能延时创建，并且还要考虑多线程创建时的问题。
- Command 命令模式,将请求封装成对象，以便使用不同请求时、队列、日志来参数化其它对象，以及撤销功能。本质就是抽出新对象来统一实现execute与undo函数，然后统一调用这两个接口。
- Adapter 适配模式，将一个类的接口转换成另一个所期望的接口。（使用adapter类进行转换）
- Facade 外观模式（没有写代码，太简单了），就是多抽一个功能性函数，而不是多个实例对象操作。
- Template Method 模板方法模式 :在一个方法中定义一个算法的骨架，其中一些步骤延迟到子类中，最终实现了不修改算法结构的情况下，子类可重新修改那些不同的步骤。
- Iterator 迭代器,实现iterator接口，有hasNext与next函数。
- Composite 组合模式（代码与迭代器一起） 将对象组合成树形结构来表现“整体/部分”层次结构，能以一致的方式处理个别对象以及对象组合。
- State 状态模式,允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。将行为委托到当前状态。
- Proxy 代理模式（没完成）
RMI：远程调用(remote invoke)，使用rmic能根据实现生成对应的stub和skeleton。
xxxImpl(impl-> implement，代表实现，一般放到controller层的service下。)
这里坑比较多，参考：
https://www.cnblogs.com/lishuaiqi/p/11318228.html
需要先用javac编译成class，然后根据包名放到对应的目录下，然后再执行rmic com.l.proxy.MyRemoteImpl才能生成

## 设计原则 
- 针对接口编程。
- 依赖抽象(抽象类或接口)，不要依赖具体类。
- 最少知识原则


