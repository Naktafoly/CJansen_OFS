/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Viewmodels;

import Dal.Addressbook;
import java.util.List;

/**
 *
 * @author School
 */
public class ViewModelNamen {
    
    private List<Addressbook> contacten;
    
    public ViewModelNamen(List<Addressbook> addressbook) {
        this.contacten = addressbook;
    }
    
    public List<Addressbook> getContacten(){
        return contacten;
    }
    
    public void setContacten(List<Addressbook> addressbook){
        this.contacten = addressbook;
    }
    
}
