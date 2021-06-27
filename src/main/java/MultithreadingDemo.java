import Constructor.ConstructorPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Locale;

class Multithread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId()
                    + " is running");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

public class MultithreadingDemo extends Thread{

    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Multithread object = new Multithread();
            object.run();
        }

        ConstructorPackage mobject = new ConstructorPackage();

        Class newobj = mobject.getClass();
        System.out.println("Class name = " + newobj.getSimpleName());

//        getMethods
        Method[] methods = newobj.getMethods();
        System.out.println("Methods form class " + newobj.getSimpleName().toUpperCase(Locale.ROOT));
        for (Method method : methods) {
            System.out.println(method.getName());
        }

//        Constructor
        Constructor<?>[] constructor = mobject.getClass().getConstructors();
        System.out.println("Constructor name = " + constructor[0].getName());


    }
}
