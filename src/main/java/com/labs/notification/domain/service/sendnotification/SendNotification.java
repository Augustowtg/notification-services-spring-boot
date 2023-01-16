package com.labs.notification.domain.service.sendnotification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labs.notification.contexts.api.dtos.CreateNotificationDTO;
import com.labs.notification.domain.entities.Notification;
import com.labs.notification.domain.repositories.NotificationRepository;

@Service
public class SendNotification {

	@Autowired
	private NotificationRepository notificationRepository;

	public SendNotification(NotificationRepository notificationRepository) {
		this.notificationRepository = notificationRepository;
	}

	public ResponseSendNotification execute(CreateNotificationDTO request) {
		Notification notification = new Notification(request.getRecipientId(), request.getContent(),
				request.getCategory());

		// notificationRepository.create(notification);

		return new ResponseSendNotification(notification);
	}

}
