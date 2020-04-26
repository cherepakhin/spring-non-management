package ru.perm.v.actuatordemo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.perm.v.actuatordemo.dtos.DynamicEntity;
import ru.perm.v.actuatordemo.dtos.SimpleEntity;
import ru.perm.v.actuatordemo.services.IServiceForFree;

@RestController
@RequestMapping("/test")
public class EchoCtrl {
    private static final Logger LOG= LoggerFactory.getLogger(EchoCtrl.class);

    @Autowired
    IServiceForFree serviceForFree;

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
        DynamicEntity dynamicEntity = new DynamicEntity();
        return dynamicEntity.getSimpleEntity(name);
    }

    @GetMapping(value = "spring")
    public String getSpringBean(@RequestParam(required = false) String name) {
        return serviceForFree.getVal(name);
    }
}
