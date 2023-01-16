package com.labs.notification.domain.service.sendnotification;

import com.labs.notification.domain.entities.Notification;

public class ResponseSendNotification {

	private Notification notification;
	
	public ResponseSendNotification(Notification notification) {
		setNotification(notification);
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}
	
	
}
