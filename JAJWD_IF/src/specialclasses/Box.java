/*
 * Create a Generic Class Box
 */
package specialclasses;

/**
 * Create a Generic Class Box
 * @author gheor
 */
public class Box <T>{
    
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
