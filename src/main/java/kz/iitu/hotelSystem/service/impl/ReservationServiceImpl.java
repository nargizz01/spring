package kz.iitu.hotelSystem.service.impl;

import kz.iitu.hotelSystem.entity.reservation.Reservation;
import kz.iitu.hotelSystem.entity.rooms.Room;
import kz.iitu.hotelSystem.entity.users.User;
import kz.iitu.hotelSystem.repositories.*;
import kz.iitu.hotelSystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public String makePayment(Room room, User user) {
        Reservation reservation = null;
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate= DateFor.format(date);
        reservation.setDateIssue(stringDate);
        reservation.setRoom(room);
        reservation.setUser(user);
        reservationRepository.saveAndFlush(reservation);
        return reservation.toString();
    }
}
