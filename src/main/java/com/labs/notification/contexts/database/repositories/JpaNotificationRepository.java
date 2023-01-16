package com.labs.notification.contexts.database.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labs.notification.contexts.database.entities.JpaNotification;
import com.labs.notification.contexts.database.mappers.JpaNotificationMapper;
import com.labs.notification.domain.entities.Notification;
import com.labs.notification.domain.repositories.NotificationRepository;

@Service
public class JpaNotificationRepository extends NotificationRepository {


	@Autowired
	private QuerysNotification jpa;
	
	@Override
	public void create(Notification notification) {
		JpaNotification rawNotification = JpaNotificationMapper.toJpa(notification);
		jpa.save(rawNotification);
	}

	@Override
	public Notification findById(UUID notificaitonId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Notification notificaiton) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer countManyByRecipientId(String recipientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notification> findManyByRecipient(String recipientId) {
		// TODO Auto-generated method stub
		return null;
	}

}
