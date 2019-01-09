/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohak
 */
class cart {
    public int unit;
    public float sp;
    public String bookn;
    
    public cart(String bookn, int unit, float sp){
        this.bookn = bookn;
        this.sp = sp;
        this.unit = unit;
    }
    
    
    public String getBookn(){
        return bookn;
    }
    
    public float getSp(){
        return sp;
    }
    
    public int getUnit(){
        return unit;
    }
        
}
