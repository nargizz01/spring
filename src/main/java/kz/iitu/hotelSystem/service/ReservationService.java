package kz.iitu.hotelSystem.service;

import kz.iitu.hotelSystem.entity.rooms.Room;
import kz.iitu.hotelSystem.entity.users.User;

public interface ReservationService {
    String makePayment(Room room, User user);
}
