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
public class OrderItem implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderItemId;
	
	private Date orderItemDateIn;
	private Date orderItemDateOut;
	private Date orderItemDatePurchase;

	public long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Date getOrderItemDateIn() {
		return orderItemDateIn;
	}

	public void setOrderItemDateIn(Date orderItemDateIn) {
		this.orderItemDateIn = orderItemDateIn;
	}

	public Date getOrderItemDateOut() {
		return orderItemDateOut;
	}

	public void setOrderItemDateOut(Date orderItemDateOut) {
		this.orderItemDateOut = orderItemDateOut;
	}

	public Date getOrderItemDatePurchase() {
		return orderItemDatePurchase;
	}

	public void setOrderItemDatePurchase(Date orderItemDatePurchase) {
		this.orderItemDatePurchase = orderItemDatePurchase;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	private Pawner pawnerId;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	private PawnshopPost pawnshopPostId;


	public Pawner getPawnerId() {
		return pawnerId;
	}

	public void setPawnerId(Pawner pawnerId) {
		this.pawnerId = pawnerId;
	}

	public PawnshopPost getPawnshopPostId() {
		return pawnshopPostId;
	}

	public void setPawnshopPostId(PawnshopPost pawnshopPostId) {
		this.pawnshopPostId = pawnshopPostId;
	}

	
	
}
