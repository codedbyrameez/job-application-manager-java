public class JobApplication {

    private int id;
    private String company;
    private String position;
    private String location;
    private ApplicationStatus status;

    public JobApplication(int id, String company, String position, String location) {
        this.id = id;
        this.company = company;
        this.position = position;
        this.location = location;
        this.status = ApplicationStatus.APPLIED;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public String getLocation() {
        return location;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Company: " + company +
                " | Position: " + position +
                " | Location: " + location +
                " | Status: " + status;
    }
}