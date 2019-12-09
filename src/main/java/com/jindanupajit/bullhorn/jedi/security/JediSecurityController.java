package com.jindanupajit.bullhorn.jedi.security;

import com.jindanupajit.bullhorn.jedi.Jedi;
import com.jindanupajit.bullhorn.jedi.JediModelAttributes;
import com.jindanupajit.bullhorn.jedi.security.model.Login;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.ActionType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class JediSecurityController {

    @GetMapping()
    public String login(Model model) {

        JediModelAttributes jediModelAttributes = new JediModelAttributes(200,
                /**
                 *  The Jedi (Just Enough Data and Information) make sure that no password hash going out
                 *  The @DataLossPrevention diode mode on password is WRITE (only)
                 */
                Jedi.readFrom(new Login()),
                ActionType.LOGIN);
       return jediModelAttributes.view(model, "jedi/login");
    }
}
