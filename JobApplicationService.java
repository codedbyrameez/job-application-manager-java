import java.util.ArrayList;
import java.util.List;

public class JobApplicationService {

    private final List<JobApplication> applications = new ArrayList<>();

    public void addApplication(JobApplication application) {

        applications.add(application);

        System.out.println();
        System.out.println("Application added successfully!");
    }

    public void showAllApplications() {

        if (applications.isEmpty()) {
            System.out.println();
            System.out.println("No applications found.");
            return;
        }

        System.out.println();
        System.out.println("========== ALL APPLICATIONS ==========");

        for (JobApplication application : applications) {
            System.out.println(application);
        }
    }

    public void searchByCompany(String company) {

        boolean found = false;

        System.out.println();
        System.out.println("========== SEARCH RESULTS ==========");

        for (JobApplication application : applications) {

            if (application.getCompany().equalsIgnoreCase(company)) {
                System.out.println(application);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No application found for: " + company);
        }
    }

    public void updateStatus(int id, ApplicationStatus newStatus) {

        for (JobApplication application : applications) {

            if (application.getId() == id) {

                application.setStatus(newStatus);

                System.out.println();
                System.out.println("Application status updated successfully!");

                return;
            }
        }

        System.out.println();
        System.out.println("Application with ID " + id + " not found.");
    }

    public void deleteApplication(int id) {

        for (JobApplication application : applications) {

            if (application.getId() == id) {

                applications.remove(application);

                System.out.println();
                System.out.println("Application deleted successfully!");

                return;
            }
        }

        System.out.println();
        System.out.println("Application with ID " + id + " not found.");
    }

    public void showStatistics() {

        int applied = 0;
        int phoneScreens = 0;
        int interviews = 0;
        int technicalInterviews = 0;
        int offers = 0;
        int rejected = 0;

        for (JobApplication application : applications) {

            switch (application.getStatus()) {

                case APPLIED:
                    applied++;
                    break;

                case PHONE_SCREEN:
                    phoneScreens++;
                    break;

                case INTERVIEW:
                    interviews++;
                    break;

                case TECHNICAL_INTERVIEW:
                    technicalInterviews++;
                    break;

                case OFFER:
                    offers++;
                    break;

                case REJECTED:
                    rejected++;
                    break;
            }
        }

        System.out.println();
        System.out.println("========== APPLICATION STATISTICS ==========");

        System.out.println("Applied:               " + applied);
        System.out.println("Phone Screens:         " + phoneScreens);
        System.out.println("Interviews:            " + interviews);
        System.out.println("Technical Interviews:  " + technicalInterviews);
        System.out.println("Offers:                " + offers);
        System.out.println("Rejected:              " + rejected);

        System.out.println("--------------------------------------------");
        System.out.println("Total Applications:    " + applications.size());
    }
}