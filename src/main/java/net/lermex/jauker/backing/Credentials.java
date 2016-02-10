package net.lermex.jauker.backing;

import lombok.Getter;
import lombok.Setter;
import javax.enterprise.inject.Model;

@Model
@Getter
@Setter
public class Credentials {
    private String username;
    private String password;
}
