/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP_SWING.Bai11.shapeLogic;

import java.awt.Graphics2D;

/**
 *
 * @author nguye
 */
public class DrawLine {
    private Graphics2D gs;
    private Line line;

    public DrawLine() {
    }

    public DrawLine(Graphics2D gs, Line line) {
        this.gs = gs;
        this.line = line;
    }

    public Graphics2D getGs() {
        return gs;
    }

    public void setGs(Graphics2D gs) {
        this.gs = gs;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
    
    public void veDuongThang() {
        gs.drawLine(line.getBegin_x(), line.getBegin_y(),
                    line.getEnd_x(), line.getEnd_y());
    }

    
    
    
}
