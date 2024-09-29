package pvs.admin.department;

import java.util.List;

public interface IDepartmentService{

	List<DepartmentEntity> getAllColumns();
	
	DepartmentEntity addDepartment(DepartmentEntity d);
	
	DepartmentEntity getDepartmentById(Integer id);
	
	void deleteDepartment(Integer id);
	
	boolean checkDepartmentName(String dept_name);
	
	boolean checkDepartmentCode(String dept_code);
	
}
