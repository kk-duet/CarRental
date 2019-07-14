package pl.carshare.carshare.employee.model;

public enum Position {
    EMPLOYEE("employee"), MANAGER("manager");

    private String positionName;

    Position(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }
}
