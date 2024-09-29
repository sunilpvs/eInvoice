package pvs.admin.contactType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactTypeRepo extends JpaRepository<ContactTypeEntity, Integer> {
	
	boolean existsByAllIgnoreCaseName(String name);

}
