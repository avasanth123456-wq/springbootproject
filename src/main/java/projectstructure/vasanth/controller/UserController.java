package vasanth.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projectstructure.vasanth.entity.UserVasanth;
import projectstructure.vasanth.service.UserServices;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rivi")
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/user")
    public UserVasanth create(@RequestBody UserVasanth user){
        return userServices.createUser(user);
    }
    @GetMapping("/user")
    public List<UserVasanth> getAll(){
        return userServices.getAllUsers();
    }
    @GetMapping("/salary/{amount}")
    public List<UserVasanth> highSalary(@PathVariable double amount){
        return userServices.getHighSalary(amount);
    }
    @GetMapping("/group")
    public Map<String,List<UserVasanth>> group(){
        return userServices.groupByDepartment();
    }
    @GetMapping("/parallel")
    public String parallel(){
        userServices.printParallel();
        return "Check console logs";
    }
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable long id){
        userServices.deleteUser(id);
        return "Deleted";
    }
}
