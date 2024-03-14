package com.model;



import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;




@Entity
public class serviceImage {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String serviceCodeFile;
	private String fileType;
	private String fileName;
	@Lob
	private byte[] image;
	//@Lob
	//private byte[] imageIcon;
	private LocalDateTime imageDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServiceCodeFile() {
		return serviceCodeFile;
	}
	public void setServiceCodeFile(String serviceCodeFile) {
		this.serviceCodeFile = serviceCodeFile;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public LocalDateTime getImageDate() {
		return imageDate;
	}
	public void setImageDate(LocalDateTime imageDate) {
		this.imageDate = imageDate;
	}


}
