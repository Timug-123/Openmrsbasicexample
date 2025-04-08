package org.openmrs.module.basicexample;

import org.openmrs.BaseOpenmrsData;

import javax.persistence.*;

@Entity(name = "basicexample.Department")
@Table(name = "basicexample_department")
public class Department extends BaseOpenmrsData {
	
	@Id
	@GeneratedValue
	@Column(name = "department_id")
	private int id;
	
	@Column(name = "name", length = 255)
	private String departmentName;
	
	@Column(name = "location", length = 255)
	private String location;
	
	@Override
	public Integer getId() {
		return 0;
	}
	
	@Override
	public void setId(Integer integer) {
		
	}
	
	public Department() {
	}
	
	public Department(int id, String departmentName, String location) {
		this.id = id;
		this.departmentName = departmentName;
		this.location = location;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Department{" + "id=" + id + ", departmentName='" + departmentName + '\'' + ", location='" + location + '\''
		        + '}';
	}
}
