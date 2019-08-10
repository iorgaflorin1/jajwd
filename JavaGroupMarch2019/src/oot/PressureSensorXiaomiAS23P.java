/*
 * Class of Xiaomy pressure sensors with fabrication code AS23P
 * that has one pressure pump XPPAS23P
 */
package oot;

/**
 * Class of Xiaomy pressure sensors with fabrication code AS23P
 * that has one pressure pump XPPAS23P
 * @author gheor
 */
public class PressureSensorXiaomiAS23P {
    private double pressure = 0.0;
    
    public double getPressure() {
        return pressure;
    }
    
    private double readPressure(){
        // local class
        class XPPAS23P{
            double instantPressure;
            public void runPump(){
                while(true){
                   // read value from installation point and write it to instantPressure
                   // this is normaly written in C embeed 
                }
            }
            public double getInstantPressure() {
                return instantPressure;
            }
        }
        // code of method
        double readValue = 0.0; 
        XPPAS23P pressurePump = new XPPAS23P();
        pressurePump.runPump();
        readValue = pressurePump.getInstantPressure();
        pressure = readValue;
        return pressure;
    }
}
