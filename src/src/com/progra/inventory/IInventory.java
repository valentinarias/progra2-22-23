package src.com.progra.inventory;

import com.progra.inventory.exceptions.FullStorageException;

import java.util.ArrayList;

public interface IInventory {

    public void setItem(String val) throws FullStorageException;
    public ArrayList<String> getItems();
}
