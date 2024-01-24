package java12.daos;

import java12.interfaces.EmployeeDaoInterface;
import java12.models.Employee;
import java12.models.Job;

import java.util.List;
import java.util.Map;

public class EmployeeDaoIml implements EmployeeDaoInterface {

    @Override
    public void createEmployee() {

    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void dropTable() {

    }

    @Override
    public void cleanTable() {

    }

    @Override
    public void updateEmployee(Long id, Employee employee) {

    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee findByEmail(String email) {
        return null;
    }

    @Override
    public Map<Employee, Job> getEmployeeById(Long employeeId) {
        return null;
    }

    @Override
    public List<Employee> getEmployeeByPosition(String position) {
        return null;
    }
}
