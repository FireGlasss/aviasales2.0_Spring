package net.proselyte.aviasales2._S.controller;


import net.proselyte.aviasales2._S.model.User;
import net.proselyte.aviasales2._S.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/users")
//    public String findAll(Model model) {
//        List<User> users = userService.findAll();
//        model.addAttribute("users", users);
//        return "user-list";
//    }
//    @GetMapping("/user-create")
//    public String createUserFrom (User user) {
//        return "user-create";
//    }
//    @PostMapping("/user-create")
//    public String createUser(User user){
//        userService.saveUser(user);
//        return "redirect:/users";
//    }


    @GetMapping("/signUp-user")
    public String sighUpFrom (User user) {
        System.out.println("-------------------------------------------------");
        return "signUp";
    }
    @PostMapping("/signUp-user")
    public String sighUpUser(User user){
        userService.isUserInSystem(user);
        userService.checkPassword(user);
        userService.saveUser(user);
        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        return "redirect:/login-user";
    }
    @GetMapping("/login-user")
    public String loginCheck (User user) {
        System.out.println("asdasdadasd");
        return "login-user";
    }
    @PostMapping("/login-user")
    public String loginUser(User user){
        System.out.println("1111111111111111111111111111111");
        System.out.println(userService.login(user));
        return "redirect:/";
    }
    @GetMapping("/main")
    public String goMain (User user) {
        System.out.println("0000000000");
        return "index";
    }
}
