package pvs.admin.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<CityEntity, Integer> {

	boolean existsByAllIgnoreCaseCity(String city); 
	
}
