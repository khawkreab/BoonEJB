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
public class Jewelry implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long jewId;
	
	private String jewName;
	private String jewType;
	private String jewPure;
	private String jewWeight;
	private String jewPic;
	private String jewDetail;
	private Date date;
	
	
	public long getJewId() {
		return jewId;
	}
	public void setJewId(long jewId) {
		this.jewId = jewId;
	}
	public String getJewName() {
		return jewName;
	}
	public void setJewName(String jewName) {
		this.jewName = jewName;
	}
	public String getJewType() {
		return jewType;
	}
	public void setJewType(String jewType) {
		this.jewType = jewType;
	}
	public String getJewPure() {
		return jewPure;
	}
	public void setJewPure(String jewPure) {
		this.jewPure = jewPure;
	}
	public String getJewWeight() {
		return jewWeight;
	}
	public void setJewWeight(String jewWeight) {
		this.jewWeight = jewWeight;
	}
	public String getJewPic() {
		return jewPic;
	}
	public void setJewPic(String jewPic) {
		this.jewPic = jewPic;
	}
	public String getJewDetail() {
		return jewDetail;
	}
	public void setJewDetail(String jewDetail) {
		this.jewDetail = jewDetail;
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
	
	@OneToMany(mappedBy="jewId", cascade={CascadeType.ALL})
	private List<ProposePrice> proposeprice;

	public List<ProposePrice> getProposeprice() {
		return proposeprice;
	}
	public void setProposeprice(List<ProposePrice> proposeprice) {
		this.proposeprice = proposeprice;
	}
	
}
