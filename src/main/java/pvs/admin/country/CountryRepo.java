package pvs.admin.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<CountryEntity, Integer> {

	public boolean existsByAllIgnoreCaseCountry(String country);
	
	public boolean existsByAllIgnoreCaseCode(String code);
	
	public boolean existsByAllIgnoreCaseCurrrency(String currrency);
	
	
}
