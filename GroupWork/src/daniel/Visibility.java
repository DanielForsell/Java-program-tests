package daniel;

public abstract class Visibility {
    private boolean inBackground = false;

    public Visibility(){}

    public void changeVisibility() {

        if (inBackground) {
            inBackground = false;
        } else {
            inBackground = true;
        }
    }

    public boolean isVisible() {

        return !inBackground;
    }
}
