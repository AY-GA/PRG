package grafika;

public class AppCubeAnim extends Gyarab2D {
    double angle = 0;
    double cx = 0, cy = 0; // center position
    double dx = 2, dy = 1.5; // velocity
    double[][] vertices = {
            { -1, -1, -1 }, { 1, -1, -1 }, { 1, 1, -1 }, { -1, 1, -1 },
            { -1, -1, 1 }, { 1, -1, 1 }, { 1, 1, 1 }, { -1, 1, 1 }
    };
    int[][] edges = {
            { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 0 }, // back face
            { 4, 5 }, { 5, 6 }, { 6, 7 }, { 7, 4 }, // front face
            { 0, 4 }, { 1, 5 }, { 2, 6 }, { 3, 7 } // connections
    };

    // 16x16 Mazda logo pixel art (0xRRGGBB, white background, black logo)
    static final int LOGO_SIZE = 16;
    static final int[][] MAZDA_LOGO = {
        {0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF},
        {0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xCCCCCC,0xCCCCCC,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF},
        {0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF},
        {0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF},
        {0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF},
        {0xFFFFFF,0xFFFFFF,0xCCCCCC,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xCCCCCC,0xFFFFFF,0xFFFFFF},
        {0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF},
        {0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF},
        {0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF},
        {0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF},
        {0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF},
        {0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF},
        {0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF},
        {0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF},
        {0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xCCCCCC,0xCCCCCC,0xCCCCCC,0xCCCCCC,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF},
        {0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF,0xFFFFFF},
    };

    @Override
    public boolean maluj(int idx) {
        // Move the cube center
        cx += dx;
        cy += dy;
        int margin = 25; // cube size margin
        if (cx - margin < -maxXY || cx + margin > maxXY)
            dx = -dx;
        if (cy - margin < -maxXY || cy + margin > maxXY)
            dy = -dy;
        // Clear screen (white)
        for (int i = -maxXY; i <= maxXY; i++)
            for (int j = -maxXY; j <= maxXY; j++)
                namalujBod(i, j, 255, 255, 255);
        // Draw Mazda logo background
        for (int i = -maxXY; i <= maxXY; i++)
            for (int j = -maxXY; j <= maxXY; j++) {
                int logoX = (i + maxXY) % LOGO_SIZE;
                int logoY = LOGO_SIZE - 1 - ((j + maxXY) % LOGO_SIZE); // flip vertically
                int color = MAZDA_LOGO[logoY][logoX];
                int r = (color >> 16) & 0xFF;
                int g = (color >> 8) & 0xFF;
                int b = color & 0xFF;
                namalujBod(i, j, r, g, b);
            }
        // Rotation matrices
        angle += 0.05;
        double cosA = Math.cos(angle);
        double sinA = Math.sin(angle);
        double cosB = Math.cos(angle * 0.7);
        double sinB = Math.sin(angle * 0.7);
        // Project and draw edges
        int[][] proj = new int[8][2];
        for (int v = 0; v < 8; v++) {
            double[] vert = vertices[v];
            // Rotate around Y
            double x = vert[0] * cosA - vert[2] * sinA;
            double z = vert[0] * sinA + vert[2] * cosA;
            // Rotate around X
            double y = vert[1] * cosB - z * sinB;
            z = vert[1] * sinB + z * cosB;
            // Perspective projection
            double scale = 60 / (z + 4);
            proj[v][0] = (int) (x * scale + cx);
            proj[v][1] = (int) (y * scale + cy);
        }
        for (int[] edge : edges) {
            drawLine(proj[edge[0]][0], proj[edge[0]][1], proj[edge[1]][0], proj[edge[1]][1], 0, 0, 0);
        }
        return true;
    }

    void drawLine(int x0, int y0, int x1, int y1, int r, int g, int b) {
        int dx = Math.abs(x1 - x0), dy = Math.abs(y1 - y0);
        int sx = x0 < x1 ? 1 : -1;
        int sy = y0 < y1 ? 1 : -1;
        int err = dx - dy;
        while (true) {
            namalujBod(x0, y0, r, g, b);
            if (x0 == x1 && y0 == y1)
                break;
            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x0 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y0 += sy;
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
