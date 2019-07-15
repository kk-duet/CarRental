package pl.carshare.carshare.car.model;

public enum Status {

    LOAN("loan"), AVAILABLE("available"), UNAVAILABLE("unavailable");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
