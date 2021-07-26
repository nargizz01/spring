package kz.iitu.hotelSystem.service.impl;

import kz.iitu.hotelSystem.entity.rooms.Room;
import kz.iitu.hotelSystem.repositories.*;
import kz.iitu.hotelSystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public void deleteRoom(Long id) {
        Room room = roomRepository.findById(id).get();
        roomRepository.delete(room);
    }

    @Override
    public void addRoom(Room room) {
        roomRepository.saveAndFlush(room);
    }

    @Override
    public Room findById(Long id) {
        Room room = roomRepository.findById(id).get();
        return room;
    }

    @Override
    public void updateRoom(Room room) {
        roomRepository.saveAndFlush(room);
    }

    @Override
    public String makeNotAvailable(Long id) {
        Room room = roomRepository.findById(id).get();
        if (room.isAvailable()) {
            room.setAvailable(false);
        } else {
            room.setAvailable(true);
        }
        return null;
    }

    @Override
    public List<Room> showAvailableRooms() {
        return roomRepository.findAll();
    }
}
