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
	private String pawnshopPostQuality;
	private String pawnshopName;
	
	
	private String pawnshopPostStatus;
	
	private String pawnshopPostPrice;
	
	private String pawnshopPostPicture;
	
	private String pawnshopPostCode;
	
	

	public String getPawnshopPostCode() {
		return pawnshopPostCode;
	}

	public void setPawnshopPostCode(String pawnshopPostCode) {
		this.pawnshopPostCode = pawnshopPostCode;
	}

	public long getPawnshopPostId() {
		return pawnshopPostId;
	}

	public void setPawnshopPostId(long pawnshopPostId) {
		this.pawnshopPostId = pawnshopPostId;
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

	public String getPawnshopPostStatus() {
		return pawnshopPostStatus;
	}

	public void setPawnshopPostStatus(String pawnshopPostStatus) {
		this.pawnshopPostStatus = pawnshopPostStatus;
	}

	public String getPawnshopPostPrice() {
		return pawnshopPostPrice;
	}

	public void setPawnshopPostPrice(String pawnshopPostPrice) {
		this.pawnshopPostPrice = pawnshopPostPrice;
	}

	public String getPawnshopPostPicture() {
		return pawnshopPostPicture;
	}

	public void setPawnshopPostPicture(String pawnshopPostPicture) {
		this.pawnshopPostPicture = pawnshopPostPicture;
	}

	public String getPawnshopPostQuality() {
		return pawnshopPostQuality;
	}

	public void setPawnshopPostQuality(String pawnshopPostQuality) {
		this.pawnshopPostQuality = pawnshopPostQuality;
	}

	public String getPawnshopName() {
		return pawnshopName;
	}

	public void setPawnshopName(String pawnshopName) {
		this.pawnshopName = pawnshopName;
	}



	@ManyToOne(fetch=FetchType.EAGER)
	private Pawnshop pawnshopId;
	
	public Pawnshop getPawnshop() {
		return pawnshopId;
	}
	public void setPawnshop(Pawnshop pawnshopId) {
		this.pawnshopId = pawnshopId;
	}
	public Pawnshop getPawnshopId() {
		return pawnshopId;
	}
	public void setPawnshopId(Pawnshop pawnshopId) {
		this.pawnshopId = pawnshopId;
	}

	@OneToMany(mappedBy="pawnshopPostId", cascade={CascadeType.ALL})
	private List<OrderItem> orderItems;

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	@OneToMany(mappedBy="pawnshopPostId", cascade={CascadeType.ALL})
	private List<Picture> pictures;

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

}
