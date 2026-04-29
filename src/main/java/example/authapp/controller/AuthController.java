package example.authapp.controller;


import example.authapp.dto.UserDTO;
import example.authapp.request.LoginRequest;
import example.authapp.request.SignupRequest;
import example.authapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private  final UserService userService;


    @PostMapping("/signup")
     public UserDTO signup(@RequestBody SignupRequest request){
        return userService.signup(request);
    }
   /* @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) throws  Exception{
        return userService.login(request);
    }*/
   @GetMapping("/login")
   public String login(@RequestParam String email,
                       @RequestParam String password) throws Exception {
       return userService.login(new LoginRequest(email, password));
   }
    @GetMapping("/users")
    public List<UserDTO> users(){
        return userService.getAllUsers();
    }

}
