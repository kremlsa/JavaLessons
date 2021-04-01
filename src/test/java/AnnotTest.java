import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotTest {


    @Test
    public void getAnnotationTest(){
        Class itemClass = Item.class;

        for (Field field : itemClass.getDeclaredFields()) {
            for (Annotation annotation : field.getDeclaredAnnotations()) {
                System.out.print(annotation + " - ");
            }
            System.out.println(field.getName());
        }

        for (Method method : itemClass.getDeclaredMethods()) {
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                System.out.print(annotation + " - ");
            }
            System.out.println(method.getName());
        }
    }

    @Test
    public void getMethodsTest(){
        Class itemClass = Item.class;

        for (Method method : itemClass.getMethods()) {
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                System.out.print(annotation + " - ");
            }
            System.out.println(method.getName());
        }
    }

    @Test
    public void testDescAnnot() {
        // Creating processor object
        DescriptionProcessor processor = new DescriptionProcessor();
        // Creating test object with annotated method
        TestClass test = new TestClass();
        // Call processing method
        processor.printDescription(test);
    }
}
