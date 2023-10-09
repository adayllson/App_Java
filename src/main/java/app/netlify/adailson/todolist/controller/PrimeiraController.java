package app.netlify.adailson.todolist.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraController {
    
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
