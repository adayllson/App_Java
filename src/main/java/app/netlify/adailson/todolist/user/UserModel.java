package app.netlify.adailson.todolist.user;

import lombok.Data;

//Notação lombok para inserir os getter e setters
@Data
public class UserModel {
    
    private String username;
    private String name;
    private String password;

    
}

