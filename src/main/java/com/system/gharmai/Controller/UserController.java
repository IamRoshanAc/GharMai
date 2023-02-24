package com.system.gharmai.Controller;

import com.system.gharmai.Pojo.UserPojo;
import com.system.gharmai.Service.UserService;
import com.system.gharmai.entity.User;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("index")
    public String getIndex(){return "index";}

    @GetMapping("/about")
    public String getAbout(Model model, Principal principal) {
        model.addAttribute("userdata", userService.findByEmail(principal.getName()));
        return "about";
    }


    @GetMapping("/home")
    public String getHome(Model model, Principal principal) {
        model.addAttribute("userdata", userService.findByEmail(principal.getName()));
        return "home";
    }

    @GetMapping("/menu")

    public String getMenu(Model model, Principal principal) {
        model.addAttribute("userdata", userService.findByEmail(principal.getName()));
        return "menu";
    }

    @GetMapping("/order")
    public String getOrder(Model model, Principal principal) {
        model.addAttribute("userdata", userService.findByEmail(principal.getName()));
        return "order";
    }
    @GetMapping("/vieworder")
    public String getViewOrder(Model model, Principal principal) {
        model.addAttribute("userdata", userService.findByEmail(principal.getName()));
        return "viewOrder";
    }

    @GetMapping("/users")
    public String getUsers(Model model, Principal principal) {
        model.addAttribute("userdata", userService.findByEmail(principal.getName()));
        return "users";
    }
    @GetMapping("/orders")
    public String getOrders(Model model, Principal principal) {
        model.addAttribute("userdata", userService.findByEmail(principal.getName()));
        return "orders";
    }

    @GetMapping("/feedbacks")
    public String getFeedbacks(Model model, Principal principal) {
        model.addAttribute("userdata", userService.findByEmail(principal.getName()));
        return "feedbacks";
    }
    @GetMapping("/contact")
    public String getContact(Model model, Principal principal) {
        model.addAttribute("userdata", userService.findByEmail(principal.getName()));
        return "contact";
    }



    @GetMapping("/success")
    public String success(Model model, Principal principal){
        model.addAttribute("userdata",userService.findByEmail(principal.getName()));
        return "home";
    }
    @GetMapping("/create")
    public String createUser(Model model){
        model.addAttribute("user",new UserPojo());

        return "signup";
    }

    @PostMapping("/save")
    public String saveUser(@Valid UserPojo userPojo){
        userService.saveUser(userPojo);
        return "redirect:/user/login";
    }

//    @GetMapping("/login")
//    public String login() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication==null||authentication instanceof AnonymousAuthenticationToken){
//            return "login";
//        }
//        return "redirect:user/success";
//    }
    @GetMapping("/profile")
    public String profile() { return "profile";}

    @GetMapping("/profile/{id}")
    public String getUserProfiile(@PathVariable("id") Integer id, Model model ){
        User user = userService.fetchbyId(id);
        model.addAttribute("users", new UserPojo(user));
//        model.addAttribute("user", userServices.findByEmail(principal.getName()));
        model.addAttribute("currentUser", user);
        return "profile";
    }


    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable("id") Integer id, Model model) {
        User user = userService.fetchbyId(id);
        model.addAttribute("currentUser", new UserPojo(user));
        return "redirect:/profile/{id}";
    }

    @GetMapping("/{id}/delete")
    public String deleteProfile(@PathVariable("id") Integer id){
        userService.deleteById(id);
        return "redirect:/logout";
    }
    @PostMapping("/logout")
    public String logout(Authentication authentication) {
        if (authentication.isAuthenticated()) {
            SecurityContextHolder.clearContext();
        }
        return "redirect:/user/login";
    }
//    @GetMapping("/{id}")
//    public String deleteProfile(@PathVariable ("id") Integer id){
//        userService.deleteById(id);
//        return "redirect:/signup";
//    }

//    @DeleteMapping("/delete/{userId}")
//    public User deleteUser(@PathVariable("userId")int userId)
//    {
//        this.userService.deleteUser(userId);
//    }


}




