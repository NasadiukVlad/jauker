package net.lermex.jauker.backing;

import net.lermex.jauker.annotation.LoggedIn;
import net.lermex.jauker.entity.User;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Optional;

@Named
@SessionScoped
public class AuthSession implements Serializable {

    private Optional<User> user;

    @Produces
    @LoggedIn
    public Optional<User> getCurrentUser() {
        return user;
    }
}
