package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pawnshop implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pawnshopId;

	private String email;
	private String password;
	private String pawnshopName;
	private String credential;

	public long getPawnshopId() {
		return pawnshopId;
	}

	public void setPawnshopId(long pawnshopId) {
		this.pawnshopId = pawnshopId;
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

	public String getPawnshopName() {
		return pawnshopName;
	}

	public void setPawnshopName(String pawnshopName) {
		this.pawnshopName = pawnshopName;
	}

	public String getCredential() {
		return credential;
	}

	public void setCredential(String credential) {
		this.credential = credential;
	}
	

	
	@OneToMany(mappedBy="pawnshopId", cascade={CascadeType.ALL})
	private List<ProposePrice> proposerice;

	public List<ProposePrice> getProposerice() {
		return proposerice;
	}

	public void setProposerice(List<ProposePrice> proposerice) {
		this.proposerice = proposerice;
	}

	
	

}
