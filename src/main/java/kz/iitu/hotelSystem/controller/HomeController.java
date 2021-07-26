package kz.iitu.hotelSystem.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping(value = { "/","/index" }, method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = { "/newUser" }, method = RequestMethod.GET)
    public String register(Model model){
        return "newUser";
    }

    @RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
    public String logoutPage(HttpServletRequest request, HttpServletResponse response){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
            HttpSession session = request.getSession();
            session.getAttribute("user");
            session.invalidate();
        }
        return "redirect:/";
    }



}
