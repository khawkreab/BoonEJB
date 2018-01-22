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
	private String pawnerPostItem1;
	private String pawnerPostItem2;
	private String pawnerPostItem3;
	private String pawnerPostItem4;
	private String pawnerPostItem5;
	private String pawnerPostItem6;
	private String pawnerPostItem7;
	private String pawnerPostItem8;
	private String pawnerPostItem9;
	private String pawnerPostItem10;
	private String pawnerPostItem11;
	private String pawnerPostItem12;
	private String pawnerPostItem13;
	private String pawnerPostItem14;
	private String pawnerPostItem15;
	private String pawnerPostItem16;
	private String pawnerPostItem17;
		
	

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
	public String getPawnerPostItem1() {
		return pawnerPostItem1;
	}
	public void setPawnerPostItem1(String pawnerPostItem1) {
		this.pawnerPostItem1 = pawnerPostItem1;
	}
	public String getPawnerPostItem2() {
		return pawnerPostItem2;
	}
	public void setPawnerPostItem2(String pawnerPostItem2) {
		this.pawnerPostItem2 = pawnerPostItem2;
	}
	public String getPawnerPostItem3() {
		return pawnerPostItem3;
	}
	public void setPawnerPostItem3(String pawnerPostItem3) {
		this.pawnerPostItem3 = pawnerPostItem3;
	}
	public String getPawnerPostItem4() {
		return pawnerPostItem4;
	}
	public void setPawnerPostItem4(String pawnerPostItem4) {
		this.pawnerPostItem4 = pawnerPostItem4;
	}
	public String getPawnerPostItem5() {
		return pawnerPostItem5;
	}
	public void setPawnerPostItem5(String pawnerPostItem5) {
		this.pawnerPostItem5 = pawnerPostItem5;
	}
	public String getPawnerPostItem6() {
		return pawnerPostItem6;
	}
	public void setPawnerPostItem6(String pawnerPostItem6) {
		this.pawnerPostItem6 = pawnerPostItem6;
	}
	public String getPawnerPostItem7() {
		return pawnerPostItem7;
	}
	public void setPawnerPostItem7(String pawnerPostItem7) {
		this.pawnerPostItem7 = pawnerPostItem7;
	}
	public String getPawnerPostItem8() {
		return pawnerPostItem8;
	}
	public void setPawnerPostItem8(String pawnerPostItem8) {
		this.pawnerPostItem8 = pawnerPostItem8;
	}
	public String getPawnerPostItem9() {
		return pawnerPostItem9;
	}
	public void setPawnerPostItem9(String pawnerPostItem9) {
		this.pawnerPostItem9 = pawnerPostItem9;
	}
	public String getPawnerPostItem10() {
		return pawnerPostItem10;
	}
	public void setPawnerPostItem10(String pawnerPostItem10) {
		this.pawnerPostItem10 = pawnerPostItem10;
	}
	public String getPawnerPostItem11() {
		return pawnerPostItem11;
	}
	public void setPawnerPostItem11(String pawnerPostItem11) {
		this.pawnerPostItem11 = pawnerPostItem11;
	}
	public String getPawnerPostItem12() {
		return pawnerPostItem12;
	}
	public void setPawnerPostItem12(String pawnerPostItem12) {
		this.pawnerPostItem12 = pawnerPostItem12;
	}
	public String getPawnerPostItem13() {
		return pawnerPostItem13;
	}
	public void setPawnerPostItem13(String pawnerPostItem13) {
		this.pawnerPostItem13 = pawnerPostItem13;
	}
	public String getPawnerPostItem14() {
		return pawnerPostItem14;
	}
	public void setPawnerPostItem14(String pawnerPostItem14) {
		this.pawnerPostItem14 = pawnerPostItem14;
	}
	public String getPawnerPostItem15() {
		return pawnerPostItem15;
	}
	public void setPawnerPostItem15(String pawnerPostItem15) {
		this.pawnerPostItem15 = pawnerPostItem15;
	}
	public String getPawnerPostItem16() {
		return pawnerPostItem16;
	}
	public void setPawnerPostItem16(String pawnerPostItem16) {
		this.pawnerPostItem16 = pawnerPostItem16;
	}
	public String getPawnerPostItem17() {
		return pawnerPostItem17;
	}
	public void setPawnerPostItem17(String pawnerPostItem17) {
		this.pawnerPostItem17 = pawnerPostItem17;
	}
	public Pawner getPawnerId() {
		return pawnerId;
	}
	public void setPawnerId(Pawner pawnerId) {
		this.pawnerId = pawnerId;
	}
	

	@ManyToOne(fetch=FetchType.EAGER)
	private Pawner pawnerId;

	public Pawner getPawner() {
		return pawnerId;
	}
	public void setPawner(Pawner pawnerId) {
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
