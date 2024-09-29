package pvs.admin.country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements ICountryService {

	@Autowired
	CountryRepo countryrepo;
	
	@Override
	public List<CountryEntity> getAllColumns() {
		List<CountryEntity> list = countryrepo.findAll();
		return list;
	}

	@Override
	public CountryEntity addCountry(CountryEntity c) {
		CountryEntity country = countryrepo.save(c);
		return country;
	}

	@Override
	public CountryEntity getCountryById(Integer id) {
		Optional<CountryEntity> optional = countryrepo.findById(id);
		if(optional.isPresent()){
			CountryEntity country = optional.get();
			return country;
		}
		return null;
	}

	@Override
	public void deleteCountry(Integer id) {
		countryrepo.deleteById(id);
	}

	@Override
	public boolean checkCountryName(String name) {
		boolean b = countryrepo.existsByAllIgnoreCaseCountry(name);
		return b;
	}

	@Override
	public boolean checkCountryCode(String code) {
		boolean b = countryrepo.existsByAllIgnoreCaseCode(code);
		return b;
	}

	@Override
	public boolean checkCountryCurrency(String currency) {
		boolean b = countryrepo.existsByAllIgnoreCaseCurrrency(currency);
		return b;
	}

}
