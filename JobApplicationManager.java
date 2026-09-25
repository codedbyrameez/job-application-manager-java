import java.util.Scanner;

public class JobApplicationManager {

    private final JobApplicationService service = new JobApplicationService();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {

        boolean running = true;

        while (running) {

            showMenu();

            int choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    addApplication();
                    break;

                case 2:
                    service.showAllApplications();
                    break;

                case 3:
                    searchApplication();
                    break;

                case 4:
                    updateApplicationStatus();
                    break;

                case 5:
                    deleteApplication();
                    break;

                case 6:
                    service.showStatistics();
                    break;

                case 7:
                    running = false;
                    System.out.println("Thank you for using Job Application Manager!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    private void showMenu() {

        System.out.println();
        System.out.println("================================");
        System.out.println("      JOB APPLICATION MANAGER");
        System.out.println("================================");
        System.out.println("1. Add Application");
        System.out.println("2. View All Applications");
        System.out.println("3. Search by Company");
        System.out.println("4. Update Application Status");
        System.out.println("5. Delete Application");
        System.out.println("6. View Statistics");
        System.out.println("7. Exit");
        System.out.println("================================");
    }

    private void addApplication() {

        int id = readInt("Enter application ID: ");

        System.out.print("Enter company name: ");
        String company = scanner.nextLine();

        System.out.print("Enter job position: ");
        String position = scanner.nextLine();

        System.out.print("Enter location: ");
        String location = scanner.nextLine();

        JobApplication application =
                new JobApplication(id, company, position, location);

        service.addApplication(application);
    }

    private void searchApplication() {

        System.out.print("Enter company name: ");
        String company = scanner.nextLine();

        service.searchByCompany(company);
    }

    private void updateApplicationStatus() {

        int id = readInt("Enter application ID: ");

        System.out.println();
        System.out.println("1. APPLIED");
        System.out.println("2. PHONE_SCREEN");
        System.out.println("3. INTERVIEW");
        System.out.println("4. TECHNICAL_INTERVIEW");
        System.out.println("5. OFFER");
        System.out.println("6. REJECTED");

        int choice = readInt("Enter new status: ");

        ApplicationStatus status;

        switch (choice) {

            case 1:
                status = ApplicationStatus.APPLIED;
                break;

            case 2:
                status = ApplicationStatus.PHONE_SCREEN;
                break;

            case 3:
                status = ApplicationStatus.INTERVIEW;
                break;

            case 4:
                status = ApplicationStatus.TECHNICAL_INTERVIEW;
                break;

            case 5:
                status = ApplicationStatus.OFFER;
                break;

            case 6:
                status = ApplicationStatus.REJECTED;
                break;

            default:
                System.out.println("Invalid status.");
                return;
        }

        service.updateStatus(id, status);
    }

    private void deleteApplication() {

        int id = readInt("Enter application ID: ");

        service.deleteApplication(id);
    }

    private int readInt(String message) {

        while (true) {

            try {

                System.out.print(message);
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid number.");
            }
        }
    }
}