package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import entity.Gold;
@Entity
public class Pawner implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pawnerId;
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public long getPawnerId() {
		return pawnerId;
	}

	public void setPawnerId(long pawnerId) {
		this.pawnerId = pawnerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToMany(mappedBy="pawnerId", cascade={CascadeType.ALL})
	private List<Gold> gold;

	public List<Gold> getGolde() {
		return gold;
	}

	public void setGold(List<Gold> golde) {
		this.gold = gold;
	}
	
}
