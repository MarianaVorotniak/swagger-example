package com.springboot.swaggerexample.controllers;

import com.springboot.swaggerexample.models.Parent;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/parents")
@Api(value = "Parents Endpoints", description = "Shows parents Endpoints")
public class Parents {

    private List<Parent> listOfParents = new ArrayList<Parent>();

    public void addParent (Parent p) {
        boolean result = listOfParents.add(p);
    }

    @GetMapping
    public List<Parent> getParents() {
        addParent(new Parent("parent1", "1", "parent1@gmail.com", "Parent1", "ParentParent1"));
        addParent(new Parent("parent2", "2", "parent2@gmail.com", "Parent2", "ParentParent2"));
        return listOfParents;
    }

    @GetMapping("/{login}")
    public Parent getParent(@PathVariable("login") final String login)
    {
        for (Parent p : listOfParents)
        {
            if (p.getLogin().equals(login))
                return p;
        }
        return null;
    }

    @PostMapping
    public Parent postParent()
    {
        return null;
    }

    @PutMapping("/{login}")
    public Parent putParent(@PathVariable("login") final String login)
    {
        return null;
    }

}
