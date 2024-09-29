package pvs.admin.state;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StateRepo extends JpaRepository<StateEntity, Integer> {

	boolean existsByAllIgnoreCaseState(String state);
	
}
