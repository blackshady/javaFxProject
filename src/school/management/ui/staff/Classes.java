
package school.management.ui.staff;


public enum Classes {
    
   Primary_One,Primary_Two,Primary_Three,Primary_Four,Primary_Five, Primary_Six, JSS1,JSS2, JSS3,SS1,SS2,SS3;
    
      
    
      private Classes (){}
    
    public String value(){
    return name();
    }
    
    public static Classes fromvalue( String v){
    return valueOf(v);
    
    }
    
    
    
}
