package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.User;
import kr.hs.dgsw.board_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUsers")
    public List getAllUsers(){
        return this.userService.findAll();
    }
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id){
        return this.userService.findById(id);
    }
    @PostMapping("/addUser")
    public Long addUser(@RequestBody User user){
        return this.userService.add(user);
    }
    @PutMapping("/modifyUser")
    public int modifyUser(@RequestBody User user){
        return this.userService.modify(user);
    }
    @DeleteMapping("/deleteUser/{id}")
    public int deleteUser(@PathVariable Long id){
        return this.userService.deleteById(id);
    }

}
