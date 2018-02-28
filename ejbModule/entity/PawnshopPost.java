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
public class PawnshopPost implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pawnshopPostId;
	
	private Date pawnshopPostDate;
	private String pawnshopPostItemType;
	private String pawnshopPostName;
	private String pawnshopPostDescription;
	private String pawnshopPostBrand;
	private String pawnshopPostPure ;
	private String pawnshopPostWeigh;
	private String pawnshopPostCategory;
	private String pawnshopPostProduction ;
	private String pawnshopPostModel;
	private String pawnshopPostSerial;
	private String pawnshopPostCase;
	private String pawnshopPostBracelet;
	private String pawnshopPostDiamond;
	private String pawnshopPostPackage;
	private String pawnshopPostWarranty;

	private String pawnshopPostSize;
	private String pawnshopPostRemote;
	private String pawnshopPostCapacity;
	private String pawnshopPostPurchase;
	private String pawnshopPostBattery;
	private String pawnshopPostTypeCamera;
	private String pawnshopPostCameraLen;
	private String pawnshopPostHarddisk;
	private String pawnshopPostRam;
	private String pawnshopPostDevice;
	
	private String pawnerPostStatus;
	
	private String pawnerPostPrice;

	public long getPawnshopPostId() {
		return pawnshopPostId;
	}

	public void setPawnshopPostId(long pawnshopPostId) {
		pawnshopPostId = pawnshopPostId;
	}

	public Date getPawnshopPostDate() {
		return pawnshopPostDate;
	}

	public void setPawnshopPostDate(Date pawnshopPostDate) {
		this.pawnshopPostDate = pawnshopPostDate;
	}

	public String getPawnshopPostItemType() {
		return pawnshopPostItemType;
	}

	public void setPawnshopPostItemType(String pawnshopPostItemType) {
		this.pawnshopPostItemType = pawnshopPostItemType;
	}

	public String getPawnshopPostName() {
		return pawnshopPostName;
	}

	public void setPawnshopPostName(String pawnshopPostName) {
		this.pawnshopPostName = pawnshopPostName;
	}

	public String getPawnshopPostDescription() {
		return pawnshopPostDescription;
	}

	public void setPawnshopPostDescription(String pawnshopPostDescription) {
		this.pawnshopPostDescription = pawnshopPostDescription;
	}

	public String getPawnshopPostBrand() {
		return pawnshopPostBrand;
	}

	public void setPawnshopPostBrand(String pawnshopPostBrand) {
		this.pawnshopPostBrand = pawnshopPostBrand;
	}

	public String getPawnshopPostPure() {
		return pawnshopPostPure;
	}

	public void setPawnshopPostPure(String pawnshopPostPure) {
		this.pawnshopPostPure = pawnshopPostPure;
	}

	public String getPawnshopPostWeigh() {
		return pawnshopPostWeigh;
	}

	public void setPawnshopPostWeigh(String pawnshopPostWeigh) {
		this.pawnshopPostWeigh = pawnshopPostWeigh;
	}

	public String getPawnshopPostCategory() {
		return pawnshopPostCategory;
	}

	public void setPawnshopPostCategory(String pawnshopPostCategory) {
		this.pawnshopPostCategory = pawnshopPostCategory;
	}

	public String getPawnshopPostProduction() {
		return pawnshopPostProduction;
	}

	public void setPawnshopPostProduction(String pawnshopPostProduction) {
		this.pawnshopPostProduction = pawnshopPostProduction;
	}

	public String getPawnshopPostModel() {
		return pawnshopPostModel;
	}

	public void setPawnshopPostModel(String pawnshopPostModel) {
		this.pawnshopPostModel = pawnshopPostModel;
	}

	public String getPawnshopPostSerial() {
		return pawnshopPostSerial;
	}

	public void setPawnshopPostSerial(String pawnshopPostSerial) {
		this.pawnshopPostSerial = pawnshopPostSerial;
	}

	public String getPawnshopPostCase() {
		return pawnshopPostCase;
	}

	public void setPawnshopPostCase(String pawnshopPostCase) {
		this.pawnshopPostCase = pawnshopPostCase;
	}

	public String getPawnshopPostBracelet() {
		return pawnshopPostBracelet;
	}

	public void setPawnshopPostBracelet(String pawnshopPostBracelet) {
		this.pawnshopPostBracelet = pawnshopPostBracelet;
	}

	public String getPawnshopPostDiamond() {
		return pawnshopPostDiamond;
	}

	public void setPawnshopPostDiamond(String pawnshopPostDiamond) {
		this.pawnshopPostDiamond = pawnshopPostDiamond;
	}

	public String getPawnshopPostPackage() {
		return pawnshopPostPackage;
	}

	public void setPawnshopPostPackage(String pawnshopPostPackage) {
		this.pawnshopPostPackage = pawnshopPostPackage;
	}

	public String getPawnshopPostWarranty() {
		return pawnshopPostWarranty;
	}

	public void setPawnshopPostWarranty(String pawnshopPostWarranty) {
		this.pawnshopPostWarranty = pawnshopPostWarranty;
	}

	public String getPawnshopPostSize() {
		return pawnshopPostSize;
	}

	public void setPawnshopPostSize(String pawnshopPostSize) {
		this.pawnshopPostSize = pawnshopPostSize;
	}

	public String getPawnshopPostRemote() {
		return pawnshopPostRemote;
	}

	public void setPawnshopPostRemote(String pawnshopPostRemote) {
		this.pawnshopPostRemote = pawnshopPostRemote;
	}

	public String getPawnshopPostCapacity() {
		return pawnshopPostCapacity;
	}

	public void setPawnshopPostCapacity(String pawnshopPostCapacity) {
		this.pawnshopPostCapacity = pawnshopPostCapacity;
	}

	public String getPawnshopPostPurchase() {
		return pawnshopPostPurchase;
	}

	public void setPawnshopPostPurchase(String pawnshopPostPurchase) {
		this.pawnshopPostPurchase = pawnshopPostPurchase;
	}

	public String getPawnshopPostBattery() {
		return pawnshopPostBattery;
	}

	public void setPawnshopPostBattery(String pawnshopPostBattery) {
		this.pawnshopPostBattery = pawnshopPostBattery;
	}

	public String getPawnshopPostTypeCamera() {
		return pawnshopPostTypeCamera;
	}

	public void setPawnshopPostTypeCamera(String pawnshopPostTypeCamera) {
		this.pawnshopPostTypeCamera = pawnshopPostTypeCamera;
	}

	public String getPawnshopPostCameraLen() {
		return pawnshopPostCameraLen;
	}

	public void setPawnshopPostCameraLen(String pawnshopPostCameraLen) {
		this.pawnshopPostCameraLen = pawnshopPostCameraLen;
	}

	public String getPawnshopPostHarddisk() {
		return pawnshopPostHarddisk;
	}

	public void setPawnshopPostHarddisk(String pawnshopPostHarddisk) {
		this.pawnshopPostHarddisk = pawnshopPostHarddisk;
	}

	public String getPawnshopPostRam() {
		return pawnshopPostRam;
	}

	public void setPawnshopPostRam(String pawnshopPostRam) {
		this.pawnshopPostRam = pawnshopPostRam;
	}

	public String getPawnshopPostDevice() {
		return pawnshopPostDevice;
	}

	public void setPawnshopPostDevice(String pawnshopPostDevice) {
		this.pawnshopPostDevice = pawnshopPostDevice;
	}

	public String getPawnerPostStatus() {
		return pawnerPostStatus;
	}

	public void setPawnerPostStatus(String pawnerPostStatus) {
		this.pawnerPostStatus = pawnerPostStatus;
	}

	public String getPawnerPostPrice() {
		return pawnerPostPrice;
	}

	public void setPawnerPostPrice(String pawnerPostPrice) {
		this.pawnerPostPrice = pawnerPostPrice;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	private Pawner pawnshopId;
	
	@OneToMany(mappedBy="pawnshopPostId", cascade={CascadeType.ALL})
	private List<OrderItem> orderItems;

	public Pawner getPawnshopId() {
		return pawnshopId;
	}

	public void setPawnshopId(Pawner pawnshopId) {
		this.pawnshopId = pawnshopId;
	}

	
	

}
