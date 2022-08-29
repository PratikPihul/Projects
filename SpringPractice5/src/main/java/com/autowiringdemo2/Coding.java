package com.autowiringdemo2;

import javax.security.auth.callback.LanguageCallback;

public class Coding {
    private Language language;

    public Coding() {
    }

    public Coding(Language language) {
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Coding{" +
                "language=" + language +
                '}';
    }
}
