package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Pawner implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pawnerId;
	
	private String pawnerFirstname;
	private String pawnerLastname;
	private String pawnerEmail;
	private String pawnerPassword;
	private String pawnerProvince;
	private String pawnerPhone;
	private String pawnerState;
	
	private String pawnerZipcode;
	private String pawnerPicture;
	private String pawnerAddress;
	private String pawnerCover;
	
	private String pawnerUsercode;

	
	public long getPawnerId() {
		return pawnerId;
	}

	public void setPawnerId(long pawnerId) {
		this.pawnerId = pawnerId;
	}

	public String getPawnerFirstname() {
		return pawnerFirstname;
	}

	public void setPawnerFirstname(String pawnerFirstname) {
		this.pawnerFirstname = pawnerFirstname;
	}

	public String getPawnerLastname() {
		return pawnerLastname;
	}

	public void setPawnerLastname(String pawnerLastname) {
		this.pawnerLastname = pawnerLastname;
	}

	public String getPawnerEmail() {
		return pawnerEmail;
	}

	public void setPawnerEmail(String pawnerEmail) {
		this.pawnerEmail = pawnerEmail;
	}

	public String getPawnerPassword() {
		return pawnerPassword;
	}

	public void setPawnerPassword(String pawnerPassword) {
		this.pawnerPassword = pawnerPassword;
	}

	public String getPawnerProvince() {
		return pawnerProvince;
	}

	public void setPawnerProvince(String pawnerProvince) {
		this.pawnerProvince = pawnerProvince;
	}
	public String getPawnerPhone() {
		return pawnerPhone;
	}

	public void setPawnerPhone(String pawnerPhone) {
		this.pawnerPhone = pawnerPhone;
	}

	public String getPawnerZipcode() {
		return pawnerZipcode;
	}

	public void setPawnerZipcode(String pawnerZipcode) {
		this.pawnerZipcode = pawnerZipcode;
	}

	public String getPawnerPicture() {
		return pawnerPicture;
	}

	public void setPawnerPicture(String pawnerPicture) {
		this.pawnerPicture = pawnerPicture;
	}

	public String getPawnerAddress() {
		return pawnerAddress;
	}

	public void setPawnerAddress(String pawnerAddress) {
		this.pawnerAddress = pawnerAddress;
	}

	public String getPawnerCover() {
		return pawnerCover;
	}

	public void setPawnerCover(String pawnerCover) {
		this.pawnerCover = pawnerCover;
	}

	public String getPawnerUsercode() {
		return pawnerUsercode;
	}

	public void setPawnerUsercode(String pawnerUsercode) {
		this.pawnerUsercode = pawnerUsercode;
	}

	public String getPawnerState() {
		return pawnerState;
	}

	public void setPawnerState(String pawnerState) {
		this.pawnerState = pawnerState;
	}

	public List<Picture> getPawnerPostPictures() {
		return pawnerPostPictures;
	}

	public void setPawnerPostPictures(List<Picture> pawnerPostPictures) {
		this.pawnerPostPictures = pawnerPostPictures;
	}


	@OneToMany(mappedBy="pawnerId", cascade={CascadeType.ALL})
	private List<PawnerPost>pawnerPosts;
	
	public List<PawnerPost> getPawnerPosts() {
		return pawnerPosts;
	}
	public void setPawnerPosts(List<PawnerPost> pawnerPosts) {
		this.pawnerPosts = pawnerPosts;
	}
	
	@OneToMany(mappedBy="pawnerId", cascade={CascadeType.ALL})
	private List<OrderItem>orders;

	public List<OrderItem> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderItem> orders) {
		this.orders = orders;
	}
	
	@OneToMany(mappedBy="pawnerId", cascade={CascadeType.ALL})
	private List<Picture>pawnerPostPictures;

	
}
