/*
 * Class Mother that keeps Baby as inner class
 */
package oot;

import java.util.LinkedList;

/**
 * Class Mother that keeps Baby as inner class
 * @author gheor
 */
public class Mother {    
    public class Baby{
        private float weight = 0.0f; // in Kg
        private int age = 0; // in month

        private Baby() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        public int getAge() {
            return age;
        }
        public float getWeight() {
            return weight;
        }
        private void increaseWeight() throws InterruptedException{
            while(true){
                Thread.sleep(1000l);
                weight = (float) (weight + 0.001);
            }
        }
        private void increaseAge() throws InterruptedException{
            while(true){
                Thread.sleep(1000l);
                age = (int) (float) (age + 0.000002);
            }        
        }
    }
    private int numberOfBabies = 0;
    private LinkedList<Baby> listOfBabies;    
    /** Constructor of Mother
     * @param newNumberOfBabies
     */
    public Mother (int newNumberOfBabies) throws InterruptedException{
        numberOfBabies = newNumberOfBabies;
        for(int currentBaby = 0;currentBaby<numberOfBabies;currentBaby++){
            Baby cB = new Baby();
            cB.increaseWeight();
            cB.increaseAge();
            listOfBabies.add(cB);
        }
    }
    public LinkedList<Baby> getListOfBabies() {
        return listOfBabies;
    }

    public void setListOfBabies(LinkedList<Baby> listOfBabies) {
        this.listOfBabies = listOfBabies;
    }
}
