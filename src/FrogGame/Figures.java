package FrogGame;
import java.awt.*;

public class Figures {

    private int row;
    private int col;
    private String color;

    public Figures(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void renderGreenFigures(Graphics g) {

        Color nGreen = new Color(34, 177, 76);

        if(this.row == 4 && this.col == 0) {
            g.setColor(nGreen);
            g.fillRect(30,425,50,50);
        }
        if(this.row == 4 && this.col == 1) {
            g.setColor(nGreen);
            g.fillOval(135, 435, 25, 25);
        }
        if(this.row == 4 && this.col == 2) {
            g.setColor(nGreen);
            g.fillOval(235, 435, 25, 25);
        }
        if(this.row == 4 && this.col == 3) {
            g.setColor(nGreen);
            g.fillOval(335, 435, 25, 25);
        }
        if(this.row == 4 && this.col == 4) {
            g.setColor(nGreen);
            g.fillOval(435, 435, 25, 25);
        }
    }

    public void renderYellowFigures(Graphics g) {

        Color nYellow = new Color(255, 242, 0);

        if(this.row == 0 && this.col == 0) {
            g.setColor(nYellow);
            g.fillRect(30, 25, 50, 50);
        }

        if(this.row == 0 && this.col == 1) {
            g.setColor(nYellow);
            g.fillOval(135, 35, 25, 25);
        }

        if(this.row == 0 && this.col == 2) {
            g.setColor(nYellow);
            g.fillOval(235, 35, 25, 25);
        }

        if(this.row == 0 && this.col == 3) {
            g.setColor(nYellow);
            g.fillOval(335, 35, 25, 25);
        }

        if(this.row == 0 && this.col == 4) {
            g.setColor(nYellow);
            g.fillOval(435, 35, 25, 25);
        }
    }

}
