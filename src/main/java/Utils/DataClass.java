package Utils;

public class DataClass {
    public static Object[][] loginTestData(){
        return new Object[][] {
                {"standard_user","secret_sauce"},
                {"locked_out_user","secret_sauce"},
                {"problem_user","secret_sauce"},
                {"performance_glitch_user","secret_sauce"}
        };
    }

    public static String[][] teste(){
        return new String[][]{
                {"standard_user","secret_sauce"},
                {"locked_out_user","secret_sauce"}
        };
    }

}
