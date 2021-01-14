package FrogGame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame {

        public ArrayList<Object> figureCollection;

        public GameBoard() {

            this.setSize(500, 500);
            this.setVisible(true);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            this.figureCollection = new ArrayList<>();

            //Yellow team
            this.figureCollection.add(new Figures(0,0));
            this.figureCollection.add(new Figures(0,1));
            this.figureCollection.add(new Figures(0,2));
            this.figureCollection.add(new Figures(0,3));
            this.figureCollection.add(new Figures(0,4));

            //Green team
            this.figureCollection.add(new Figures(4,0));
            this.figureCollection.add(new Figures(4,1));
            this.figureCollection.add(new Figures(4,2));
            this.figureCollection.add(new Figures(4,3));
            this.figureCollection.add(new Figures(4,4));

        }

        @Override
        public void paint(Graphics g) {

            super.paint(g);

            for(int row = 0; row < 5; row++) {
                for(int col = 0; col < 5; col++) {

                    Tiles tile = new Tiles(row, col);
                    tile.renderBoard(g);

                    Figures figure = new Figures(row, col);
                    figure.renderGreenFigures(g);
                    figure.renderYellowFigures(g);

                }
            }
        }
    }

