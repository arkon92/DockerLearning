package com.local.rest;


import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import java.util.HashSet;
import java.util.Set;


public class MessageApplication extends Application {
        private Set<Object> singletons = new HashSet<Object>();

        public MessageApplication() {
            singletons.add(new EndPoint());
        }

        @Override
        public Set<Object> getSingletons() {
            return singletons;
        }
    }
