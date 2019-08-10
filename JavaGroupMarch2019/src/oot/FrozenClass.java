/*
 * Final class
 */
package oot;

/**
 * Final class
 * @author gheor
 */
public final class FrozenClass {
    private String[] validKeys = {"12we34","33sd45","6ty5u7"};
    public boolean checkValidity(String key){
        boolean isValid = false;
        for(String currentKey:validKeys){
            if(currentKey.equals(key))
                isValid = true;
        }
        return isValid;
    }
}
