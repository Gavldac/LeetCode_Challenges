/**
 * Class to represent a Rod in a ring toss game.
 * Rods need to be counted once if they have 3
 * different colors on them. 
 * A Rod can only be counted once regardless of 
 * how many rings might be on it.
 */
class Rod {
    boolean red;
    boolean blue;
    boolean green;

    public Rod() {
        this.red = false;
        this.blue = false;
        this.green = false;
    }

    public void setRingColor(char color) {
        if (color == 'B')
            blue = true;
        if (color == 'G')
            green = true;
        if (color == 'R')
            red = true;
    }

    public boolean getHas3Rings() {
        return (green && blue && red);
    }
}