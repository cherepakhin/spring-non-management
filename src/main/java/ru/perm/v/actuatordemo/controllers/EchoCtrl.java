package ru.perm.v.actuatordemo.controllers;

import org.springframework.web.bind.annotation.*;
import ru.perm.v.actuatordemo.dtos.DynamicEntity;
import ru.perm.v.actuatordemo.dtos.SimpleEntity;

@RestController
@RequestMapping("/test")
public class EchoCtrl {

    @GetMapping(value = "echo")
    public SimpleEntity get(@RequestParam(required = false) String name) {
        return new SimpleEntity(name);
    }

    @GetMapping(value = "dynamic")
    public SimpleEntity getDynamic(@RequestParam(required = false) String name) {
        DynamicEntity serviceEntity = new DynamicEntity();
        return serviceEntity.getSimpleEntity(name);
    }
}
