package dio.theodoro.web.api.controller;

import dio.theodoro.web.api.model.User;
import dio.theodoro.web.api.repository.UserRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users") // diz para Request Controller que o prefix sempre vai começar com user
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User>getUser(){
       return  userRepository.findAll();
    }
    //Criando rotas com parâmetros
    @GetMapping("/{username}")
    public User getOne(@PathVariable String username){
        return userRepository.findByUserName(username);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        userRepository.deleteById(id);
    }

    //aqui é um método post aonde que o spring vai pegar o json e tentar converter para
    //objeto que foi selecionado, nesse caso o user
    @PostMapping()
    public void postUser(@RequestBody User user){
        userRepository.save(user);
    }
    @PutMapping
    public  void  putUser(@RequestBody User user){
        userRepository.save(user);
    }
}
