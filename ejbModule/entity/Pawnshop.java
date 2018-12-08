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

	private String pawnshopEmail;
	private String pawnshopPassword;
	private String pawnshopName;
	private String pawnshopProvince;
	private String pawnshopTel;
	private String pawnshopAddress;
	private String pawnshopState;
	
	private String pawnerUsercode;
	
	private String pawnerZipcode;
	private String pawnerPicture;
	private String pawnerCover;
	
	
	public String getZipCode() {
		return pawnerZipcode;
	}

	public void setZipCode(String zipCode) {
		this.pawnerZipcode = zipCode;
	}

	public String getPicture() {
		return pawnerPicture;
	}

	public void setPicture(String picture) {
		this.pawnerPicture = picture;
	}

	public String getCover() {
		return pawnerCover;
	}

	public void setCover(String cover) {
		this.pawnerCover = cover;
	}

	public String getUserCode() {
		return pawnerUsercode;
	}

	public void setUserCode(String userCode) {
		this.pawnerUsercode = userCode;
	}

	public long getPawnshopId() {
		return pawnshopId;
	}

	public void setPawnshopId(long pawnshopId) {
		this.pawnshopId = pawnshopId;
	}

	public String getPawnshopEmail() {
		return pawnshopEmail;
	}

	public void setPawnshopEmail(String pawnshopEmail) {
		this.pawnshopEmail = pawnshopEmail;
	}

	public String getPawnshopPassword() {
		return pawnshopPassword;
	}

	public void setPawnshopPassword(String pawnshopPassword) {
		this.pawnshopPassword = pawnshopPassword;
	}

	public String getPawnshopName() {
		return pawnshopName;
	}

	public void setPawnshopName(String pawnshopName) {
		this.pawnshopName = pawnshopName;
	}

	public String getPawnshopProvince() {
		return pawnshopProvince;
	}

	public void setPawnshopProvince(String pawnshopProvince) {
		this.pawnshopProvince = pawnshopProvince;
	}

	public String getPawnshopTel() {
		return pawnshopTel;
	}

	public void setPawnshopTel(String pawnshopTel) {
		this.pawnshopTel = pawnshopTel;
	} 

	public String getPawnshopAddress() {
		return pawnshopAddress;
	}

	public void setPawnshopAddress(String pawnshopAddress) {
		this.pawnshopAddress = pawnshopAddress;
	}

	public String getPawnshopState() {
		return pawnshopState;
	}

	public void setPawnshopState(String pawnshopState) {
		this.pawnshopState = pawnshopState;
	}


	@OneToMany(mappedBy="pawnshopId", cascade={CascadeType.ALL})
	private List<Estimate> estimates;

	public List<Estimate> getEstimates() {
		return estimates;
	}

	public void setEstimates(List<Estimate> estimates) {
		this.estimates = estimates;
	}
	
	@OneToMany(mappedBy="pawnshopId", cascade={CascadeType.ALL})
	private List<PawnshopPost> pawnshopPosts;

	public List<PawnshopPost> getPawnshopPosts() {
		return pawnshopPosts;
	}

	public void setPawnshopPosts(List<PawnshopPost> pawnshopPosts) {
		this.pawnshopPosts = pawnshopPosts;
	}


}
