package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProposePrice implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long proposepriceId;

	private int price;
	private String status;
	private Date proposeDate;

	public long getProposepriceId() {
		return proposepriceId;
	}

	public void setProposepriceId(long proposepriceId) {
		this.proposepriceId = proposepriceId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getProposeDate() {
		return proposeDate;
	}

	public void setProposeDate(Date proposeDate) {
		this.proposeDate = proposeDate;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Gold goldId;

	public Gold getGoldId() {
		return goldId;
	}

	public void setGoldId(Gold goldId) {
		this.goldId = goldId;
	}
	
	@OneToOne
	public Pawnshop pawnshopId;

	public Pawnshop getPawnshopId() {
		return pawnshopId;
	}

	public void setPawnshopId(Pawnshop pawnshopId) {
		this.pawnshopId = pawnshopId;
	}
	


	

}
