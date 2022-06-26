package com.learn.springBootBasics.dao;

import com.learn.springBootBasics.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Integer> {
}
