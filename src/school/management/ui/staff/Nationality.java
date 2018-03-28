
package school.management.ui.staff;


public enum Nationality {
    
    Algeria,Angola, Benin,Botswana,Burkina_Faso,Burundi,Cabo_Verde,Cameroon,Central_African_Republic,Chad,Comoros,
    Democratic_Republic_of_the_Congo,Republic_of_the_Congo,Cote_d_Ivoire,Djibouti,Egypt,Equatorial_Guinea,Eritrea,Ethiopia,
    Gabon,Gambia,Ghana,Guinea,Guinea_Bissau,Kenya,Lesotho,Liberia,Libya,Madagascar,Malawi,Mali,Mauritania,Mauritius,Morocco,
    Mozambique,Namibia,Niger,Nigeria,Rwanda,Sao_Tome_and_Principe,Senegal,Seychelles,Sierra_Leone,Somalia,South_Africa,South_Sudan,
    Sudan,Swaziland,Tanzania,Togo,Tunisia,Uganda,Zambia,Zimbabwe;
    
    
    
    
    
     private Nationality(){}
    
    public String value(){
    return name();
    }
    
    public static Nationality fromvalue( String v){
    
        return valueOf(v);
    
    }
    
}
