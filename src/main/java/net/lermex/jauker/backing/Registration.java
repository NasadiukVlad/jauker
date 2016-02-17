package net.lermex.jauker.backing;

import net.lermex.jauker.entity.User;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 * Created by Vlad on 15.02.2016.
 */
@Named(value = "registration")
//@ManagedBean(name = "registration", eager = true)
@ApplicationScoped
public class Registration implements Serializable {

    private String username = "";
    private String password = "";

  //  @ManagedProperty(value="#{users}")
 //   private UserList userListBean;

    private List<User> users = new ArrayList<>();


    public void registrate() {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        users.add(user);

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

  /*  public UserList getUserListBean() {
        return userListBean;
    }

    public void setUserListBean(UserList userListBean) {
        this.userListBean = userListBean;
    }*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
