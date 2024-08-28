package com.tvsmotor.client;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.tvsmotor.exception.IllegalIdException;
import com.tvsmotor.exception.InsufficientStockException;
import com.tvsmotor.exception.IllegalArgumentException;
import com.tvsmotor.model.Inventory;
import com.tvsmotor.model.Sales;
import com.tvsmotor.service.InventoryService;
import com.tvsmotor.service.SalesService;
import com.tvsmotor.service.InventorySalesService;
public class SalesAndInventoryApp
{
    public static void main(String[] args)
    {
        try
        {
            InventoryService inventoryService = new InventoryService();
            SalesService salesService = new SalesService();
            
            List<Inventory> inventorylist=new ArrayList<Inventory>();
            
            // Add Inventory items
            inventoryService.addStockDetails(new Inventory("item1", "NTorq", "Scooter", "2W", 125, 50, "Nalagarh", 160000.00, LocalDate.of(2024, 2, 10)));
            inventoryService.addStockDetails(new Inventory("item2", "Jupiter", "Scooter", "2W", 200, 60, "Hosur", 120000.00, LocalDate.of(2024, 3, 12)));
            inventoryService.addStockDetails(new Inventory("item3", "Apache", "Bike", "2W", 100, 40, "Mysuru", 180000.00, LocalDate.of(2024, 4, 15)));
            inventoryService.addStockDetails(new Inventory("item4", "XL100", "Scooter", "2W", 300, 80, "Nalagarh", 140000.00, LocalDate.of(2024, 5, 20)));
            inventoryService.addStockDetails(new Inventory("item5", "Radeon", "Scooter", "2W", 150, 50, "Hosur", 250000.00, LocalDate.of(2024, 6, 25)));
            inventoryService.addStockDetails(new Inventory("item6", "iQube", "Electric Scooter", "2W", 200, 70, "Mysuru", 230000.00, LocalDate.of(2024, 7, 30)));
            inventoryService.addStockDetails(new Inventory("item7", "BS6 Apache", "Bike", "2W", 175, 60, "Nalagarh", 220000.00, LocalDate.of(2024, 8, 15)));
            inventoryService.addStockDetails(new Inventory("item8", "Ntorq Race Edition", "Scooter", "2W", 120, 55, "Hosur", 170000.00, LocalDate.of(2024, 9, 10)));
            inventoryService.addStockDetails(new Inventory("item9", "Zepto", "Electric Scooter", "2W", 250, 90, "Mysuru", 300000.00, LocalDate.of(2024, 10, 20)));
            inventoryService.addStockDetails(new Inventory("item10", "Sport", "Scooter", "2W", 110, 45, "Nalagarh", 200000.00, LocalDate.of(2024, 11, 5)));
            inventoryService.addStockDetails(new Inventory("item11", "Victor", "Bike", "2W", 180, 65, "Hosur", 160000.00, LocalDate.of(2024, 12, 10)));
            inventoryService.addStockDetails(new Inventory("item12", "Apache RTR 200", "Bike", "2W", 300, 85, "Mysuru", 400000.00, LocalDate.of(2024, 1, 25)));
            inventoryService.addStockDetails(new Inventory("item13", "Jupiter Classic", "Scooter", "2W", 140, 50, "Nalagarh", 190000.00, LocalDate.of(2024, 2, 20)));
            inventoryService.addStockDetails(new Inventory("item14", "Ntorq 125", "Scooter", "2W", 220, 75, "Hosur", 270000.00, LocalDate.of(2024, 3, 10)));
            inventoryService.addStockDetails(new Inventory("item15", "Radeon", "Scooter", "2W", 130, 55, "Mysuru", 210000.00, LocalDate.of(2024, 4, 5)));
            
            
            inventorylist = inventoryService.viewAllItems();
            
            // Add Sales entries
            salesService.vehicleOrder(inventorylist, new Sales("dealer1", "Dealer A", "item1", LocalDate.of(2024, 8, 5), 10, 170000.00, LocalDate.of(2024, 8, 10), 5));
            salesService.vehicleOrder(inventorylist, new Sales("dealer2", "Dealer B", "item2", LocalDate.of(2024, 8, 7), 15, 130000.00, LocalDate.of(2024, 8, 12), 10));
            salesService.vehicleOrder(inventorylist, new Sales("dealer3", "Dealer C", "item3", LocalDate.of(2024, 8, 8), 5, 190000.00, LocalDate.of(2024, 8, 15), 5));
            salesService.vehicleOrder(inventorylist, new Sales("dealer4", "Dealer D", "item4", LocalDate.of(2024, 8, 10), 7, 130000.00, LocalDate.of(2024, 8, 18), 7));
            salesService.vehicleOrder(inventorylist, new Sales("dealer5", "Dealer E", "item5", LocalDate.of(2024, 8, 12), 20, 240000.00, LocalDate.of(2024, 8, 20), 8));
            salesService.vehicleOrder(inventorylist, new Sales("dealer6", "Dealer F", "item6", LocalDate.of(2024, 8, 15), 12, 220000.00, LocalDate.of(2024, 8, 25), 9));
            salesService.vehicleOrder(inventorylist, new Sales("dealer7", "Dealer G", "item7", LocalDate.of(2024, 8, 17), 9, 210000.00, LocalDate.of(2024, 8, 30), 6));
            salesService.vehicleOrder(inventorylist, new Sales("dealer8", "Dealer H", "item8", LocalDate.of(2024, 8, 20), 11, 160000.00, LocalDate.of(2024, 9, 5), 7));
            salesService.vehicleOrder(inventorylist, new Sales("dealer9", "Dealer I", "item9", LocalDate.of(2024, 8, 22), 8, 290000.00, LocalDate.of(2024, 9, 10), 10));
            salesService.vehicleOrder(inventorylist, new Sales("dealer10", "Dealer J", "item10", LocalDate.of(2024, 8, 25), 6, 190000.00, LocalDate.of(2024, 9, 15), 5));
           
            System.out.println("All Inventory Items:");
            inventoryService.viewAllItems().forEach(System.out::println);
            
            // Remove an Inventory Item
            inventoryService.removeStockDetails("item10");
            System.out.println("Removed Inventory item10 ");
            
            // View Items by Location
            System.out.println("\nInventory Items in Mysuru:");
            inventoryService.viewByLocation("Mysuru").forEach(System.out::println);
            
            // Sort Vehicles by Name and Code
            System.out.println("\nSorted Inventory Items:");
            inventoryService.sortVehicleByNameAndCode().forEach(System.out::println);
            
            // Display Vehicles by Price
            System.out.println("\nVehicles with Price >= 200000:");
            inventoryService.displayVehiclesByPrice(200000.00).forEach(System.out::println);
            
            // Update Item Location
            inventoryService.updateItemLocation("item2", "Mysuru");
            
            // Calculate Total Inventory Value
            System.out.println("\nTotal Inventory Value: " + inventoryService.calculateTotalInventoryValue());
            
            // View Items Near Expiry
            System.out.println("\nItems Near Expiry (30 days):");
            inventoryService.viewItemsNearExpiry(30).forEach(System.out::println);
            
            // Check Stock Availability
            boolean isStockAvailable = inventoryService.checkStockAvailability("item2");
            System.out.println("\nIs stock available for item2? " + isStockAvailable);
          
            //Stock Refill
            System.out.println("\nStock after refill for item2:");
            inventoryService.stockRefill("item2");
            inventoryService.viewAllItems().forEach(System.out::println);
            
            // Adjust Stock After Sale
            boolean stockAdjusted = inventoryService.adjustStockAfterSale("item2", 10);
            System.out.println("\nStock adjusted for item2: " + stockAdjusted);
          
           
            //Remove Dealer with dealercode: dealer1
            salesService.cancelOrder("dealer1");
          
            //Get Yearly Sales
            System.out.println("\n2024 Yearwise sales:");
            salesService.getYearlySales(2024).forEach(System.out::println);
           
            //Get Performance based on vehicle model     
            System.out.println("\nFilter by Dealercode (dealer2)");
            salesService.viewByDealers("dealer2").forEach(System.out::println);
          
            // Create InventorySalesService instance
            InventorySalesService inventorySalesService = new InventorySalesService(inventoryService.viewAllItems(), salesService.viewAllSales());
            
            // Call methods from InventorySalesService
            System.out.println("\nInventory Value After Sales: " + inventorySalesService.calculateInventoryValueAfterSales());
            System.out.println("Best Selling Item with Stock: " + inventorySalesService.bestSellingItemWithStock());
            System.out.println("Inventory Turnover Rate: " + inventorySalesService.inventoryTurnoverRate());
            System.out.println("Check performance(profit/loss) of itemcode item2:");
            boolean profloss=inventorySalesService.salesPerformance("item2");
            if(profloss == true) 
            {
                System.out.println("PROFIT");
            }    
            else 
            {
            	System.out.println("LOSS");
            }
        }
        catch(IllegalIdException e)
        {
            System.out.println(e.getMsg());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMsg());
        }
        catch(InsufficientStockException e)
        {
            System.out.println(e.getMsg());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}