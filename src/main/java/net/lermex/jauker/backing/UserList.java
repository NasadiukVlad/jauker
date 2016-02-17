package net.lermex.jauker.backing;

import net.lermex.jauker.entity.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 * Created by Vlad on 15.02.2016.
 */
@Named(value = "users")
@ApplicationScoped
public class UserList implements Serializable {

    @Inject
    Registration registration;

    private  List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
