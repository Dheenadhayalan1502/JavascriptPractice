import java.lang.annotation.*;
import java.lang.reflect.Field;

// 1. Create custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MyAnnotaion {
}

// 2. Dependency class
class Engine {
    public void start() {
        System.out.println("Engine started!");
    }
}