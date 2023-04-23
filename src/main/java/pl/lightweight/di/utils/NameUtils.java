package pl.lightweight.di.utils;

public class NameUtils {

    /**
     * @apiNote Should be used only for class name
     */
    public static String toCamelCase(String text) {
        return text.substring(0 , 1).toLowerCase().concat(text.substring(1));
    }

}
