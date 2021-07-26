package kz.iitu.hotelSystem.repositories;

import kz.iitu.hotelSystem.entity.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
