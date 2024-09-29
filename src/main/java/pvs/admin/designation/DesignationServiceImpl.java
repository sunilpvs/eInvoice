package pvs.admin.designation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignationServiceImpl implements IDesignationService {

	@Autowired
	DesignationRepo desnrepo;
	
	@Override
	public List<DesignationEntity> getAllcolumns() {
		List<DesignationEntity> list = desnrepo.findAll();
		return list;
	}

	@Override
	public DesignationEntity addDesignation(DesignationEntity d) {
		DesignationEntity designation = desnrepo.save(d);
		return designation;
	}

	@Override
	public DesignationEntity getDesnByid(Integer id) {
		Optional<DesignationEntity> optional = desnrepo.findById(id);
		if(optional.isPresent()) {
			DesignationEntity d = optional.get();
			return d;
		}
		return null;
	}

	@Override
	public void deleteDesignation(Integer id) {
		desnrepo.deleteById(id);
	}

	@Override
	public boolean checkDesnName(String desn_name) {
		boolean b = desnrepo.existsByAllIgnoreCasedesnName(desn_name);
		return b;
	}

	@Override
	public boolean checkDesnCode(String desn_code) {
		boolean b = desnrepo.existsByAllIgnoreCasedesnCode(desn_code);
		return b;
	}

}
