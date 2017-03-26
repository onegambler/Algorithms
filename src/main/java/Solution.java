import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    private static final int MANAGER_SPLIT_INDEX = 0;
    private static final int EMPLOYEE_SPLIT_INDEX = 1;

    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        int numberOfEmployees = scanner.nextInt();

        String firstEmployeeName = scanner.next();
        String secondEmployeeName = scanner.next();

        Map<String, Employee> hierarchyMap = new HashMap<>();
        String relationship;
        while ((relationship = scanner.next()) != null) {
            String[] splitRelationship = relationship.split(" ");
            String managerName = splitRelationship[MANAGER_SPLIT_INDEX];
            String employeeName = splitRelationship[EMPLOYEE_SPLIT_INDEX];
            if (!hierarchyMap.containsKey(employeeName)) {
                hierarchyMap.put(employeeName, new Employee(employeeName));
            }

            if (!hierarchyMap.containsKey(managerName)) {
                hierarchyMap.put(managerName, new Employee(managerName));
            }

            Employee employee = hierarchyMap.get(employeeName);
            Employee manager = hierarchyMap.get(managerName);
            employee.setManager(manager);
        }

        Set<String> bosses = new HashSet<>();
        Employee firstEmployee = hierarchyMap.get(firstEmployeeName);
        Employee secondEmployee = hierarchyMap.get(secondEmployeeName);

        Employee firstEmployeeManager;
        while((firstEmployeeManager = firstEmployee.getManager()) != null) {
            bosses.add(firstEmployeeManager.getName());
        }

        Employee secondEmployeeManager;
        while((secondEmployeeManager = secondEmployee.getManager()) != null) {
            if(bosses.contains(secondEmployeeManager.getName())) {
                System.out.println(secondEmployeeManager.getManager());
            }
        }

        throw new RuntimeException("Cannot find common manager");
    }

    public static class Employee {
        private String name;
        private Employee manager;

        public Employee(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setManager(Employee manager) {
            this.manager = manager;
        }

        public Employee getManager() {
            return manager;
        }

        public String getName() {
            return name;
        }
    }
}