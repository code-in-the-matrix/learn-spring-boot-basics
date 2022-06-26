package com.learn.springBootBasics.controller;

import com.learn.springBootBasics.dao.TicketDao;
import com.learn.springBootBasics.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketDao dao;

    @PostMapping("/bookTickets")
    public String bookTickets(@RequestBody List<Ticket> tickets){
        dao.saveAll(tickets);
        return "Tickets booked: " + tickets.size();
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets(){
        return (List<Ticket>)dao.findAll();
    }
}

