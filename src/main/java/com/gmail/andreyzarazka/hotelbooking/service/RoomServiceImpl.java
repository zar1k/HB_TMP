package com.gmail.andreyzarazka.hotelbooking.service;

import com.gmail.andreyzarazka.hotelbooking.domain.Category;
import com.gmail.andreyzarazka.hotelbooking.domain.Room;
import com.gmail.andreyzarazka.hotelbooking.domain.Status;
import com.gmail.andreyzarazka.hotelbooking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    private RoomRepository repository;

    @Autowired
    public RoomServiceImpl(final RoomRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Room> getAll() {
        return (List<Room>) this.repository.findAll();
    }

    @Override
    public List<Room> getByCategory(Category category) {
        return this.repository.findByCategory(category);
    }

    @Override
    public List<Room> getByStatus(Status status) {
        return this.repository.findByStatus(status);
    }
}