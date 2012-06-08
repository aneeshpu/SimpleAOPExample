package com.aneesh.aop;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: aneeshpu
 * Date: 8/6/12
 * Time: 12:03 AM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class MyTarget {

    public String greet(){
        return "Hello there";

    }
}
