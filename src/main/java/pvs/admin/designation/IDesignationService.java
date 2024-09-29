package pvs.admin.designation;

import java.util.List;

import pvs.admin.department.DepartmentEntity;

public interface IDesignationService {

	List<DesignationEntity> getAllcolumns();
	
	DesignationEntity addDesignation(DesignationEntity d);
	
	DesignationEntity getDesnByid(Integer id);
	
	void deleteDesignation(Integer id);
	
	boolean checkDesnName(String desn_name);
	
	boolean checkDesnCode(String desn_code);

	
}
