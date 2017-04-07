package org.arquillian.wildfly.example;

import javax.ejb.Remote;

/**
 * Created by dantut on 2017-04-07.
 */

@Remote
public class Inecting{

    public String sayHi(){
        return "hello world";
    }

}
