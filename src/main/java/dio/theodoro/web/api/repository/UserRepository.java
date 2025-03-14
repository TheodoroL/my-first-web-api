package dio.theodoro.web.api.repository;

import dio.theodoro.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
        if(user.getId() == null) System.out.println("Save - recebendo o usuário na camada de repository");
        else System.out.println("Update - recebendo o usuário na camada de repository  ");
        System.out.println(user);
    }
    public void deleteById(Integer id){
        System.out.printf("Delete/id - recebendo o id : %d  para excluir o usuário%n\n",id);
        System.out.println(id);
    }
    public List<User> findAll(){
        System.out.println("Listando os usuário ");
        List<User> lista = new ArrayList<>();
        lista.add(new User("teste123@gmail.com", "senha"));
        lista.add(new User("dioteste.com", "javaTeste123"));
        return  lista;
    }

    public User findByUserName(String username){
        System.out.printf("Find/username - recebendo o username %s para localizar o usuário\n", username);
        return new User("dioteste@gmail.com", "dioJava123");
    }
}
