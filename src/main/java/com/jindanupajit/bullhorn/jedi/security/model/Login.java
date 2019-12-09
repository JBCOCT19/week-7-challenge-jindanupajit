package com.jindanupajit.bullhorn.jedi.security.model;

import com.jindanupajit.bullhorn.jedi.security.DataLossPrevention.DataLossPrevention;
import com.jindanupajit.bullhorn.jedi.security.DataLossPrevention.DiodeMode;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.ActionMapping;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.ActionType;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.UserInput;
import org.springframework.web.bind.annotation.RequestMethod;

@ActionMapping(entity=Login.class, action = ActionType.LOGIN, method = RequestMethod.POST, url ="/login", label ="Login")
public class Login {

    @UserInput( ordinal = 100, label = "Email", placeHolder = "user@example.com")
    private String username;

    @UserInput( ordinal = 200, label = "Password", placeHolder = "password", secret = true)
    @DataLossPrevention(diode = DiodeMode.WRITE)
    private String password;

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
}
