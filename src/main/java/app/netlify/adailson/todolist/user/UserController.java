package app.netlify.adailson.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Notação que define a rota
@RequestMapping("/users")
public class UserController {

    /*
     * Body
     */
    //Método de acesso HTTP que adiciona dados/informação
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.name);
    }
    
}
