
package school.management.ui.staff;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class StaffData {
    
    //instance varable
    private final StringProperty USER_ID;
    private final StringProperty FIRST_NAME;
    private final StringProperty SURNAME;
    private final StringProperty DOB;
    private final StringProperty DATE_OF_REG;
    private final StringProperty GENDER;
    private final StringProperty RELIGION;
    private final StringProperty EMAIL;
    private final StringProperty PHONE_CONTACT;
    private final StringProperty NATIONALITY;
    private final StringProperty LGA;
    private final StringProperty HOME_ADD;
    private final StringProperty CLASS;
    private final StringProperty DISABILITY;
    private final StringProperty PHOTO;   
    private final StringProperty PREVILAGE;
    private final StringProperty SUBJECTS;
    private final StringProperty QUALIFICATION;
    private final StringProperty MARITAL_STATUS;
    private final StringProperty STATE;
    
    
    //constructor
    public StaffData(String USERID, String fName,  String surname, String dob, String email, String contact,  String disability, String date_of_reg, String lga, String photo, String nationality, String religion, String gender, String home_add, String clas,String marital_status, String previlage,String subjects, String qualification, String stat )
    {
    
        
        
    this.USER_ID = new SimpleStringProperty(USERID);
    this.FIRST_NAME =  new SimpleStringProperty(fName);
    this.SURNAME =  new SimpleStringProperty(surname);
    this.DOB =  new SimpleStringProperty(dob);
    this.EMAIL =  new SimpleStringProperty(email);
    this.PHONE_CONTACT =  new SimpleStringProperty(contact);
    this.DISABILITY =  new SimpleStringProperty(disability);
    this.DATE_OF_REG=  new SimpleStringProperty(date_of_reg);
    this.LGA =  new SimpleStringProperty(lga);
    this.PHOTO =  new SimpleStringProperty(photo);
    this.NATIONALITY =  new SimpleStringProperty(nationality);
    this.RELIGION =  new SimpleStringProperty(religion);
    this.GENDER =  new SimpleStringProperty(gender);
    this.HOME_ADD =  new SimpleStringProperty(home_add);
    this.CLASS =  new SimpleStringProperty(clas);
    this.PREVILAGE =  new SimpleStringProperty(previlage);
    this.SUBJECTS = new SimpleStringProperty(subjects);
    this.QUALIFICATION = new SimpleStringProperty(qualification);
    this.MARITAL_STATUS = new SimpleStringProperty(marital_status);
    this.STATE  = new SimpleStringProperty(stat);
    }
   
    public String getUSER_ID(){
    return USER_ID.get();
    }
    
    public StringProperty USER_IDProperty(){
    return USER_ID;
    }
    
    public void setUSER_ID(String USER_ID){
    this.USER_ID.set(USER_ID);
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
    
     public String getPREVILAGE(){
    return PREVILAGE.get();
    }
    
    public StringProperty PREVILAGEProperty(){
    return PREVILAGE;
    }
    
    public void setPREVILAGE(String PREVILAGE){
    this.PREVILAGE.set(PREVILAGE);
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
    
    
    public String getDATE_OF_REG(){
    return DATE_OF_REG.get();
    }
    
    public StringProperty DATE_OF_REGProperty(){
    return DATE_OF_REG;
    }
    
    public void setDATE_OF_REG(String DATE_OF_REG){
    this.DATE_OF_REG.set(DATE_OF_REG);
    }
    
    
    public String getGENDER(){
    return GENDER.get();
    }
    
    public StringProperty GENDERProperty(){
    return GENDER;
    }
    
    public void setGENDER(String GENDER){
    this.GENDER.set(GENDER);
    }
     
    public String getRELIGION(){
    return RELIGION.get();
    }
    
    public StringProperty RELIGIONProperty(){
    return RELIGION;
    }
    
    public void setRELIGION(String RELIGION){
    this.RELIGION.set(RELIGION);
    }
    
    public String getNATIONALITY(){
    return NATIONALITY.get();
    }
    
    public StringProperty NATIONALITYProperty(){
    return NATIONALITY;
    }
    
    public void setNATIONALITY(String NATIONALITY){
    this.NATIONALITY.set(NATIONALITY);
    }
    
    public String getSUBJECTS(){
    return SUBJECTS.get();
    }
    
    public StringProperty SUBJECTSProperty(){
    return SUBJECTS;
    }
    
    public void setSUBJECTS(String SUBJECTS){
    this.SUBJECTS.set(SUBJECTS);
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
    
    public String getDISABILITY(){
    return DISABILITY.get();
    }
    
    public StringProperty DISABILITYProperty(){
    return DISABILITY;
    }
    
    public void setDISABILITY(String DISABILITY){
    this.DISABILITY.set(DISABILITY);
    }
    
    public String getQUALIFICATION(){
    return QUALIFICATION.get();
    }
    
    public StringProperty QUALIFICATIONProperty(){
    return QUALIFICATION;
    }
    
    public void setQUALIFICATION(String QUALIFICATION){
    this.QUALIFICATION.set(QUALIFICATION);
    }
    
     public String getPHONE_CONTACT(){
    return PHONE_CONTACT.get();
    }
    
    public StringProperty PHONE_CONTACTProperty(){
    return PHONE_CONTACT;
    }
    
    public void setPHONE_CONTACT(String PHONE_CONTACT){
    this.PHONE_CONTACT.set(PHONE_CONTACT);
    }
    
    
    public String getMARITAL_STATUS(){
    return MARITAL_STATUS.get();
    }
    
    public StringProperty MARITAL_STATUSProperty(){
    return MARITAL_STATUS;
    }
    
    public void setMARITAL_STATUS(String MARITAL_STATUS){
    this.MARITAL_STATUS.set(MARITAL_STATUS);
    }
    
    public String getPHOTO(){
    return PHOTO.get();
    }
    
    public StringProperty PHOTOProperty(){
    return PHOTO;
    }
    
    public void setPHOTO(String PHOTO){
    this.PHOTO.set(PHOTO);
    }
    
     public String getSTATE(){
    return STATE.get();
    }
    
    public StringProperty STATEProperty(){
    return STATE;
    }
    
    public void setSTATE(String STATE){
    this.STATE.set(STATE);
    }
    
    
    
    
    
    
    
    
}
