package ru.perm.v.actuatordemo.dtos;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import ru.perm.v.actuatordemo.services.IServiceForFree;

@Configurable(preConstruction = true, autowire = Autowire.BY_TYPE, dependencyCheck = true)
public class DynamicEntity {
    @Autowired
    IServiceForFree serviceForFree;

    public SimpleEntity getSimpleEntity(String val) {
        return new SimpleEntity(serviceForFree.getVal(val));
    }
}
