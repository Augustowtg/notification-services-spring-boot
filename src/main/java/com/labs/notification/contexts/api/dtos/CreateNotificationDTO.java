package com.labs.notification.contexts.api.dtos;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;

public class CreateNotificationDTO {

	@NotBlank
	@Length(min = 5, max = 240)
	private String content;
	
	@NotBlank
	private String recipientId;
	
	@NotBlank
	
	private String category;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
