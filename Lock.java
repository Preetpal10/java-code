class Locker {
    
    private String pin;
    private boolean isLocked;
    private String storedItem;

    
    public Locker(String initialPin, String itemToStore) {
        this.pin = initialPin;
        this.storedItem = itemToStore;
        this.isLocked = true; 
    }

    
    public void unlock(String enteredPin) {
        if (enteredPin == this.pin) {
            this.isLocked = false;
            System.out.println("Locker Unlocked.");
        } else {
            System.out.println("Incorrect PIN. Access Denied.");
        }
    }


    public void lock() {
        this.isLocked = true;
        System.out.println("Locker is now Locked.");
    }

    
    public void viewContents() {
        if (!this.isLocked) {
            System.out.println("Contents: " + this.storedItem);
        } else {
            System.out.println("Cannot view contents. The locker is locked.");
        }
    }

    public void changePin(String oldPin, String newPin) {
        if (oldPin.equals(this.pin)) {
            this.pin = newPin;
            System.out.println("PIN successfully changed.");
        } else {
            System.out.println("Old PIN is incorrect. Cannot change PIN.");
        }
    }
}
public class Lock{
    public static void main(String[] args) {
        
        Locker myLocker = new Locker("1234", "Confidential Project Documents");


        System.out.println("--- Trying to view contents while locked ---");
        myLocker.viewContents(); 

        System.out.println("\n--- Entering wrong PIN ---");
        myLocker.unlock("9999");

        System.out.println("\n--- Entering correct PIN ---");
        myLocker.unlock("1234");
        myLocker.viewContents(); 

        System.out.println("\n--- Changing the PIN ---");
        myLocker.changePin("1234", "5678");

        System.out.println("\n--- Locking it back up ---");
        myLocker.lock();
    }
}