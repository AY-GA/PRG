package grafika;

public class AppFlyingCircle extends Gyarab2D {
    double x = 0;
    double y = 0;
    double dx = 2;
    double dy = 1.5;
    int radius = 20;

    @Override
    public boolean maluj(int idx) {
        // Move the circle
        x += dx;
        y += dy;
        // Bounce off edges
        if (x - radius < -maxXY || x + radius > maxXY) dx = -dx;
        if (y - radius < -maxXY || y + radius > maxXY) dy = -dy;
        // Clear screen (white)
        for (int i = -maxXY; i <= maxXY; i++) {
            for (int j = -maxXY; j <= maxXY; j++) {
                namalujBod(i, j, 255, 255, 255);
            }
        }
        // Draw the circle (blue)
        drawCircle((int)x, (int)y, radius, 0, 0, 255);
        return true;
    }

    void drawCircle(int cx, int cy, int r, int red, int green, int blue) {
        for (int angle = 0; angle < 360; angle++) {
            double rad = Math.toRadians(angle);
            int px = cx + (int)(r * Math.cos(rad));
            int py = cy + (int)(r * Math.sin(rad));
            namalujBod(px, py, red, green, blue);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
