package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;

import javax.persistence.Entity;
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

}
