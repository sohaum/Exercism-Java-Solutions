import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        // Returns true if the list has no elements
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        // Appends the language to the end of the list
        languages.add(language);
    }

    public void removeLanguage(String language) {
        // Removes the first occurrence of the specified language
        languages.remove(language);
    }

    public String firstLanguage() {
        // Returns the element at index 0 (the first item)
        return languages.get(0);
    }

    public int count() {
        // Returns the current size of the list
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        // Checks if the language exists anywhere in the list
        return languages.contains(language);
    }

    public boolean isExciting() {
        // Returns true if the list includes "Java" or "Kotlin"
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}