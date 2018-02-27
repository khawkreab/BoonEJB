package entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;
 
@Entity
public class PostPicture implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long PostPictureId;
 
    private List<MultipartFile> PostPictureFile;
 
    public List<MultipartFile> getFiles() {
        return PostPictureFile;
    }
 
    public void setFiles(List<MultipartFile> files) {
        this.PostPictureFile = files;
    }

	public long getPostPictureId() {
		return PostPictureId;
	}

	public void setPostPictureId(long postPictureId) {
		PostPictureId = postPictureId;
	}

	public List<MultipartFile> getPostPictureFile() {
		return PostPictureFile;
	}

	public void setPostPictureFile(List<MultipartFile> postPictureFile) {
		PostPictureFile = postPictureFile;
	}
}