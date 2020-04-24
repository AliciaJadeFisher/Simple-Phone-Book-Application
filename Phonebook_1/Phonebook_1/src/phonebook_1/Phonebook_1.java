/*
 * Phonebook
 * An application that allows users to view, search 
 * and add entries to the phonebook
 */
package phonebook_1;

import java.util.ArrayList;

/**
 *
 * @author s6040531
 */
public class Phonebook_1 
{
    // ArrayList that contains a collection of hash maps (each containing a single phonebook record)
    static ArrayList<PB_record> phoneBook = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Calls initPhonebook()
        initPhonebook();
        
        // Creates and displays the main UI
        UI_Main ui = new UI_Main(phoneBook);
        ui.setVisible(true);
    }
    
    /**
     * Method for initiating the phone book
     * Inserts three entries into the phone book
     */
    public static void initPhonebook()
    {
        // Creates a new PB_record object and saves the record details
        PB_record entry1 = new PB_record("John", "Marks", "07865754311");
        phoneBook.add(entry1);
        
        // Creates a new PB_record object and saves the record details
        PB_record entry2 = new PB_record("Mary", "Smith", "07876541234");
        phoneBook.add(entry2);
        
        // Creates a new PB_record object and saves the record details
        PB_record entry3 = new PB_record("Richard", "Parker", "07987675412");
        phoneBook.add(entry3);
    }
}