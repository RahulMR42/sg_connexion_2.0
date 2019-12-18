package Entity;

import Service.ServiceLayer;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("enter options : \n1. Fetch total Number Of Employees ");
        System.out.println("\n2. Fetch Number Of Employees in a location");
        System.out.println("\n3. Fetch total employees with baackend skills");
        System.out.println("\n4. Fetch Number Of Employees with front end skills");
        System.out.println("\n5. Fetch details wof employee with name");


        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        callServiceLayer(option);

    }

    private static void callServiceLayer(int option) {
        ServiceLayer service = new ServiceLayer();
        Scanner scanner = new Scanner(System.in);

        switch (option) {
            case 1: {
                int totalEmployees = service.getTotalEmployees();
            }

            case 2: {
                System.out.println("please enter the location : ");
                String location = new Scanner(System.in).next();
                service.getEmployeesAtLocation(location);
                break;
            }
            case 3: {
                service.getBackendEmployees();

            }

            case 4: {
                service.getFrontEndEmployees();
            }


            case 5: {
                System.out.println("please enter the name of employee : ");
                String name = new Scanner(System.in).next();
                service.getEmployeedetailsWithName(name);
            }
        }

    }
}
