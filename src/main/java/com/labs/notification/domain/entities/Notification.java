package com.labs.notification.domain.entities;

import java.util.Date;
import java.util.UUID;

public class Notification {

	private UUID id;
	private String recipientId;
	private Content content;
	private String category;
	private Date readAt;
	private Date canceledAt;
	private Date createdAt;

	// 
	public Notification(String recipientId, String content, String category) {
		setId(UUID.randomUUID());
		setRecipientId(recipientId);
		setCategory(category);
		setContent(content);
		setCreatedAt(new Date());
	}
	
	public Notification(UUID id, String recipientId, String content, String category, Date readAt, Date canceledAt, Date createdAt) {
		setId(id);
		setRecipientId(recipientId);
		setContent(content);
		setCategory(category);
		setCanceledAt(canceledAt);
		setReadAt(readAt);
		setCreatedAt(createdAt);
	}
	

	private void setId(UUID id) {
		this.id = id;
	}

	public UUID getId() {
		return id;
	}

	public String getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	public String getContent() {
		return content.getContet();
	}

	public void setContent(String content) {
		this.content = new Content(content);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getReadAt() {
		if(readAt == null) {
			return null;
		}
		return readAt;
	}

	public void setReadAt(Date readAt) {
		if(readAt == null ) {
		} else {
			this.readAt = readAt;
		}
	}

	public Date getCanceledAt() {
		if(canceledAt == null) {
			return null;
		}
		return canceledAt;
	}

	public void setCanceledAt(Date canceledAt) {
		if(canceledAt == null ) {
		} else {
			this.canceledAt = canceledAt;
		}
		
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
