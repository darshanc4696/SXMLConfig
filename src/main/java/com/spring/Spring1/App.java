package com.spring.Spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Impl.IndianArmy;
import com.spring.Impl.IndianNavy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("beans.xml");
        IndianArmy ia = (IndianArmy)cx.getBean("army");
        IndianNavy in = (IndianNavy)cx.getBean("navy");
        
        ia.setAppContext(cx);
        in.setAppContext(cx);
        
        ia.addressPM();
        in.addressPM();
    }
}
