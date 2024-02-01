package main.java;

import java.util.List;
import java.util.stream.Collectors;

public class StringTransformer {

    /**
     * Transforms a list of strings by converting each string to uppercase
     * and filtering out strings with a length less than the specified threshold.
     *
     * @param strings   The list of strings to be transformed.
     * @param minLength The minimum length threshold for the transformed strings.
     * @return A new list containing uppercase strings with a length greater than or equal to minLength.
     */
    public static List<String> transformStrings(List<String> strings, int minLength) {
         List<String> newStrings = strings.stream()
                .map(string -> string.toUpperCase())
                .filter(string -> string.length() >= minLength)
                .collect(Collectors.toList());
        return newStrings;
    }

}