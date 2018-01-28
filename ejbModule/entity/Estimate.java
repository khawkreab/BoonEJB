/*!-- 
// page : Estimate
// version : 1.0
// task : estimatePriceMin estimatePriceMax
// edit by : khawkreab
 --*/

package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



import javax.persistence.Entity;
import javax.persistence.FetchType;


@Entity
public class Estimate implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long estimateId;

	private String estimatePriceMin;
	private String estimatePriceMax;
	private String estimateStatus;
	private Date estimateDate;
	private Date estimateAccessDate;

	
	public long getEstimateId() {
		return estimateId;
	}

	public void setEstimateId(long estimateId) {
		this.estimateId = estimateId;
	}

	public String getEstimateStatus() {
		return estimateStatus;
	}

	public void setEstimateStatus(String estimateStatus) {
		this.estimateStatus = estimateStatus;
	}

	public Date getEstimateDate() {
		return estimateDate;
	}

	public void setEstimateDate(Date estimateDate) {
		this.estimateDate = estimateDate;
	}

	public Date getEstimateAccessDate() {
		return estimateAccessDate;
	}

	public void setEstimateAccessDate(Date estimateAccessDate) {
		this.estimateAccessDate = estimateAccessDate;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	private PawnerPost pawnerPostId;

	
	public PawnerPost getPawnerPostId() {
		return pawnerPostId;
	}

	public void setPawnerPostId(PawnerPost pawnerPostId) {
		this.pawnerPostId = pawnerPostId;
	}
	
	public String getEstimatePriceMin() {
		return estimatePriceMin;
	}

	public void setEstimatePriceMin(String estimatePriceMin) {
		this.estimatePriceMin = estimatePriceMin;
	}

	public String getEstimatePriceMax() {
		return estimatePriceMax;
	}

	public void setEstimatePriceMax(String estimatePriceMax) {
		this.estimatePriceMax = estimatePriceMax;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	public Pawnshop pawnshopId;

	public Pawnshop getPawnshopId() {
		return pawnshopId;
	}

	public void setPawnshopId(Pawnshop pawnshopId) {
		this.pawnshopId = pawnshopId;
	}
	


	

}
