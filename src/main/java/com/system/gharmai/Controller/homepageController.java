package com.system.gharmai.Controller;

import com.system.gharmai.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class homepageController {
    private final UserService userService;

    @GetMapping("/index")
    public String getIndex(){return "index";}


//    @GetMapping("/dashboard")
//    public  String getDashboard(Model model){
////        Optional<User> user = userService.getCurrentUser();
////        model.addAttribute("profileName", user.get().getName());
//        return "profile";
//    }
//    @GetMapping("/login")
//    public String showLoginPage() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication == null || authentication instanceof AnonymousAuthenticationToken) {
//            return "/login";
//        }
//        return "redirect:/index";
//    }
//    @PostMapping("/logout")
//    public String logout(Authentication authentication) {
//        if (authentication.isAuthenticated()) {
//            SecurityContextHolder.clearContext();
//        }
//        return "/index";
//    }
}
