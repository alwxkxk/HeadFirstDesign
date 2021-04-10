# HeadFirstDesign
设计模式代码，本质是将代码中经常变化的代码提取出来，以提高扩展性、可维护性。

- Strategy 策略模式 , 委托（delegate）
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
- Adapter
- Facade
- Template Method
- Iterator
- Composite
- State
- Proxy

## 设计原则 
- 针对接口编程。
- 依赖抽象(抽象类或接口)，不要依赖具体类。


