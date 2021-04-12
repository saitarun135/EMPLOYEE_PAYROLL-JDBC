
import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class EmployeePayrollServiceTest {
	   EmployeePayrollService employeePayrollService;
	   List<EmployeePayrollData> employeePayrollList;

	  @Test
	  public void given3EmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount(){
		  employeePayrollService = new EmployeePayrollService();
		  employeePayrollList = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
		  Assert.assertEquals(3, employeePayrollList.size());
		    }
	  @Test
	    public void givenNewSalaryForEmployee_WhenUpdated_ShouldMatch() {
	        employeePayrollService = new EmployeePayrollService();
	        employeePayrollList = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
	        employeePayrollService.updateEmployeeSalary("terisa", 20000.00);
	        boolean result = employeePayrollService.checkEmployeePayrollInSyncWithDB("terisa");
	        Assert.assertTrue(result);
	    }
		}
