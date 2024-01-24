package daniel;

public interface CanBeColored {

    default String setColor(String color) {
        if (color != null) {

            if (color.equals("Blue") || color.equals("Green") ||
                    color.equals("Red") || color.equals("Yellow")) {

                return color;
            }
        }
        return "No color";
    }

    public abstract String getColor();
}
