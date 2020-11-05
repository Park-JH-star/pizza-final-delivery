package pizza.external;

public class Grade {

    private Long id;
    private Long orderId;
    private Long score;
    private String gradeStatus;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getScore() {
        return score;
    }
    public void setScore(Long score) {
        this.score = score;
    }
    public String getGradeStatus() {
        return gradeStatus;
    }
    public void setGradeStatus(String gradeStatus) {
        this.gradeStatus = gradeStatus;
    }

}
