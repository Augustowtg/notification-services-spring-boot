package com.labs.notification.contexts.database.mappers;

import java.util.Date;
import java.util.UUID;

import com.labs.notification.contexts.database.entities.JpaNotification;
import com.labs.notification.domain.entities.Notification;

public class JpaNotificationMapper {

	public static JpaNotification toJpa(Notification notification) {
		JpaNotification rawNotification = new JpaNotification();
		
		rawNotification.setId(notification.getId());
		rawNotification.setContent(notification.getContent());
		rawNotification.setCategory(notification.getCategory());
		rawNotification.setReadAt(notification.getReadAt());
		rawNotification.setCanceledAt(notification.getCanceledAt());
		rawNotification.setCreatedAt(notification.getCreatedAt());
		
		return rawNotification;
	}; 
	
	public static Notification toDomain(JpaNotification rawNotification) {
		Notification notification = new Notification(
				rawNotification.getId(),
				rawNotification.getRecipientId(),
				rawNotification.getContent(),
				rawNotification.getCategory(),
				rawNotification.getReadAt(),
				rawNotification.getCanceledAt(),
				rawNotification.getCreatedAt()
				);
		return notification;
	}; 
	
}
