import display.Display;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Timer;

public class Main {
    public static void main(String[] args) {

        Display.create(800, 600, "Battle City", 0xff00ff00);

        Timer t = new Timer(1000/60, new AbstractAction(){

            public void actionPerformed(ActionEvent event){

                Display.clear();
                Display.render();
                Display.swapBuffers();

            }

        });
        t.setRepeats(true);
        t.start();

    }
}