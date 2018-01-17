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
public class ProposePrice implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long proposePriceId;

	private int price;
	private String status;
	private Date proposeDate;

	public long getProposePriceId() {
		return proposePriceId;
	}

	public void setProposePriceId(long proposePriceId) {
		this.proposePriceId = proposePriceId;
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
	private Post postId;

	public Post getPostId() {
		return postId;
	}

	public void setPostId(Post postId) {
		this.postId = postId;
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
