package responsibilitychain.test;

import responsibilitychain.object.*;

public class Client {

    /**
     * 责任链模式，顾名思义，就是一条链。这个链到底是怎么运行的呢？它主要是将能够处理同一类请求的对象连成一条链，所提交的请求沿着链传递，链上的对象逐个判断是否有能力处理该请求，如果能则处理，如果不能则传递给链上的下一个对象进行处理，以此类推
     *
     * 比如说公司请假需要审批，举个不恰当的例子，如果请假小于3天，主管审批；3-10天的，经理审批；10-30天的，总经理审批；超过30天的，不批准等等。这就得一步步去判断，如果撇开设计模式不看的话，那么我们可以使用if…else…把它解决了，但是问题可想而知，实际中的复杂程度时远远超过这个例子的。
     *
     * 在实际中，设置这个链可以放到配置文件中，可以直接修改配置文件即可，这个责任链模式扩展性也很好，比如现在有个副经理，专门处理10-20天的请假，那么我只要新添加一个副经理类即可，然后在责任链上配置一下就行了，对其他的类没有影响。
     　　责任链模式使用的地方很多，比如我们常见的try…catch…就是，可以有多个catch，一个个往下判断；再比如servlet里面的过滤器，就是一个责任链；再比如struts2中的拦截器，也是使用的责任链模式。
     * @param args
     */
    public static void main(String[] args) {

        Leader director = new Director("张三");
        Leader manager = new Manager("李四");
        Leader gManager = new GeneralManager("王五");

        // 组织好责任链对象的关系
        director.setNextLeader(manager);
        manager.setNextLeader(gManager);

        // 开始请假操作
        LeaveRequest request = new LeaveRequest("倪升武", 15, "在家睡觉");
        director.handleRequest(request);
    }

}