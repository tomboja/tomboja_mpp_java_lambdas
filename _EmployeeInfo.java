/**
 * 
 */
package tomboja_mpp_java_lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: tdessalegn
 * @email: tdessalegn@miu.edu
 * @date: Oct 12, 2021
 */
public class _EmployeeInfo {

	public enum SortMethods {
		BYNAME, BYSALARY
	};

	public void sort(List<Employee> emps, final SortMethods sm) {
		
		// Local inner class
		class EmployeeComparator implements Comparator<Employee> {

			@Override
			public int compare(Employee o1, final Employee o2) {
				if (sm == SortMethods.BYNAME) {
					return o1.name.compareTo(o2.name);
				} else {
					if (o1.salary == o2.salary)
						return 0;
					else if (o1.salary < o2.salary)
						return -1;
					else
						return 1;
				}
			}
		}

		Collections.sort(emps, new EmployeeComparator());
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));

		_EmployeeInfo employeeInfo = new _EmployeeInfo();
		employeeInfo.sort(emps, SortMethods.BYNAME);
		System.out.println(emps);
		
		System.out.println();
		employeeInfo.sort(emps, SortMethods.BYSALARY);
		System.out.println(emps);

	}

}
