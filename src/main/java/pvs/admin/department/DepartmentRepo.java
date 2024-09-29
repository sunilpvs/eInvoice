package pvs.admin.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<DepartmentEntity, Integer> {

	
	public boolean existsByAllIgnoreCaseDeptName(String dept_name);
	
	public boolean existsByAllIgnoreCaseDeptCode(String dept_code);
	
}
