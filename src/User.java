/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohak
 */
class User {
    public int page, unit;
    public float sp;
    public String bookn, aname;
    //for book names and prices
    public static String[] b;
    public static float[] p;
    //for customer ID
    public static String custID;
    
    public User(String bookn,String aname,int page, float sp, int unit){
        this.bookn = bookn;
        this.aname = aname;
        this.page = page;
        this.sp = sp;
        this.unit = unit;
    }
    
    
    public String getBookn(){
        return bookn;
    }
    
    public String getAname(){
        return aname;
    } 
    
    public int getPage(){
        return page;
    }
    
    public float getSp(){
        return sp;
    }
    
    public int getUnit(){
        return unit;
    }
        
}
