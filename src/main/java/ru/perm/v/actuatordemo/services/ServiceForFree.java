package ru.perm.v.actuatordemo.services;

public class ServiceForFree implements IServiceForFree {

    @Override
    public String getVal(String input) {
        return "modified " + input;
    }
}
