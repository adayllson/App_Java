package app.netlify.adailson.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

//Notação lombok para inserir os getter e setters
@Data
@Entity(name = "tb_users")
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    //Notação do spring data que define que a coluna no banco tenha um valor único
    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    //Atributo que grava o exato momento em que o dado foi criado no banco
    @CreationTimestamp
    private LocalDateTime createdAt;

    
}

