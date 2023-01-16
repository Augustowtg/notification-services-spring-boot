package com.labs.notification.contexts.database.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labs.notification.contexts.database.entities.JpaNotification;


public interface QuerysNotification extends JpaRepository<JpaNotification, UUID> {

}
