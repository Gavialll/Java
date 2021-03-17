package Reflection;

import Reflection.Info.Device;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) throws NoSuchFieldException {

        Man man = new Man(100, 200);

        try {
            System.out.println("N2");
        Class<Man> manClass = Man.class;
        System.out.println((Arrays.toString(manClass.getDeclaredFields())));

        Field field = manClass.getDeclaredField("hp");
        field.setAccessible(true);
        field.set(man, 123);

            System.out.println(man.getHp());

            System.out.println("N1");

            System.out.println(Arrays.toString(manClass.getDeclaredMethods()));

            System.out.println("N3");

            System.out.println(Arrays.toString(manClass.getConstructors()));

            System.out.println("N4");
            //Man mens = manClass.newInstance();
            //mens.setHp(234);
            //mens.setDamage(565);
            //
            //System.out.println(mens.getHp());

            System.out.println("N5");
            Field damage = manClass.getDeclaredField("damage");
            field.setAccessible(true);
            field.set(man, 123);

            Method playMehtod = manClass.getDeclaredMethod("getDamage", Integer.TYPE);

           Object o = playMehtod.invoke(23);
           System.out.println(o);

        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
