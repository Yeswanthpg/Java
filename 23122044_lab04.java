import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
        
class Employee {
            private String name;
            private String gender;
            private int income;

            public Employee(String name, String gender, int income) {
                this.name = name;
                this.gender = gender;
                this.income = income;
            }

            public String getName() {
                return name;
            }

            public String getGender() {
                return gender;
            }

            public int getIncome() {
                return income;
            }

            public double calculateTax() {
                double tax;
                if (gender == "Male") {
                    tax = income * 0.1;
                } else if(gender == "Female" ) {
                    tax = income * 0.08;
                }
                return tax;
            }
        }

class Lab04 {
            public static ArrayList<Employee> employees = new ArrayList<>();
             public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.println("\n Menu");
                    System.out.println("\n*************************************************");
                    System.out.println("1.| Add employee details   |");
                    System.out.println("2.| List of employees      | ");
                    System.out.println("3.| View Tax for Employees |");
                    System.out.println("4.| Exit");
                    System.out.println("\n*************************************************");
                    int choice = Integer.parseInt(scanner.nextLine());

                    switch (choice) {
                        case 1:
                            addEmployee(scanner);
                            break;
                        case 2:
                            listEmployees();
                            break;
                        case 3:
                            viewTaxForEmployees();
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                }
            }

public static void addEmployee(Scanner scanner) {
                System.out.print("Enter employee's name: ");
                String name = scanner.nextLine();
                System.out.print("Enter employee's gender: ");
                String gender = scanner.nextLine();
                System.out.print("Enter employee's income: ");
                int income = Integer.parseInt(scanner.nextLine());

                Employee employee = new Employee(name, gender, income);
                employees.add(employee);

                try {
                    FileWriter fileWriter = new FileWriter("Employees.txt", true);
                    PrintWriter printWriter = new PrintWriter(fileWriter);
                    printWriter.println("Name \t Gender \t Income");
                    printWriter.println(name + "\t" + gender + "\t\t" + income);
                    printWriter.close();
                    System.out.println("Employee details added to Employees.txt");
                } catch (Exception exception) {
                    System.out.println("Error occurred while saving employee details.");
                }
            }

public static void listEmployees() {
                System.out.println("List of Employees:");
                for (Employee employee : employees) {
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Gender: " + employee.getGender());
                    System.out.println("Income: " + employee.getIncome());
                    System.out.println("------------------------");
                }
            }

public static void viewTaxForEmployees() {
                try {
                    FileWriter fileWriter = new FileWriter("EmployeeTax.txt", true);
                    PrintWriter printWriter = new PrintWriter(fileWriter);
                    printWriter.println("Name \t Tax");
                    for (Employee employee : employees) {
                        double tax = employee.calculateTax();
                        printWriter.println(employee.getName() + "\t" + tax);
                    }
                    printWriter.close();
                    System.out.println("Tax details added to EmployeeTax.txt");
                } catch (Exception exception) {
                    System.out.println("Error occurred while saving tax details.");
                }
            }
        }