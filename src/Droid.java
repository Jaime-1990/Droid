public class Droid {
    //instance field

    int batteryLevel;
    String name;
    // constructor method
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }
   public String toString() {
        return "Hello my name is Jaime" + name;
   }

   public void energyReport(){
        System.out.println("Current battery level: " + batteryLevel + "%,");
   }
    public void performTask(String task) {
        System.out.println(name + "is performing: " + task);
        batteryLevel -= 10;
        energyReport();
    }
}
