/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author
 * Khaled Mohamed
 * Ihab Mohamed
 * Mohamed Zakaria
 * MUST University 2018
 *
 */

////////////////////////////////////////////
public class EmailD extends AbstractTableModel {
    public static final String[] columnNames = {"Email", "Username", "Phone", "Sex", "Approved"};
    private ArrayList<Employee> employees;
    EmailD(ArrayList<Employee> employees){
        this.employees = employees;
    }
    @Override
    public int getRowCount() {
        return employees.size();
    }
    @Override
    public String getColumnName(int column) {
    return columnNames[column];
    }
    @Override
    public int getColumnCount() {
          return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee e = employees.get(rowIndex);
        switch(columnIndex){
            case 0:
                return e.getEmail();
            case 1:
                return e.getUsername();
            case 2:
                return e.getMobile();
            case 3:
                return e.getSex();
            case 4:
                if(e.isApproved()) return "True"; else return "False";
            default:
                return 0;
        }
    }
    
}
