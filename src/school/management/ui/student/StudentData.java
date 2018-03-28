
package school.management.ui.student;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudentData {
    private final StringProperty REG_N;
    private final StringProperty FIRST_NAME;
    private final StringProperty LAST_NAME;
    private final StringProperty SURNAME;
    private final StringProperty DOB;
    private final StringProperty DOR;
    private final StringProperty SEX;
    private final StringProperty RILI;
    private final StringProperty NATIO;
    private final StringProperty SFO;
    private final StringProperty LGA;
    private final StringProperty HOME_ADD;
    private final StringProperty CLASS;
    private final StringProperty DIA;
    private final StringProperty PA_OCC;
    private final StringProperty CONTAC;
    private final StringProperty STUDENT_IMAGE;
    private final StringProperty PART_IMAGE;   
    private final StringProperty EMAIL;
    
    
    
    
    public StudentData(String regN, String fName,  String lName, String dob, String email, String contact,  String dia, String dor, String lga, String part_image, String natio, String rili, String sfo, String sex, String student_image, String home_add, String pa_occ, String surname, String clas )
    {
        
    this.REG_N = new SimpleStringProperty(regN);
    this.FIRST_NAME =  new SimpleStringProperty(fName);
    this.LAST_NAME =  new SimpleStringProperty(lName);
    this.DOB =  new SimpleStringProperty(dob);
    this.EMAIL =  new SimpleStringProperty(email);
    this.CONTAC =  new SimpleStringProperty(contact);
    this.DIA =  new SimpleStringProperty(dia);
    this.DOR =  new SimpleStringProperty(dor);
    this.LGA =  new SimpleStringProperty(lga);
    this.PART_IMAGE =  new SimpleStringProperty(part_image);
    this.NATIO =  new SimpleStringProperty(natio);
    this.RILI =  new SimpleStringProperty(rili);
    this.SFO =  new SimpleStringProperty(sfo);
    this.SEX =  new SimpleStringProperty(sex);
    this.STUDENT_IMAGE =  new SimpleStringProperty(student_image);
    this.HOME_ADD =  new SimpleStringProperty(home_add);
    this.PA_OCC =  new SimpleStringProperty(pa_occ);
    this.SURNAME =  new SimpleStringProperty(surname);
    this.CLASS =  new SimpleStringProperty(clas);
     
     
    }
    
    public String getREG_N(){
    return REG_N.get();
    }
    
    public StringProperty REG_NProperty(){
    return REG_N;
    }
    
    public void setREG_N(String REG_N){
    this.REG_N.set(REG_N);
    }
    
    public String getFIRST_NAME(){
    return FIRST_NAME.get();
    }
    
    public StringProperty FIRST_NAMEProperty(){
    return FIRST_NAME;
    }
    
    public void setFIRST_NAME(String FIRST_NAME){
    this.FIRST_NAME.set(FIRST_NAME);
    }
    
     public String getLAST_NAME(){
    return LAST_NAME.get();
    }
    
    public StringProperty LAST_NAMEProperty(){
    return LAST_NAME;
    }
    
    public void setLAST_NAME(String LAST_NAME){
    this.LAST_NAME.set(LAST_NAME);
    }
    
     public String getDOB(){
    return DOB.get();
    }
    
    public StringProperty DOBProperty(){
    return DOB;
    }
    
    public void setDOB(String DOB){
    this.DOB.set(DOB);
    }
    
       public String getEMAIL(){
    return EMAIL.get();
    }
    
    public StringProperty EMAILProperty(){
    return EMAIL;
    }
    
    public void setEMAIL(String EMAIL){
    this.EMAIL.set(EMAIL);
    }
    
   
    public String getSURNAME(){
    return SURNAME.get();
    }
    
    public StringProperty SURNAMEProperty(){
    return SURNAME;
    }
    
    public void setSURNAME(String SURNAME){
    this.SURNAME.set(SURNAME);
    }
    
    
    public String getDOR(){
    return DOR.get();
    }
    
    public StringProperty DORProperty(){
    return DOR;
    }
    
    public void setDOR(String DOR){
    this.DOR.set(DOR);
    }
    
    
    public String getSEX(){
    return SEX.get();
    }
    
    public StringProperty SEXProperty(){
    return SEX;
    }
    
    public void setSEX(String SEX){
    this.SEX.set(SEX);
    }
     
    public String getRILI(){
    return RILI.get();
    }
    
    public StringProperty RILIProperty(){
    return RILI;
    }
    
    public void setRILI(String RILI){
    this.RILI.set(RILI);
    }
    
    public String getNATIO(){
    return NATIO.get();
    }
    
    public StringProperty NATIOProperty(){
    return NATIO;
    }
    
    public void setNATIO(String NATIO){
    this.NATIO.set(NATIO);
    }
    
    public String getSFO(){
    return SFO.get();
    }
    
    public StringProperty SFOProperty(){
    return SFO;
    }
    
    public void setSFO(String SFO){
    this.SFO.set(SFO);
    }
    
     public String getLGA(){
    return LGA.get();
    }
    
    public StringProperty LGAProperty(){
    return LGA;
    }
    
    public void setLGA(String LGA){
    this.LGA.set(LGA);
    }
    
    public String getHOME_ADD(){
    return HOME_ADD.get();
    }
    
    public StringProperty HOME_ADDProperty(){
    return HOME_ADD;
    }
    
    public void setHOME_ADD(String HOME_ADD){
    this.HOME_ADD.set(HOME_ADD);
    }
    
    public String getCLASS(){
    return CLASS.get();
    }
    
    public StringProperty CLASSProperty(){
    return CLASS;
    }
    
    public void setCLASS(String CLASS){
    this.CLASS.set(CLASS);
    }
    
    public String getDIA(){
    return DIA.get();
    }
    
    public StringProperty DIAProperty(){
    return DIA;
    }
    
    public void setDIA(String DIA){
    this.DIA.set(DIA);
    }
    
    public String getPA_OCC(){
    return PA_OCC.get();
    }
    
    public StringProperty PA_OCCProperty(){
    return PA_OCC;
    }
    
    public void setPA_OCC(String PA_OCC){
    this.PA_OCC.set(PA_OCC);
    }
    
     public String getCONTAC(){
    return CONTAC.get();
    }
    
    public StringProperty CONTACProperty(){
    return CONTAC;
    }
    
    public void setCONTAC(String CONTAC){
    this.CONTAC.set(CONTAC);
    }
    
    
    public String getSTUDENT_IMAGE(){
    return STUDENT_IMAGE.get();
    }
    
    public StringProperty STUDENT_IMAGEProperty(){
    return STUDENT_IMAGE;
    }
    
    public void setSTUDENT_IMAGE(String STUDENT_IMAGE){
    this.STUDENT_IMAGE.set(STUDENT_IMAGE);
    }
    
    public String getPART_IMAGE(){
    return PART_IMAGE.get();
    }
    
    public StringProperty PART_IMAGEProperty(){
    return PART_IMAGE;
    }
    
    public void setPART_IMAGE(String PART_IMAGE){
    this.PART_IMAGE.set(PART_IMAGE);
    }
    
    
    
    
    
}
