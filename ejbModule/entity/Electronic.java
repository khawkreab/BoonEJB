package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Electronic implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long electronicId;
	
	private String electronicName;
	private String electronicBrand;
	private String electronicSize;
	private String electronicNumber;
	private String electronicYear;
	private String electronicPic;
	private String electronicDetail;
	private Date date;
	
	
	public long getElectronicId() {
		return electronicId;
	}
	public void setElectronicId(long electronicId) {
		this.electronicId = electronicId;
	}
	public String getElectronicName() {
		return electronicName;
	}
	public void setElectronicName(String electronicName) {
		this.electronicName = electronicName;
	}
	public String getElectronicBrand() {
		return electronicBrand;
	}
	public void setElectronicBrand(String electronicBrand) {
		this.electronicBrand = electronicBrand;
	}
	public String getElectronicSize() {
		return electronicSize;
	}
	public void setElectronicSize(String electronicSize) {
		this.electronicSize = electronicSize;
	}
	public String getElectronicNumber() {
		return electronicNumber;
	}
	public void setElectronicNumber(String electronicNumber) {
		this.electronicNumber = electronicNumber;
	}
	public String getElectronicYear() {
		return electronicYear;
	}
	public void setElectronicYear(String electronicYear) {
		this.electronicYear = electronicYear;
	}
	public String getElectronicPic() {
		return electronicPic;
	}
	public void setElectronicPic(String electronicPic) {
		this.electronicPic = electronicPic;
	}
	public String getElectronicDetail() {
		return electronicDetail;
	}
	public void setElectronicDetail(String electronicDetail) {
		this.electronicDetail = electronicDetail;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}



	@ManyToOne(fetch=FetchType.EAGER)
	private Pawner pawnerId;

	public Pawner getPawner() {
		return pawnerId;
	}
	public void setPawner(Pawner pawnerId) {
		this.pawnerId = pawnerId;
	}
	
	@OneToMany(mappedBy="eId", cascade={CascadeType.ALL})
	private List<ProposePrice> proposeprice;

	public List<ProposePrice> getProposeprice() {
		return proposeprice;
	}
	public void setProposeprice(List<ProposePrice> proposeprice) {
		this.proposeprice = proposeprice;
	}
	
}
