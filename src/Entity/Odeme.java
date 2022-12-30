
package Entity;

public class Odeme {
    
    private float borc;

    public Odeme() {
    }
    
    public float getBorc() {
        return borc;
    }

    public void setBorc(float borc) {
        this.borc = borc;
    }

    @Override
    public String toString() {
        return getBorc()+"";
    }
}
