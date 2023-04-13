package edu.eci.cvds;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.stereotype.Component;
import java.util.*;
import antlr.collections.List;

@Component
@ManagedBean(name = "userBean")
@ApplicationScoped
public class UsersBean {

    private String user;
    private String password;
    
    public UsersBean() {
    }

    public String getName() {
        return user;
    }

    public void setName(String Nombre) {
        this.user = Nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void begin() {

    }

}

