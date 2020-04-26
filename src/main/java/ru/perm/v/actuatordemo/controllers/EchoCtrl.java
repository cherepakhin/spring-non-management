package ru.perm.v.actuatordemo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.perm.v.actuatordemo.dtos.DynamicEntity;
import ru.perm.v.actuatordemo.dtos.SimpleEntity;

@RestController
@RequestMapping("/test")
public class EchoCtrl {
    private static final Logger LOG= LoggerFactory.getLogger(EchoCtrl.class);
    @GetMapping(value = "echo")
    public SimpleEntity get(@RequestParam(required = false) String name) {
        return new SimpleEntity(name);
    }

    @PostMapping(value = "save", produces = MediaType.APPLICATION_JSON_VALUE)
    public SimpleEntity save(@RequestBody SimpleEntity dtoIn) {
        return new SimpleEntity(dtoIn.getName());
    }

    @GetMapping(value = "dynamic")
    public SimpleEntity getDynamic(@RequestParam(required = false) String name) {
        DynamicEntity serviceEntity = new DynamicEntity();
        return serviceEntity.getSimpleEntity(name);
    }
}
