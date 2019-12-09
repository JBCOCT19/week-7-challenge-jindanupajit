package com.jindanupajit.bullhorn.bluehorn.model;

import com.jindanupajit.bullhorn.jedi.security.DataLossPrevention.DataLossPrevention;
import com.jindanupajit.bullhorn.jedi.security.DataLossPrevention.DiodeMode;
import com.jindanupajit.bullhorn.jedi.security.model.UserDetail;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.UserInput;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.ZoneId;
import java.util.Collection;
import java.util.List;

@Entity
public class People extends UserDetail  {

    // Id in parent class

    private String name;


    @OneToMany (
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE},
            mappedBy = "people"
    )
    @OrderBy("localDateTime desc")
    private List<Message> messageList;

    @UserInput(label = "Time Zone", ignored = true)
    @DataLossPrevention(diode = DiodeMode.DENY_ALL)
    private ZoneId zoneId = null;

    @Transient
    @UserInput(label = "Time Zone", ignored = true)
    @DataLossPrevention(diode = DiodeMode.DENY_ALL)
    private String zoneString = "";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
}
