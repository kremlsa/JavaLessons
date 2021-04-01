import java.lang.reflect.Method;

public class DescriptionProcessor {

    public void printDescription(Object o) {
        // Get processing object class
        Class<?> processingClass = o.getClass();
        for (Method method : processingClass.getDeclaredMethods()) {
            // Check if method has container @Descriptions annotation
            if (method.isAnnotationPresent(Descriptions.class)) {
                // Get container annotation
                Descriptions descriptions = method.getAnnotation(Descriptions.class);
                StringBuilder sb = new StringBuilder();
                // Iterate over exact @Description annotations
                for (Description d : descriptions.value()) {
                    sb.append("Description: ")
                            .append(d.description())
                            .append(" Author : " )
                            .append(d.author())
                            .append(" Version : ")
                            .append(d.version())
                            .append("\n");
                }
                // Print result
                System.out.println(method.getName() + " Descriptions: ");
                System.out.println(sb.toString());
            }
        }
    }
}