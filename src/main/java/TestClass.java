public class TestClass {
    @Descriptions(value = {
            @Description(author = "John Doe", description = "Testing method"),
            @Description(author = "Richard Roe", description = "Repeatable description", version = 1),
    })
    public void testMethod() {
        System.out.println("This is my method to test the @Description annotation");
    }
}