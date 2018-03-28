/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.ui.staff;

/**
 *
 * @author victorchi
 */
public enum SUBjects {
    
 English,Mathematics,Biology,Physics,Chemistry, Literature_in_English,Economics,  Government,Basic_science,Social_studies,Computer_studies,Basic_Technology,French_language,Agricultural_science,
 History,Commerce,Further_mathematics,Geography,Physical_Health_Education,Business_studies,Christian_Religious_Studies,Islamic_Religious_Studies;


     private  SUBjects(){}
    
    public String value(){
    return name();
    }
    
    public static  SUBjects fromvalue( String v){
    return valueOf(v);
}
    
}
