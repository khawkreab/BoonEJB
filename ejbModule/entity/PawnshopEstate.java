package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PawnshopEstate implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long PawnshopEstateId;
	
	private Date pawnshopEstateDate;
	private String pawnshopEstateItemType;
	private String pawnshopEstateName;
	private String pawnshopEstateDescription;
	private String pawnshopEstateBrand;
	private String pawnshopEstatePure ;
	private String pawnshopEstateWeigh;
	private String pawnshopEstateCategory;
	private String pawnshopEstateProduction ;
	private String pawnshopEstateModel;
	private String pawnshopEstateSerial;
	private String pawnshopEstateCase;
	private String pawnshopEstateBracelet;
	private String pawnshopEstateDiamond;
	private String pawnshopEstatePackage;
	private String pawnshopEstateWarranty;

	private String pawnshopEstateSize;
	private String pawnshopEstateRemote;
	private String pawnshopEstateCapacity;
	private String pawnshopEstatePurchase;
	private String pawnshopEstateBattery;
	private String pawnshopEstateTypeCamera;
	private String pawnshopEstateCameraLen;
	private String pawnshopEstateHarddisk;
	private String pawnshopEstateRam;
	private String pawnshopEstateDevice;
	
	private String pawnerPostStatus;
	
	private String pawnerPostPrice;

	public long getPawnshopEstateId() {
		return PawnshopEstateId;
	}

	public void setPawnshopEstateId(long pawnshopEstateId) {
		PawnshopEstateId = pawnshopEstateId;
	}

	public Date getPawnshopEstateDate() {
		return pawnshopEstateDate;
	}

	public void setPawnshopEstateDate(Date pawnshopEstateDate) {
		this.pawnshopEstateDate = pawnshopEstateDate;
	}

	public String getPawnshopEstateItemType() {
		return pawnshopEstateItemType;
	}

	public void setPawnshopEstateItemType(String pawnshopEstateItemType) {
		this.pawnshopEstateItemType = pawnshopEstateItemType;
	}

	public String getPawnshopEstateName() {
		return pawnshopEstateName;
	}

	public void setPawnshopEstateName(String pawnshopEstateName) {
		this.pawnshopEstateName = pawnshopEstateName;
	}

	public String getPawnshopEstateDescription() {
		return pawnshopEstateDescription;
	}

	public void setPawnshopEstateDescription(String pawnshopEstateDescription) {
		this.pawnshopEstateDescription = pawnshopEstateDescription;
	}

	public String getPawnshopEstateBrand() {
		return pawnshopEstateBrand;
	}

	public void setPawnshopEstateBrand(String pawnshopEstateBrand) {
		this.pawnshopEstateBrand = pawnshopEstateBrand;
	}

	public String getPawnshopEstatePure() {
		return pawnshopEstatePure;
	}

	public void setPawnshopEstatePure(String pawnshopEstatePure) {
		this.pawnshopEstatePure = pawnshopEstatePure;
	}

	public String getPawnshopEstateWeigh() {
		return pawnshopEstateWeigh;
	}

	public void setPawnshopEstateWeigh(String pawnshopEstateWeigh) {
		this.pawnshopEstateWeigh = pawnshopEstateWeigh;
	}

	public String getPawnshopEstateCategory() {
		return pawnshopEstateCategory;
	}

	public void setPawnshopEstateCategory(String pawnshopEstateCategory) {
		this.pawnshopEstateCategory = pawnshopEstateCategory;
	}

	public String getPawnshopEstateProduction() {
		return pawnshopEstateProduction;
	}

	public void setPawnshopEstateProduction(String pawnshopEstateProduction) {
		this.pawnshopEstateProduction = pawnshopEstateProduction;
	}

	public String getPawnshopEstateModel() {
		return pawnshopEstateModel;
	}

	public void setPawnshopEstateModel(String pawnshopEstateModel) {
		this.pawnshopEstateModel = pawnshopEstateModel;
	}

	public String getPawnshopEstateSerial() {
		return pawnshopEstateSerial;
	}

	public void setPawnshopEstateSerial(String pawnshopEstateSerial) {
		this.pawnshopEstateSerial = pawnshopEstateSerial;
	}

	public String getPawnshopEstateCase() {
		return pawnshopEstateCase;
	}

	public void setPawnshopEstateCase(String pawnshopEstateCase) {
		this.pawnshopEstateCase = pawnshopEstateCase;
	}

	public String getPawnshopEstateBracelet() {
		return pawnshopEstateBracelet;
	}

	public void setPawnshopEstateBracelet(String pawnshopEstateBracelet) {
		this.pawnshopEstateBracelet = pawnshopEstateBracelet;
	}

	public String getPawnshopEstateDiamond() {
		return pawnshopEstateDiamond;
	}

	public void setPawnshopEstateDiamond(String pawnshopEstateDiamond) {
		this.pawnshopEstateDiamond = pawnshopEstateDiamond;
	}

	public String getPawnshopEstatePackage() {
		return pawnshopEstatePackage;
	}

	public void setPawnshopEstatePackage(String pawnshopEstatePackage) {
		this.pawnshopEstatePackage = pawnshopEstatePackage;
	}

	public String getPawnshopEstateWarranty() {
		return pawnshopEstateWarranty;
	}

	public void setPawnshopEstateWarranty(String pawnshopEstateWarranty) {
		this.pawnshopEstateWarranty = pawnshopEstateWarranty;
	}

	public String getPawnshopEstateSize() {
		return pawnshopEstateSize;
	}

	public void setPawnshopEstateSize(String pawnshopEstateSize) {
		this.pawnshopEstateSize = pawnshopEstateSize;
	}

	public String getPawnshopEstateRemote() {
		return pawnshopEstateRemote;
	}

	public void setPawnshopEstateRemote(String pawnshopEstateRemote) {
		this.pawnshopEstateRemote = pawnshopEstateRemote;
	}

	public String getPawnshopEstateCapacity() {
		return pawnshopEstateCapacity;
	}

	public void setPawnshopEstateCapacity(String pawnshopEstateCapacity) {
		this.pawnshopEstateCapacity = pawnshopEstateCapacity;
	}

	public String getPawnshopEstatePurchase() {
		return pawnshopEstatePurchase;
	}

	public void setPawnshopEstatePurchase(String pawnshopEstatePurchase) {
		this.pawnshopEstatePurchase = pawnshopEstatePurchase;
	}

	public String getPawnshopEstateBattery() {
		return pawnshopEstateBattery;
	}

	public void setPawnshopEstateBattery(String pawnshopEstateBattery) {
		this.pawnshopEstateBattery = pawnshopEstateBattery;
	}

	public String getPawnshopEstateTypeCamera() {
		return pawnshopEstateTypeCamera;
	}

	public void setPawnshopEstateTypeCamera(String pawnshopEstateTypeCamera) {
		this.pawnshopEstateTypeCamera = pawnshopEstateTypeCamera;
	}

	public String getPawnshopEstateCameraLen() {
		return pawnshopEstateCameraLen;
	}

	public void setPawnshopEstateCameraLen(String pawnshopEstateCameraLen) {
		this.pawnshopEstateCameraLen = pawnshopEstateCameraLen;
	}

	public String getPawnshopEstateHarddisk() {
		return pawnshopEstateHarddisk;
	}

	public void setPawnshopEstateHarddisk(String pawnshopEstateHarddisk) {
		this.pawnshopEstateHarddisk = pawnshopEstateHarddisk;
	}

	public String getPawnshopEstateRam() {
		return pawnshopEstateRam;
	}

	public void setPawnshopEstateRam(String pawnshopEstateRam) {
		this.pawnshopEstateRam = pawnshopEstateRam;
	}

	public String getPawnshopEstateDevice() {
		return pawnshopEstateDevice;
	}

	public void setPawnshopEstateDevice(String pawnshopEstateDevice) {
		this.pawnshopEstateDevice = pawnshopEstateDevice;
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


}
