
package school.management.ui.staff;


public enum Religions {
    
  Christianity, Islam, Traditional_African_Religions,Hinduism, Baháí_Faith,Atheism, Buddhists,Judaism,Chinese_folk_religions, Jains;  
    
    
    
      private Religions (){}
    
    public String value(){
    return name();
    }
    
    public static Religions fromvalue( String v){
    return valueOf(v);
    
    }
    
}
