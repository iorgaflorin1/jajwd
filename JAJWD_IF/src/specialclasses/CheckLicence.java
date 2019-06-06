/*
 * Class checks licence numbers using a method for that.
 */
package specialclasses;

/**
 * Class checks licence numbers using a method for that.
 * @author gheor
 */
public final class CheckLicence {
    String [] licenses = new String[]{"A12W", "K1WE","TEWD"};
    
    public final boolean validate(String licence){
        boolean response = false;
        
        for(String currentLicence:licenses){
            if(currentLicence.equals(licence))
                response = true;
        }
        return response;
    }
}
