package pvs.admin.designation;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tbl_designation")
public class DesignationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String desnName;
	
	@Column(name = "code")
	private String desnCode;
	
	@Column(name = "status")
	private Integer status;
	
	@CreationTimestamp
	@Column(name = "created_datetime",updatable = false)
	private LocalDateTime created_timestamp;
	
	@UpdateTimestamp
	@Column(name = "last_updatedDatetime",updatable = true)
	private LocalDateTime updated_timestamp;
	
	public DesignationEntity() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getdesn_name() {
		return desnName;
	}

	public void setdesn_name(String desn_name) {
		this.desnName = desn_name.substring(0,1).toUpperCase()+desn_name.substring(1).toLowerCase();
	}

	public String getdesn_code() {
		return desnCode;
	}

	public void setdesn_code(String desn_code) {
		this.desnCode = desn_code.toUpperCase();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public LocalDateTime getCreated_timestamp() {
		return created_timestamp;
	}

	public void setCreated_timestamp(LocalDateTime created_timestamp) {
		this.created_timestamp = created_timestamp;
	}

	public LocalDateTime getUpdated_timestamp() {
		return updated_timestamp;
	}

	public void setUpdated_timestamp(LocalDateTime updated_timestamp) {
		this.updated_timestamp = updated_timestamp;
	}
	
	
	
}


