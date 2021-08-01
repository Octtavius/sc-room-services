package com.wh.controllers;

import com.wh.data.Room;
import com.wh.repositories.RoomRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    private final RoomRepository repository;

    public RoomController(RoomRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Room> getAllRooms() {
        return this.repository.findAll();
    }
    @GetMapping("/{id}")
    public Room getById(@PathVariable("id") long id) {
        return repository.findById(id).get();
    }
}
