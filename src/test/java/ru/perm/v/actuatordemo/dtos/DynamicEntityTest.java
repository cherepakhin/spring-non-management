package ru.perm.v.actuatordemo.dtos;

import org.junit.Test;
import ru.perm.v.actuatordemo.services.IServiceForFree;

import static org.junit.Assert.*;

public class DynamicEntityTest {

    class MockSerice implements IServiceForFree {

        @Override
        public String getVal(String input) {
            return "test "+input;
        }
    }
    @Test
    public void getSimpleEntity() {
        DynamicEntity dynamicEntity = new DynamicEntity();
        dynamicEntity.serviceForFree=new MockSerice();
        assertEquals("test TEST", dynamicEntity.getSimpleEntity("TEST").getName());
    }
}