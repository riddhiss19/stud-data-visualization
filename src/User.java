/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vishal
 */
class User {

   String prn,name,subject,Ha,pptgd,cp,oral,theory;
    public User(String prn,String name,String subject,String Ha,String pptgd,String cp,String oral,String theory){
        this.prn = prn;
        this.name=name;
        this.subject=subject;
        this.Ha=Ha;
        this.pptgd=cp;
        this.cp=cp;
        this.oral=oral;
        this.theory=theory;
    }


    
    //getters
    public String getPRN(){
        return this.prn;
    }
    public String getNAME(){
        return this.name;
    }
    public String getSubject(){
        return this.subject;
    }
    public String getHA(){
        return this.Ha;
    }
    public String getPPTGD(){
        return this.pptgd;
    }
    public String getCP(){
        return this.cp;
    }
    public String getOral(){
        return this.oral;
    }
    public String gettheory(){
        return this.theory;
    }
    
    
    
    
    
}
