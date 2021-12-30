package followservice.followservice.dto;

public class ToggleFollowDTO {
    private Long requestor;
    private Long target;

    public Long getRequestor() {
        return requestor;
    }

    public void setRequestor(Long requestor) {
        this.requestor = requestor;
    }

    public Long getTarget() {
        return target;
    }

    public void setTarget(Long target) {
        this.target = target;
    }
}
