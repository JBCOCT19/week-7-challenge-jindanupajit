package com.jindanupajit.bullhorn.bluehorn.controller;

import com.jindanupajit.bullhorn.bluehorn.model.Message;
import com.jindanupajit.bullhorn.jedi.JediModelAttributes;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.ActionType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.net.HttpURLConnection;

@Controller
public class MainController {

    @GetMapping("/")
    public String main() {
        JediModelAttributes jediModelAttributes = new JediModelAttributes(HttpURLConnection.HTTP_MOVED_TEMP);
        jediModelAttributes.setCode(HttpURLConnection.HTTP_MOVED_TEMP);
        jediModelAttributes.setAction(ActionType.LIST);
        jediModelAttributes.setEntity(new Message());
        return jediModelAttributes.redirect("/message/retrieve");

    }
}
