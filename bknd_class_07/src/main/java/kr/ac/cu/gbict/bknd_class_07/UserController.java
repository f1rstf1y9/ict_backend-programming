package kr.ac.cu.gbict.bknd_class_07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  
  @Autowired
  private UserService service;

  @PostMapping("/user")
  public int create(@RequestBody User user) {
    return service.create(user);
  }

  @GetMapping("/user")
  public List<User> readAll() {
    return service.readAll();
  }

  @GetMapping("/user/{id}")
  public User readOne(@PathVariable("id") Long id) {
    return service.readOne(id);
  }

  @PutMapping("/user/{id}")
  public int update(@PathVariable("id") Long id, @RequestBody User user) {
    return service.update(id, user);
  }

  @DeleteMapping("/user/{id}")
  public int delete(@PathVariable("id") Long id) {
    return service.delete(id);
  }
}
