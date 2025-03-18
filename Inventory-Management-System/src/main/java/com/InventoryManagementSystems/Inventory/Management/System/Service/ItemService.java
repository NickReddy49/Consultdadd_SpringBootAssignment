package com.InventoryManagementSystems.Inventory.Management.System.Service;


import com.InventoryManagementSystems.Inventory.Management.System.Repository.ItemRepository;
import com.InventoryManagementSystems.Inventory.Management.System.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
     @Autowired
     private ItemRepository itemRepository;

     public List<Item> getallItems() {
         return itemRepository.findAll();
     }

     public Optional<Item> getItembyID(int id) {
         return itemRepository.findById(id);
     }

     public Item saveItem(Item item) {
         return itemRepository.save(item);
     }

     public void deleteItem(int id) {
         itemRepository.deleteById(id);
     }

     public void deleteAll() {
         itemRepository.deleteAll();
     }

     public Item updateItemQuantity(Item item) {
         Item it = itemRepository.getById(item.getId());
         it.setQuantity(item.getQuantity());
         return itemRepository.save(it);
     }

    public Item updateItementity(int id , Item item) {
        Item it = itemRepository.getById(id);
        it.setName(item.getName());
        it.setDescription(item.getDescription());
        it.setQuantity(item.getQuantity());
        it.setId(item.getId());
        return itemRepository.save(it);
    }



}
