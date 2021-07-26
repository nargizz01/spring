package kz.iitu.hotelSystem.controller;

import kz.iitu.hotelSystem.entity.rooms.Room;
import kz.iitu.hotelSystem.entity.users.User;
import kz.iitu.hotelSystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class Admin {
    @Autowired
    private UserService userService;
    @Autowired
    private RoomService roomService;
    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public void createUser(@RequestBody User user) {
        System.out.println("UserController.createUser");
        System.out.println("user = " + user);

        userService.createUser(user);
    }


    @GetMapping("/create")
    public void createUserByUsernameAndPassword(String username,
                                                String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.createUser(user);
    }

    @ResponseBody
    @GetMapping("/userslist")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/allUsersList")
    public String allUsersList(Model model){
        model.addAttribute("users",getAllUsers());
        return "userList";
    }

    @GetMapping("delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PostMapping("/updateRoom")
    public void updateRoom(@RequestBody Room room) {
        roomService.updateRoom(room);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id,
                           @RequestBody User user) {

        System.out.println("UserController.updateUser");
        System.out.println("id = " + id);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("authentication.getName() = " + authentication.getName());

        userService.updateUser(id, user);
    }

    @GetMapping("/deleteRoom/{id}")
    public void deleteRoom(@PathVariable Long id){
        roomService.deleteRoom(id);
    }

    @PostMapping("/addRoom")
    public void addRoom(@RequestBody Room room) {
        roomService.addRoom(room);
    }




}
