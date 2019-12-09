package com.jindanupajit.bullhorn.jedi;


import com.jindanupajit.bullhorn.bluehorn.model.Message;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.ActionType;
import com.jindanupajit.bullhorn.jedi.util.thymeleaf.Info;
import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Optional;


public interface SCrudController<REPOSITORY extends CrudRepository, ENTITY> {

    REPOSITORY getRepository();

    ENTITY newEntity();

    @ModelAttribute
    default void init() {

    }

    @GetMapping("/search")
    default String search(Model model, @RequestParam  Optional<String> jediEntity) {


        return "auto/entrypoint";
    }

    @GetMapping("/create")
    default String create(Model model) {
        JediModelAttributes modelAttributes = new JediModelAttributes(200, Jedi.readFrom(newEntity()), ActionType.PERSIST);

        return modelAttributes.view(model);
    }

    @GetMapping("/retrieve")
    default String retrieve(Model model, @RequestParam Optional<Long> jediId,  @RequestParam  Optional<ActionType> jediActionType) {
        JediModelAttributes jediModelAttributes = new JediModelAttributes(HttpURLConnection.HTTP_OK);
        ActionType action = jediActionType.orElse(ActionType.VIEW);
        long id = jediId.orElse(0L);

        if (action == ActionType.LIST) {
            ArrayList<Message> ml = new ArrayList<>();
            Message m1 = new Message();
            m1.setContent("Test1");
            Message m2 = new Message();
            m2.setContent("Test2");
            ml.add(m1);
            ml.add(m2);
            jediModelAttributes.setCode(HttpURLConnection.HTTP_OK);
            jediModelAttributes.setEntity(ml);
            jediModelAttributes.setMeta( (new Info()).typeOf(newEntity()));
            jediModelAttributes.setAction(action);
            return jediModelAttributes.view(model);
        }

        @SuppressWarnings("unchecked")
        Optional<ENTITY> entity = getRepository().findById(id);

        if (!entity.isPresent()) {
            model.addAttribute("jediResponse", HttpURLConnection.HTTP_NOT_FOUND);
            model.addAttribute("jediEntity", Jedi.readFrom(newEntity()));
        } else {
            model.addAttribute("jediResponse", HttpURLConnection.HTTP_OK);
            model.addAttribute("jediEntity", Jedi.readFrom(entity.get()));
        }
        return "auto/entrypoint";
    }

    @GetMapping("/update")
    default String update(Model model, @ModelAttribute ENTITY jediEntityForm) {

        Jedi<ENTITY> jedi = Jedi.asJedi(jediEntityForm);


        Object id = jedi.getId();
        Optional data;
        if (id != null) {

            data = getRepository().findById(id);
        }else {
            model.addAttribute("jediResponse", 404);
            model.addAttribute("jediEntity", Jedi.readFrom(newEntity()));
            return "auto/entrypoint";
        }

        if (!data.isPresent()) {
            model.addAttribute("jediResponse", 404);
            model.addAttribute("jediEntity", Jedi.readFrom(newEntity()));
            return "auto/entrypoint";
        } else {
            model.addAttribute("jediResponse", 200);
            model.addAttribute("jediEntity", Jedi.readFrom(data.get()));
        }
        return "auto/entrypoint";
    }

    @GetMapping("/delete")
    default String delete() {
        return "auto/entrypoint";
    }
}
