package pvs.admin.ccType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CcTypeRepo extends JpaRepository<CostCenterTypeEntity, Integer> {

	boolean existsByAllIgnoreCaseCcType(String cc_type);
	
}
