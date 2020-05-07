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
/////////////////////////////////////////////////////////////////////////
public class productsModel extends AbstractTableModel {
    public static final String[] columnNames = {"ID", "Name", "Price", "Expiration", "QTY"};
    private ArrayList<Product> products;
    productsModel(ArrayList<Product> products){
        this.products = products;
    }
    @Override
    public int getRowCount() {
        return products.size();
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
        Product e = products.get(rowIndex);
         fireTableCellUpdated(rowIndex, columnIndex);
        switch(columnIndex){
            case 0:
                return e.getProduct_id();
            case 1:
                return e.getName();
            case 2:
                return e.getPrice();
            case 3:
                return e.getExpiration();
            case 4:
                return e.getQty();
            default:
                return 0;
        }
       
    }
    
}
