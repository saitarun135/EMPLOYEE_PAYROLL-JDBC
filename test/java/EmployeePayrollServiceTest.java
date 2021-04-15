//https://www.tutorialspoint.com/javatime/javatime_localdate_of1.htm
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class EmployeePayrollServiceTest {
	   EmployeePayrollService employeePayrollService;
	   List<EmployeePayrollData> employeePayrollList;

	 /* @Test
	  public void given3EmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount(){
		  employeePayrollService = new EmployeePayrollService();
		  employeePayrollList = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
		  Assert.assertEquals(3, employeePayrollList.size());
		    }  */
 	  /* @Test
	    public void givenNewSalaryForEmployee_WhenUpdated_ShouldMatch() {
	        employeePayrollService = new EmployeePayrollService();
	        employeePayrollList = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
	        employeePayrollService.updateEmployeeSalary("terisa", 20000.00);
	        boolean result = employeePayrollService.checkEmployeePayrollInSyncWithDB("terisa");
	        Assert.assertTrue(result);
	    }  */

	   /* @Test
	    public void givenNewSalaryForEmployee_WhenUpdated_ShouldSyncWithDB() throws EmployeePayrollException {
		  employeePayrollService = new EmployeePayrollService();
	      employeePayrollList = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
	      employeePayrollService.updateEmployeeSalaryWithPreparedStatement("terisa", 20000.00);
	      boolean result=employeePayrollService.checkEmployeePayrollInSyncWithDB("terisa");
	      Assert.assertTrue(result);
	  } */
	   /* @Test
	    public void givenDateRange_WhenRetrievedEmployee_ShouldReturnEmpCount() throws EmployeePayrollException {
	        employeePayrollService = new EmployeePayrollService();
	        employeePayrollList = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
	        LocalDate startDate = LocalDate.of(2018, 01, 01);
	        LocalDate endDate = LocalDate.now();
	        List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollDataForDateRange(startDate, endDate);
	        Assert.assertEquals(3, employeePayrollList.size());
	    }  */
	  
	 /*	  @Test
	    public void givenPayrollData_WhenAverageSalaryRetrieveByGender_ShouldReturnProperValue() {
	        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
	        employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
	        Map<String, Double> averageSalaryByGender = employeePayrollService.averageSalaryByGender();
	        System.out.println(employeePayrollService.averageSalaryByGender());
	        Assertions.assertTrue(averageSalaryByGender.get("M").equals(10000.00) &&
	        						averageSalaryByGender.get("F").equals(25000.00));
	        
	       
	       
	    } */

	/*  @Test
	    public void givenPayrollData_WhenAverageGenderRetrieveByGender_ShouldReturnProperValue() {
	        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
	        employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
	        List<String> minSalarybyFm = employeePayrollService.minSalaryByGender();
	        System.out.println(employeePayrollService.minSalaryByGender());
	        boolean actual=employeePayrollService.minSalaryByGender() != null;
	        Assert.assertTrue(actual);
	  } */
	  //uc7
	  
	  @Test
	    public void givenNewEmployee_WhenAdded_ShouldSyncWithDB(){
	        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
	        employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
	        employeePayrollService.addEmployeeToPayroll(4,"Mark", 5000000.0, LocalDate.now(), "M");
	        boolean op = employeePayrollService.checkEmployeePayrollInSyncWithDB("Mark");
	        Assert.assertTrue(op);
	    } 
	  
}