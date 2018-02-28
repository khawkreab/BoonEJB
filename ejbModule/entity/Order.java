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
public class Order implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pawnerOrderId;
	
	private Date pawnerOrderDateIn;
	private Date pawnerOrderDateOut;
	private Date pawnerOrderDatePurchase;

	

	@ManyToOne(fetch=FetchType.EAGER)
	private Pawner pawnerId;
	
	@OneToMany(mappedBy="pawnerPostId", cascade={CascadeType.ALL})
	private List<PawnshopPost> pawnshopPosts;
	
}
