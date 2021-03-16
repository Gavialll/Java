package Reflection;

import GameOk.Man;

import java.lang.reflect.Field;
import java.util.Map;

public class Start {
    public static void main(String[] args) {


try {
    Man man = new Man(12, 100 , "cds");

    System.out.println("1");
    Field privateFild = Man.class.getDeclaredField( "name");
    privateFild.setAccessible(true);
    privateFild.set(man, "asd");


    System.out.println("2");
    System.out.println(privateFild.getName());
    System.out.println("3");
    System.out.println(man.getName());
        //Field privateFild = man.class.getField("hp");

    }catch (Exception e){
    System.out.println("sss");
            }
    }
}
