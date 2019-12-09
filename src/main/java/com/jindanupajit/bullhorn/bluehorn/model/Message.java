package com.jindanupajit.bullhorn.bluehorn.model;

import com.jindanupajit.bullhorn.bluehorn.repository.MessageRepository;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.ActionMapping;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.ActionType;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.MapRepository;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.UserInput;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@MapRepository(MessageRepository.class)
@ActionMapping(entity = Message.class, action = ActionType.LIST, method = RequestMethod.GET, url = "/message/retrieve")
@ActionMapping(entity = Message.class, action = ActionType.PERSIST, method = RequestMethod.GET, url = "/message/create")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne (
            fetch = FetchType.EAGER,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}
    )
    @JoinColumn(name = "people_id")
    private People people;

    @Lob
    @UserInput(ordinal = 100, label = "Message")
    private String content;

    @UserInput(ignored = true, label = "")
    private LocalDateTime localDateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
