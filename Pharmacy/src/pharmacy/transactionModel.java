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
public class transactionModel extends AbstractTableModel {

    public static final String[] columnNames = {"Product ID", "Bill ID", "QTY"};
    private ArrayList<transaction> transactions;

    transactionModel(ArrayList<transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public int getRowCount() {
        return transactions.size();
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
        transaction e = transactions.get(rowIndex);
        fireTableCellUpdated(rowIndex, columnIndex);
        switch (columnIndex) {
            case 0:
                return e.getProduct_id();
            case 1:
                return e.getBill_id();
            case 2:
                return e.getQty();
            default:
                return 0;
        }

    }
}
