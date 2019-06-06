/*
 * Generic Box but only for Numbers
 */
package specialclasses;

/**
 * Generic Box but only for Numbers
 * @author gheor
 * @param <T> Any type/Class extending Number
 */
public class BoxForNumbers<T extends Number> {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
    
}
