import centennial.Employee;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();

        //get input from user and set it in fields

        System.out.println("Please enter the id for employee");
        employee1.SetId(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Please enter the name for employee");
        employee1.SetName(scanner.nextLine());

        System.out.println("Please enter a email for employee");
        employee1.SetEmail(scanner.nextLine());

        System.out.println("Please enter a address for employee");
        employee1.SetAddress(scanner.nextLine());

        System.out.println("Please enter a amount of salary for employee");
        employee1.SetSalary(scanner.nextDouble());


        // Show the output

        System.out.println("### Showing the informations of employee -> " + employee1 + " ###");
        System.out.println("This is the id -> " + employee1.GetId());
        System.out.println("This is the name -> " + employee1.GetName());
        System.out.println("This is the email -> " + employee1.GetEmail());
        System.out.println("This is the Address -> " + employee1.GetAddress());
        System.out.println("This is the salary -> " + employee1.GetAddress());




    }
}
