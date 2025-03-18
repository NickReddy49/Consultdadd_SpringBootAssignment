package com.InventoryManagementSystems.Inventory.Management.System.Controller;

import com.InventoryManagementSystems.Inventory.Management.System.Service.ItemService;
import com.InventoryManagementSystems.Inventory.Management.System.model.Item;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
@Validated
public class ItemController {

    @Autowired
    public ItemService itemService;

    @GetMapping("/getItems")
   List<Item> getAllItems(){
       return itemService.getallItems();
   }

   @GetMapping("/getItem/{id}")
    public Optional<Item> getItemById(@PathVariable int id) {
        return itemService.getItembyID(id);
   }

   @PostMapping("/addItem")
    public Item saveitem(@Valid @RequestBody Item item) {
        return itemService.saveItem(item);
   }

   @PutMapping("/updateItemQuantity")
    public Item updateitem(@Valid @RequestBody Item item) {
        return itemService.updateItemQuantity(item);
   }

   @PutMapping("/udateItemById/{id}")
    public Item updatewholeItem(@PathVariable int id, @Valid @RequestBody Item item) {
        return itemService.updateItementity(id,item);
   }

   @DeleteMapping("/deleteById/{id}")
    public void deleteItembyid(@PathVariable int id) {
        itemService.deleteItem(id);
   }

   @DeleteMapping("/deleteAllItems")
    public void deleteallitems() {
        itemService.deleteAll();
   }

}
