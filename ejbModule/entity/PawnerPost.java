/*!-- 
// page : PawnerPost
// version : 1.0
// task : change name 
// edit by : khawkreab
 --*/

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
public class PawnerPost implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pawnerPostId;
	
	private Date pawnerPostDate;
	private String pawnerPostItemType;
	private String pawnerPostType;
	private String pawnerPostName;
	private String pawnerPostDescription;
	private String pawnerPostSize;
	private String pawnerPostModel;
	private String pawnerPostSerial;
	private String pawnerPostBrand;
	private String pawnerPostYearPurchase;
	private String pawnerPostAnsurranc;
	private String pawnerPostDiamond;
	private String pawnerPostRemote;
	private String pawnerPostPure;
	private String pawnerPostWeigh;
	private String pawnerPostCondition;
	private String pawnerPostSystem;
	private String pawnerPostImg1;
	private String pawnerPostImg2;
		
	

	public long getPawnerPostId() {
		return pawnerPostId;
	}
	public void setPawnerPostId(long pawnerPostId) {
		this.pawnerPostId = pawnerPostId;
	}
	public Date getPawnerPostDate() {
		return pawnerPostDate;
	}
	public void setPawnerPostDate(Date pawnerPostDate) {
		this.pawnerPostDate = pawnerPostDate;
	}
	public String getPawnerPostItemType() {
		return pawnerPostItemType;
	}
	public void setPawnerPostItemType(String pawnerPostItemType) {
		this.pawnerPostItemType = pawnerPostItemType;
	}
	
	public String getPawnerPostType() {
		return pawnerPostType;
	}
	public void setPawnerPostType(String pawnerPostType) {
		this.pawnerPostType = pawnerPostType;
	}
	public String getPawnerPostName() {
		return pawnerPostName;
	}
	public void setPawnerPostName(String pawnerPostName) {
		this.pawnerPostName = pawnerPostName;
	}
	public String getPawnerPostDescription() {
		return pawnerPostDescription;
	}
	public void setPawnerPostDescription(String pawnerPostDescription) {
		this.pawnerPostDescription = pawnerPostDescription;
	}
	public String getPawnerPostSize() {
		return pawnerPostSize;
	}
	public void setPawnerPostSize(String pawnerPostSize) {
		this.pawnerPostSize = pawnerPostSize;
	}
	public String getPawnerPostModel() {
		return pawnerPostModel;
	}
	public void setPawnerPostModel(String pawnerPostModel) {
		this.pawnerPostModel = pawnerPostModel;
	}
	public String getPawnerPostSerial() {
		return pawnerPostSerial;
	}
	public void setPawnerPostSerial(String pawnerPostSerial) {
		this.pawnerPostSerial = pawnerPostSerial;
	}
	public String getPawnerPostBrand() {
		return pawnerPostBrand;
	}
	public void setPawnerPostBrand(String pawnerPostBrand) {
		this.pawnerPostBrand = pawnerPostBrand;
	}
	public String getPawnerPostYearPurchase() {
		return pawnerPostYearPurchase;
	}
	public void setPawnerPostYearPurchase(String pawnerPostYearPurchase) {
		this.pawnerPostYearPurchase = pawnerPostYearPurchase;
	}
	public String getPawnerPostAnsurranc() {
		return pawnerPostAnsurranc;
	}
	public void setPawnerPostAnsurranc(String pawnerPostAnsurranc) {
		this.pawnerPostAnsurranc = pawnerPostAnsurranc;
	}
	public String getPawnerPostDiamond() {
		return pawnerPostDiamond;
	}
	public void setPawnerPostDiamond(String pawnerPostDiamond) {
		this.pawnerPostDiamond = pawnerPostDiamond;
	}
	public String getPawnerPostRemote() {
		return pawnerPostRemote;
	}
	public void setPawnerPostRemote(String pawnerPostRemote) {
		this.pawnerPostRemote = pawnerPostRemote;
	}
	public String getPawnerPostPure() {
		return pawnerPostPure;
	}
	public void setPawnerPostPure(String pawnerPostPure) {
		this.pawnerPostPure = pawnerPostPure;
	}
	public String getPawnerPostWeigh() {
		return pawnerPostWeigh;
	}
	public void setPawnerPostWeigh(String pawnerPostWeigh) {
		this.pawnerPostWeigh = pawnerPostWeigh;
	}
	public String getPawnerPostCondition() {
		return pawnerPostCondition;
	}
	public void setPawnerPostCondition(String pawnerPostCondition) {
		this.pawnerPostCondition = pawnerPostCondition;
	}
	public String getPawnerPostSystem() {
		return pawnerPostSystem;
	}
	public void setPawnerPostSystem(String pawnerPostSystem) {
		this.pawnerPostSystem = pawnerPostSystem;
	}
	public String getPawnerPostImg1() {
		return pawnerPostImg1;
	}
	public void setPawnerPostImg1(String pawnerPostImg1) {
		this.pawnerPostImg1 = pawnerPostImg1;
	}
	public String getPawnerPostImg2() {
		return pawnerPostImg2;
	}
	public void setPawnerPostImg2(String pawnerPostImg2) {
		this.pawnerPostImg2 = pawnerPostImg2;
	}




	@ManyToOne(fetch=FetchType.EAGER)
	private Pawner pawnerId;

	public Pawner getPawner() {
		return pawnerId;
	}
	public void setPawner(Pawner pawnerId) {
		this.pawnerId = pawnerId;
	}
	
	
	
	public Pawner getPawnerId() {
		return pawnerId;
	}
	public void setPawnerId(Pawner pawnerId) {
		this.pawnerId = pawnerId;
	}




	@OneToMany(mappedBy="pawnerPostId", cascade={CascadeType.ALL})
	private List<Estimate> estimates;

	public List<Estimate> getEstimates() {
		return estimates;
	}
	public void setEstimates(List<Estimate> estimates) {
		this.estimates = estimates;
	}
	
}
