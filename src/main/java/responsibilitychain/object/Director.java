package responsibilitychain.object;

/**
 * @Description 主任
 * @author Ni Shengwu
 *
 */
public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {

        int days = request.getLeaveDays(); //获取请假天数
        String name = request.getName(); //获取请假人姓名
        String reason = request.getReason(); // 获取请假理由

        if(days <= 3) { //如果满足3天内的要求，主任直接审批
            System.out.println("员工" + name + "请假" + days + "天，理由：" + reason);
            System.out.println("主任" + this.name + "审批通过");
        } else {
            System.out.println("请假天数过多，主任" + this.name + "没法处理");
            if(this.nextLeader != null) { //否则，如果链上存在下一个Leader，就让他处理
                this.nextLeader.handleRequest(request);
            } 
        }
    }

}