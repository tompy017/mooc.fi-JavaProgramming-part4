
/**
 *
 * @author tom
 */
public class Gauge {
    
    private int value;
    
    //Constructor w/o parameter that sets to 0 the value
    public Gauge() {
        this.value = 0;
    }
    
    public void decrease() {
        if (this.value > 0) {
            this.value --;
        }
    }
    
    public void increase() {
        if (this.value < 5) {
            this.value ++;
        }
    }
    
    public int value() {
        return this.value;
    }
    
    public boolean full() {
        return this.value == 5;
    }
}
