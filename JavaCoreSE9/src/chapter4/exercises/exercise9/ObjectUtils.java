
package chapter4.exercises.exercise9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ObjectUtils {
    public static String toString(Object object, boolean recursive) {
        if (object == null) return "null";

        Class<?> clazz = object.getClass();
        StringBuilder sb = new StringBuilder(clazz.getSimpleName()).append(" {");

        while (clazz != null && !clazz.equals(Object.class)) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field f : fields) {
                if (!Modifier.isStatic(f.getModifiers())) {
                    try {
                        f.setAccessible(true);
                        sb.append(f.getName()).append(" = ").append(f.get(object)).append(",");
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (!recursive) {
                break;
            }
            clazz = clazz.getSuperclass();
        }

        sb.deleteCharAt(sb.lastIndexOf(","));
        return sb.append("}").toString();
    }
    
    public static void main(String... args){

        // print null
        System.out.println(ObjectUtils.toString(null, false));

        // print vehicle
        Vehicle vehicle = new Vehicle();
        System.out.println(ObjectUtils.toString(vehicle, true));

        // print car
        Car car = new Car();
        System.out.println(ObjectUtils.toString(car, false));
        System.out.println(ObjectUtils.toString(car, true));
    }

}
