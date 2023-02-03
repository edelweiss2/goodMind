package com.example.demo.entity;

import java.time.LocalDateTime;

public class DiaryBoard {
	private int did;
	private String uid;
	private String title;
	private String content;
	private LocalDateTime modTime;
	private int isDeleted;
	private String files;
	private String uname;
	
	public DiaryBoard() {}  //게시글 생성시 필요한 생성자 
	public DiaryBoard(String uid, String title, String content, String files) {
		super();
		this.uid = uid;
		this.title = title;
		this.content = content;
		this.files = files;
	}
	//==2/3a== 추가함
	public DiaryBoard(int did, String title, String content, String files) {
		super();
		this.did = did;
		this.title = title;
		this.content = content;
		this.files = files;
	}
	
		// constructor -> toString -> getters&setters 순서로  ===2/1=====
	public DiaryBoard(int did, String uid, String title, String content, LocalDateTime modTime, int isDeleted,
			String files, String uname) {
		super();
		this.did = did;
		this.uid = uid;
		this.title = title;
		this.content = content;
		this.modTime = modTime;
		this.isDeleted = isDeleted;
		this.files = files;
		this.uname = uname;
	}
	
	@Override 
	public String toString() {
		return "DiaryBoard [did=" + did + ", uid=" + uid + ", title=" + title + ", content=" + content + ", modTime="
				+ modTime + ", isDeleted=" + isDeleted + ", files=" + files + ", uname=" + uname + "]";
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getModTime() {
		return modTime;
	}

	public void setModTime(LocalDateTime modTime) {
		this.modTime = modTime;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getFiles() {
		return files;
	}

	public void setFiles(String files) {
		this.files = files;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
}
