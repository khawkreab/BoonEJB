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
	private String pawnerPostName;
	private String pawnerPostDescription;
	private String pawnerPostBrand;
	private String pawnerPostPure ;
	private String pawnerPostWeigh;
	private String pawnerPostCategory;
	private String pawnerPostProduction ;
	private String pawnerPostModel;
	private String pawnerPostSerial;
	private String pawnerPostCase;
	private String pawnerPostBracelet;
	private String pawnerPostDiamond;
	private String pawnerPostPackage;
	private String pawnerPostWarranty;

	private String pawnerPostSize;
	private String panwePostRemote;
	private String pawnerPostCapacity;
	private String pawnerPostPurchase;
	private String pawnerPostBattery;
	private String pawnerPostTypeCamera;
	private String pawnerPostCameraLen;
	private String pawnerPostHarddisk;
	private String pawnerPostRam;
	private String pawnerPostDevice;


	public String getPawnerPostSize() {
		return pawnerPostSize;
	}
	public void setPawnerPostSize(String pawnerPostSize) {
		this.pawnerPostSize = pawnerPostSize;
	}
	public String getPanwePostRemote() {
		return panwePostRemote;
	}
	public void setPanwePostRemote(String panwePostRemote) {
		this.panwePostRemote = panwePostRemote;
	}
	public String getPawnerPostCapacity() {
		return pawnerPostCapacity;
	}
	public void setPawnerPostCapacity(String pawnerPostCapacity) {
		this.pawnerPostCapacity = pawnerPostCapacity;
	}
	public String getPawnerPostPurchase() {
		return pawnerPostPurchase;
	}
	public void setPawnerPostPurchase(String pawnerPostPurchase) {
		this.pawnerPostPurchase = pawnerPostPurchase;
	}
	public String getPawnerPostBattery() {
		return pawnerPostBattery;
	}
	public void setPawnerPostBattery(String pawnerPostBattery) {
		this.pawnerPostBattery = pawnerPostBattery;
	}
	public String getPawnerPostTypeCamera() {
		return pawnerPostTypeCamera;
	}
	public void setPawnerPostTypeCamera(String pawnerPostTypeCamera) {
		this.pawnerPostTypeCamera = pawnerPostTypeCamera;
	}
	public String getPawnerPostCameraLen() {
		return pawnerPostCameraLen;
	}
	public void setPawnerPostCameraLen(String pawnerPostCameraLen) {
		this.pawnerPostCameraLen = pawnerPostCameraLen;
	}
	public String getPawnerPostHarddisk() {
		return pawnerPostHarddisk;
	}
	public void setPawnerPostHarddisk(String pawnerPostHarddisk) {
		this.pawnerPostHarddisk = pawnerPostHarddisk;
	}
	public String getPawnerPostRam() {
		return pawnerPostRam;
	}
	public void setPawnerPostRam(String pawnerPostRam) {
		this.pawnerPostRam = pawnerPostRam;
	}
	public String getPawnerPostDevice() {
		return pawnerPostDevice;
	}
	public void setPawnerPostDevice(String pawnerPostDevice) {
		this.pawnerPostDevice = pawnerPostDevice;
	}
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
	public String getPawnerPostBrand() {
		return pawnerPostBrand;
	}
	public void setPawnerPostBrand(String pawnerPostBrand) {
		this.pawnerPostBrand = pawnerPostBrand;
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
	public String getPawnerPostCategory() {
		return pawnerPostCategory;
	}
	public void setPawnerPostCategory(String pawnerPostCategory) {
		this.pawnerPostCategory = pawnerPostCategory;
	}
	public String getPawnerPostProduction() {
		return pawnerPostProduction;
	}
	public void setPawnerPostProduction(String pawnerPostProduction) {
		this.pawnerPostProduction = pawnerPostProduction;
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
	public String getPawnerPostCase() {
		return pawnerPostCase;
	}
	public void setPawnerPostCase(String pawnerPostCase) {
		this.pawnerPostCase = pawnerPostCase;
	}
	public String getPawnerPostBracelet() {
		return pawnerPostBracelet;
	}
	public void setPawnerPostBracelet(String pawnerPostBracelet) {
		this.pawnerPostBracelet = pawnerPostBracelet;
	}
	public String getPawnerPostDiamond() {
		return pawnerPostDiamond;
	}
	public void setPawnerPostDiamond(String pawnerPostDiamond) {
		this.pawnerPostDiamond = pawnerPostDiamond;
	}
	public String getPawnerPostPackage() {
		return pawnerPostPackage;
	}
	public void setPawnerPostPackage(String pawnerPostPackage) {
		this.pawnerPostPackage = pawnerPostPackage;
	}
	public String getPawnerPostWarranty() {
		return pawnerPostWarranty;
	}
	public void setPawnerPostWarranty(String pawnerPostWarranty) {
		this.pawnerPostWarranty = pawnerPostWarranty;
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
