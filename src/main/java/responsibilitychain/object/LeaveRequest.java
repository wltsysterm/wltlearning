package responsibilitychain.object;

/**
 * @Description 封装请假的基本信息
 * @author Ni Shengwu
 *
 */
public class LeaveRequest {

    private String name;
    private int leaveDays;
    private String reason;

    public LeaveRequest(String name, int leaveDays, String reason) {
        super();
        this.name = name;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }
    //省略get和set方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}