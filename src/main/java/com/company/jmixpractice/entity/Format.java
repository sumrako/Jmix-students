package com.company.jmixpractice.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum Format implements EnumClass<String> {

    ONLINE("ON"),
    OFFLINE("OFF");

    private String id;

    Format(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Format fromId(String id) {
        for (Format at : Format.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}