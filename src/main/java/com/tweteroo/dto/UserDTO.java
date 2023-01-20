package com.tweteroo.dto;

public record UserDTO(String name, String avatar) {
    @Override
    public String avatar() {
        return avatar;
    }

    @Override
    public String name() {
        return name;
    }
}
