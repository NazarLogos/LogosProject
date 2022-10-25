package homework_17.service;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Univercity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	@Column
	private String name;
	
	@Column
	private String levelOfAccreditation;
	
	@Column
	private int amountOfUnivercity;
	
	@Column
	private int amountOfStudent;
	
	@Column
	private String addressOfTheUnivercity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevelOfAccreditation() {
		return levelOfAccreditation;
	}

	public void setLevelOfAccreditation(String levelOfAccreditation) {
		this.levelOfAccreditation = levelOfAccreditation;
	}

	public int getAmountOfUnivercity() {
		return amountOfUnivercity;
	}

	public void setAmountOfUnivercity(int amountOfUnivercity) {
		this.amountOfUnivercity = amountOfUnivercity;
	}

	public int getAmountOfStudent() {
		return amountOfStudent;
	}

	public void setAmountOfStudent(int amountOfStudent) {
		this.amountOfStudent = amountOfStudent;
	}

	public String getAddressOfTheUnivercity() {
		return addressOfTheUnivercity;
	}

	public void setAddressOfTheUnivercity(String addressOfTheUnivercity) {
		this.addressOfTheUnivercity = addressOfTheUnivercity;
	}

	@Override
	public String toString() {
		return "Univercity [id=" + id + ", name=" + name + ", levelOfAccreditation=" + levelOfAccreditation
				+ ", amountOfUnivercity=" + amountOfUnivercity + ", amountOfStudent=" + amountOfStudent
				+ ", addressOfTheUnivercity=" + addressOfTheUnivercity + "]";
	}
	
	

}
