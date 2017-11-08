package entity;

import java.io.Serializable;
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
public class Gold implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long goldId;
	
	private String goldName;
	private String goldBrand;
	private String goldPure;
	private String goldWeight;
	private String goldPic;
	private String goldDetail;
	
	public long getGoldId() {
		return goldId;
	}
	public void setGoldId(long goldId) {
		this.goldId = goldId;
	}
	public String getGoldName() {
		return goldName;
	}
	public void setGoldName(String goldName) {
		this.goldName = goldName;
	}
	public String getGoldBrand() {
		return goldBrand;
	}
	public void setGoldBrand(String goldBrand) {
		this.goldBrand = goldBrand;
	}
	public String getGoldPure() {
		return goldPure;
	}
	public void setGoldPure(String goldPure) {
		this.goldPure = goldPure;
	}
	public String getGoldWeight() {
		return goldWeight;
	}
	public void setGoldWeight(String goldWeight) {
		this.goldWeight = goldWeight;
	}
	public String getGoldPic() {
		return goldPic;
	}
	public void setGoldPic(String goldPic) {
		this.goldPic = goldPic;
	}
	public String getGoldDetail() {
		return goldDetail;
	}
	public void setGoldDetail(String goldDetail) {
		this.goldDetail = goldDetail;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Pawner pawnerId;

	public Pawner getPawner() {
		return pawnerId;
	}
	public void setPawner(Pawner pawnerId) {
		this.pawnerId = pawnerId;
	}
	
	@OneToMany(mappedBy="goldId", cascade={CascadeType.ALL})
	private List<ProposePrice> proposeprice;

	public List<ProposePrice> getProposeprice() {
		return proposeprice;
	}
	public void setProposeprice(List<ProposePrice> proposeprice) {
		this.proposeprice = proposeprice;
	}
	
}
