package pvs.admin.department;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

	@Autowired
	DepartmentRepo deptrepo;
	
	
	@Override
	public List<DepartmentEntity> getAllColumns() {
		List<DepartmentEntity> list = deptrepo.findAll();
		return list;
	}

	@Override
	public DepartmentEntity addDepartment(DepartmentEntity d) {
		DepartmentEntity department = deptrepo.save(d);
		return department;
	}

	@Override
	public DepartmentEntity getDepartmentById(Integer id) {
		Optional<DepartmentEntity> optional = deptrepo.findById(id);
		if(optional.isPresent()) {
			DepartmentEntity dept = optional.get();
			return dept;
		}
		return null;
	}

	@Override
	public void deleteDepartment(Integer id) {
		deptrepo.deleteById(id);
	}

	@Override
	public boolean checkDepartmentName(String dept_name) {
		boolean b = deptrepo.existsByAllIgnoreCaseDeptName(dept_name);
		return b;
	}

	@Override
	public boolean checkDepartmentCode(String dept_code) {
		boolean b = deptrepo.existsByAllIgnoreCaseDeptCode(dept_code);
		return b;
	}

	
}
