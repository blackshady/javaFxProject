
package school.management.ui.staff;


public enum States {
ABIA, ADAMAWA,AKWA, IBOM,ANAMBRA,BAUCHI,BAYELSA,BENUE,BORNO,CROSS_RIVER,DELTA,EBONYI,EDO,EKITI,ENUGU,GOMBE,IMO,JIGAWA,
KADUNA,KANO,KATSINA,KEBBI,KOGI,KWARA,LAGOS,NASSARAWA,NIGER,OGUN,ONDO,OSUN,OYO,PLATEAU,RIVERS,SOKOTO,TARABA,YOBE,ZAMFARA,FCT ;
    
    
      private States(){}
    
    public String value(){
    return name();
    }
    
    public static States fromvalue( String v){
    return valueOf(v);
    
    }
    
}
