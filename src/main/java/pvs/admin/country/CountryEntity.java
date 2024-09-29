package pvs.admin.country;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tbl_country")
public class CountryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "currency")
	private String currrency;
	
	public CountryEntity() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country.substring(0, 1).toUpperCase()+country.substring(1).toLowerCase();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code.toUpperCase();
	}

	public String getCurrrency() {
		return currrency;
	}

	public void setCurrrency(String currrency) {
		this.currrency = currrency.toUpperCase();
	}
	
}
