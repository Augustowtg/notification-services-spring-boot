package com.labs.notification.contexts.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labs.notification.contexts.api.dtos.CreateNotificationDTO;
import com.labs.notification.contexts.database.repositories.JpaNotificationRepository;
import com.labs.notification.domain.repositories.NotificationRepository;
import com.labs.notification.domain.service.sendnotification.ResponseSendNotification;
import com.labs.notification.domain.service.sendnotification.SendNotification;

@RestController
@RequestMapping("/notifications")
public class NotificationsController {
	
	
	private NotificationRepository databaseRepository = new JpaNotificationRepository();
	
	private SendNotification sendNotification = new SendNotification(databaseRepository);; 
	
	@PostMapping()
	public ResponseEntity<?> send(@RequestBody CreateNotificationDTO body) {
		
		ResponseSendNotification notification = sendNotification.execute(body);;

		return new ResponseEntity<ResponseSendNotification>(notification, HttpStatus.CREATED);
	}
	
	
}
