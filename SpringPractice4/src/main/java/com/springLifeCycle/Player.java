package com.springLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Player implements InitializingBean, DisposableBean {
       private String name;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("We are inside init i.e afterPropertiesSet()");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("We are inside destroy()");
    }


}
