package pvs.admin.department;


import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "tbl_department")
public class DepartmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String deptName;
	
	@Column(name = "code")
	private String deptCode;
	
	@Column(name = "status")
	private Integer status;
	
	@CreationTimestamp
	@Column(name = "created_datetime",updatable = false)
	private LocalDateTime created_timestamp;
	
	@UpdateTimestamp
	@Column(name = "last_updatedDatetime",updatable = true)
	private LocalDateTime updated_timestamp;
	
	public DepartmentEntity() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDept_name() {
		return deptName;
	}

	public void setDept_name(String dept_name) {
		this.deptName = dept_name.substring(0,1).toUpperCase()+dept_name.substring(1).toLowerCase();
	}

	public String getDept_code() {
		return deptCode;
	}

	public void setDept_code(String dept_code) {
		this.deptCode = dept_code.toUpperCase();
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
