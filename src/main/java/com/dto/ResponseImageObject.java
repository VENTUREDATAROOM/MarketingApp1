package com.dto;



import java.time.LocalDateTime;




public class ResponseImageObject {
	
	
	private int id;
	private String serviceCodeFile;
	private String fileType;
	private String fileName;
	private String encodeImage;
	//private String encodedImageIcon;
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
	public String getEncodeImage() {
		return encodeImage;
	}
	public void setEncodeImage(String encodeImage) {
		this.encodeImage = encodeImage;
	}
	public LocalDateTime getImageDate() {
		return imageDate;
	}
	public void setImageDate(LocalDateTime imageDate) {
		this.imageDate = imageDate;
	}
	
	
	

	
	
}
