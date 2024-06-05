package view.view_model.pactelephone;


import java.time.LocalDateTime;

public class Call {
    private String phoneNumber;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean active;

    public Call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.startTime = LocalDateTime.now();
        this.active = true;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void endCall() {
        this.endTime = LocalDateTime.now();
        this.active = false;
    }
}

