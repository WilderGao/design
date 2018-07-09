# 设计模式

## 访问者模式

访问者模式，表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用域这些元素的新操作。

它把数据结构和作用于结构上的操作之间的耦合解脱开，使得操作集合可以相对自由地演化。

适用场景：适用于数据结构较为稳定的系统

访问者模式的优点就是增加新的操作很容易，因为增加新的操作就意味着增加一个新的访问者。反之如果要增加新的数据结构的话，那么行为的状态类需要增加一个方法，而且他的下属类都要因此增加一个方法，这样就不够符合 开放-封闭的原则。

举例：比如说现在有两个数据结构，男人和女人，两个数据结构继承一个抽象类Person，操作分别有成功时、失败时，这两个操作继承一个抽象类BaseAction。

```java
public abstract class BaseAction {

    /**
     * 得到男人结构的反应
     * @param concreteElementA 男性类
     */
    public abstract void getManConclusion(Man concreteElementA);

    /**
     * 得到女人结构的反应
     * @param concreteElementB 女性类
     */
    public abstract void getWomanConclusion(Woman concreteElementB);

}
```

当需要增加一个新的操作时，只需要新建一个类继承BaseAction即可

当需要增加一个新的数据结构时，就需要新建一个类继承Person，而且在抽象类BaseAction中需要增加一个新的接口描述反应，而且之前那些操作都需要实现这个数据结构的接口，这样改动会很大，不符合原则。

因此，访问者模式适合数据结构比较稳定的系统