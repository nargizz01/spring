package kz.iitu.hotelSystem.controller;

import kz.iitu.hotelSystem.entity.rooms.Room;
import kz.iitu.hotelSystem.service.ReservationService;
import kz.iitu.hotelSystem.service.RoomService;
import kz.iitu.hotelSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoomService roomService;
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/getRoom")
    public String getRoom(@RequestParam String rid, Model model) {
        Long id = Long.parseLong(rid);
        Room room = roomService.findById(id);
        model.addAttribute("Room", room);
        return "roomDetail";
    }

    @GetMapping("/availableRooms")
    public List<Room> availableRooms() {
        return roomService.showAvailableRooms();
    }

    @GetMapping("/allRooms")
    public String allRooms(Model model){
        model.addAttribute("ph",availableRooms());
        return "rooms";
    }


}
