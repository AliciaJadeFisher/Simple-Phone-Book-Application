/*
 * Model class used to represent a single record in the phone book
 */
package phonebook_1;

class PB_record 
{
    /**
     * Attributes of PB_record
     */
    private String fName;
    private String sName;
    private String number;
    
    /**
     * Empty constructor
     */
    PB_record(){}
    
    /**
     * Main constructor
     * @param na
     * @param nu 
     */
    PB_record(String fn, String sn,String nu)
    {
        fName = fn;
        sName = sn;
        number = nu;
    }
    
    /**
     * Retrieves the first name of the record
     * @return fName
     */
    String getfName()
    {
        return fName;
    }
    
    /**
     * Retrieves the surname of the record
     * @return sName
     */
    String getsName()
    {
        return sName;
    }
    
    /**
     * Retrieves the number of the record
     * @return number
     */
    String getNumber()
    {
        return number;
    }
}