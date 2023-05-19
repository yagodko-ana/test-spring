package org.example;

import org.springframework.stereotype.Component;

// убрали на время чтобы не было неоднозначности
//@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hun Rhapsody";
    }
}
