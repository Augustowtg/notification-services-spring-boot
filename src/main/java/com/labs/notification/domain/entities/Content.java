package com.labs.notification.domain.entities;

public class Content {

	private String content;

	public String getContet() {
		return this.content;
	}

	private boolean validateContentLength(String content) {
		return content.length() >= 5 && content.length() <= 240;
	}

	public Content(String content) {
		Boolean isContentLengthValid = this.validateContentLength(content);

		if (!isContentLengthValid) {
			throw new Error("Content lenth error.");
		}
		this.content = content;
	}
}
