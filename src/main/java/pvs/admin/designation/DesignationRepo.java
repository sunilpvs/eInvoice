package pvs.admin.designation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepo extends JpaRepository<DesignationEntity, Integer> {
	
	public boolean existsByAllIgnoreCasedesnName(String desn_name);
	
	public boolean existsByAllIgnoreCasedesnCode(String desn_code);

}
