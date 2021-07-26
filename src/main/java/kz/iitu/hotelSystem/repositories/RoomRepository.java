package kz.iitu.hotelSystem.repositories;

import kz.iitu.hotelSystem.entity.rooms.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
