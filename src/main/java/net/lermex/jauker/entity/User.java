package net.lermex.jauker.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    @NotNull
    @Length(min=3, max=25)
    @Id
    @Getter
    @Setter
    private String username;

    @NotNull
    @Length(min=6, max=40)
    @Setter
    private String password;

}
