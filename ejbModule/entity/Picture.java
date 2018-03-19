package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Picture implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pictureId;
	
	private String picture;

	
	public long getPictureId() {
		return pictureId;
	}

	public void setPictureId(long pictureId) {
		this.pictureId = pictureId;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	private PawnerPost pawnerPostId;

	public PawnerPost getPawnerPostId() {
		return pawnerPostId;
	}

	public void setPawnerPostId(PawnerPost pawnerPostId) {
		this.pawnerPostId = pawnerPostId;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Pawner pawnerId;

	public Pawner getPawnerId() {
		return pawnerId;
	}

	public void setPawnerId(Pawner pawnerId) {
		this.pawnerId = pawnerId;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Pawnshop pawnshopId;


	public Pawnshop getPawnshopId() {
		return pawnshopId;
	}

	public void setPawnshopId(Pawnshop pawnshopId) {
		this.pawnshopId = pawnshopId;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	private PawnshopPost pawnshopPostId;


	public PawnshopPost getPawnshopPostId() {
		return pawnshopPostId;
	}

	public void setPawnshopPostId(PawnshopPost pawnshopPostId) {
		this.pawnshopPostId = pawnshopPostId;
	}


}
