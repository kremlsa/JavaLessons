import java.lang.annotation.*;

/*SOURCE
These annotations are used by the compiler during the compilation process.
For example, @Override annotation has this type of retention.

CLASS
It is the default retention. These annotations are recorded in the class file on compilation,
 but then they are not available during run time. It is basically used to perform
byte code modifications. For example, it can be used in code obfuscation or code generation
libraries (e.g. Lombok).

RUNTIME
Runtime annotations are also recorded in the class file, and then they can be read at run time.
The @Deprecated annotation and @Retention itself has a runtime retention policy.
This one is generally used for custom annotations because it is the only policy that
can be processed manually during program execution.

@Target tells where the annotation can be placed: methods, packages, annotations themselves,
etc. You can look at the table to find out all the available values.
If you don't set up its value, the annotation will be applicable to all elements.

 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Descriptions.class)
public @interface Description {
    String author();
    String description();
    int version() default 0;
}
