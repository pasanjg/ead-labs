/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author chath
 */
@Stateless
public class PlateNumberManager {
    public String getDLCategory(String regnum){
        String dlcategory="Unknown Licence Category";
        switch(Character.toUpperCase(regnum.charAt(0))) {
            case 'C':
            case 'K':
            case 'P':
            case 'D':
                dlcategory="Light Vehicle";
                break;
            case 'L':
            case 'N':
                dlcategory="Heavy Vehicle";
                break;
            case 'M':
            case 'B':
                dlcategory="Motor Bicycle";
                break;
            case 'Y':
            case 'A':
                dlcategory="Three Wheeler";
                break;
        }
        return dlcategory;
    }
}
