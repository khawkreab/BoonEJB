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
public class Timepiece implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long timepieceId;
	
	private String timepieceName;
	private String timepieceBrand;
	private String timepieceModel;
	private String timepieceNumber;
	private String timepieceYear;
	private String timepiecePic;
	private String timepieceDetail;
	private Date date;
	
	

	public long getTimepieceId() {
		return timepieceId;
	}
	public void setTimepieceId(long timepieceId) {
		this.timepieceId = timepieceId;
	}
	public String getTimepieceName() {
		return timepieceName;
	}
	public void setTimepieceName(String timepieceName) {
		this.timepieceName = timepieceName;
	}
	public String getTimepieceBrand() {
		return timepieceBrand;
	}
	public void setTimepieceBrand(String timepieceBrand) {
		this.timepieceBrand = timepieceBrand;
	}
	public String getTimepieceModel() {
		return timepieceModel;
	}
	public void setTimepieceModel(String timepieceModel) {
		this.timepieceModel = timepieceModel;
	}
	public String getTimepieceNumber() {
		return timepieceNumber;
	}
	public void setTimepieceNumber(String timepieceNumber) {
		this.timepieceNumber = timepieceNumber;
	}
	public String getTimepieceYear() {
		return timepieceYear;
	}
	public void setTimepieceYear(String timepieceYear) {
		this.timepieceYear = timepieceYear;
	}
	public String getTimepiecePic() {
		return timepiecePic;
	}
	public void setTimepiecePic(String timepiecePic) {
		this.timepiecePic = timepiecePic;
	}
	public String getTimepieceDetail() {
		return timepieceDetail;
	}
	public void setTimepieceDetail(String timepieceDetail) {
		this.timepieceDetail = timepieceDetail;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}



	@ManyToOne(fetch=FetchType.EAGER)
	private Pawner pawnerId;

	public Pawner getPawner() {
		return pawnerId;
	}
	public void setPawner(Pawner pawnerId) {
		this.pawnerId = pawnerId;
	}
	
	@OneToMany(mappedBy="timeId", cascade={CascadeType.ALL})
	private List<ProposePrice> proposeprice;

	public List<ProposePrice> getProposeprice() {
		return proposeprice;
	}
	public void setProposeprice(List<ProposePrice> proposeprice) {
		this.proposeprice = proposeprice;
	}
	
}
