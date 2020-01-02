/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomprokop
 */
public class Vzorek {
        // parametry funkce
    private double x;
    private double fx;
    
    
    
    public Vzorek(double x, double fx)
    {
        setX(x);
        setFx(fx);
    }
    
    public void setX(double x)
    {
        this.x = (x > 0) ? x : 0;
    }
    public void setFx(double fx)
    {
        this.fx = (fx > 0) ? fx : 0;
    }
    
    public double getX()
    {
        return x;
    }
        
    public double getFx()
    {
        return fx;
    }
    
    public Double HashCode(){
        return this.getX();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Vzorek))
            return false;
        if (obj == this)
            return true;
        return ((this.getX() == ((Vzorek) obj).getX()) && (this.getFx() == ((Vzorek) obj).getFx()));
    }
}
