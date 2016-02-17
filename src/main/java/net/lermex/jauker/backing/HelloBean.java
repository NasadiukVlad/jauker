package net.lermex.jauker.backing;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.faces.context.ExternalContext;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Vlad on 08.02.2016.
 */
@Named
@SessionScoped
@Getter
@Setter
public class HelloBean implements Serializable {
    private String testString = "Hello world";
    private String pressButton = "Button";

    ExternalContext externalContext;

    public String spellCheck() {
        if (testString.equals("дурак")) {
            return "badWord?faces-redirect=true";
         //   externalContext.redirect("badWord");
        }
        return testString;
    }
}
