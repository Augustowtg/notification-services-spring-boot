package com.labs.notification.domain.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.labs.notification.domain.entities.Notification;

@Service
public abstract class NotificationRepository {
	public abstract void create(Notification notification);
	public abstract Notification findById(UUID notificaitonId);
	public abstract void save(Notification notificaiton);
	public abstract Integer countManyByRecipientId(String recipientId);
	public abstract List<Notification> findManyByRecipient(String recipientId);
}
