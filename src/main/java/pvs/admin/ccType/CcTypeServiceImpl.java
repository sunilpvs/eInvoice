package pvs.admin.ccType;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CcTypeServiceImpl implements ICcTypeService {

	@Autowired
	CcTypeRepo cctyperepo;
	
	@Override
	public List<CostCenterTypeEntity> getAllColumns() {
		List<CostCenterTypeEntity> list = cctyperepo.findAll();
		return list;
	}

	@Override
	public CostCenterTypeEntity addCcType(CostCenterTypeEntity c) {
		CostCenterTypeEntity cctype = cctyperepo.save(c);
		return cctype;
	}

	@Override
	public CostCenterTypeEntity getCcTypeById(Integer id) {
		Optional<CostCenterTypeEntity> optional = cctyperepo.findById(id);
		if(optional.isPresent()) {
			CostCenterTypeEntity cctype = optional.get();
			return cctype;
		}
		return null;
	}

	@Override
	public void deleteCcType(Integer id) {
		cctyperepo.deleteById(id);

	}

	@Override
	public boolean checkCcTypeName(String name) {
		boolean b = cctyperepo.existsByAllIgnoreCaseCcType(name);
		return b;
	}

}
