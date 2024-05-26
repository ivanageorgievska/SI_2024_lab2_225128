import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<Item> items(Item... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void checkEveryBranch() {
        RuntimeException exception;
        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 1));
        assertTrue(exception.getMessage().contains("allItems ne moze da bide null"));

        assertTrue(SILab2.checkCart(new ArrayList<Item>(), 0));

        assertFalse(SILab2.checkCart(new ArrayList<Item>(), -1));

        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items(new Item("", null, 100, 0.1f)), 100));
        assertTrue(exception.getMessage().contains("Nema barcod!"));

        assertFalse(SILab2.checkCart(items(new Item("", "012345", 340, 0.1f)), 100));

        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items(new Item("Item1", "12345a", 100, 0.1f)), 1));
        assertTrue(exception.getMessage().contains("Netocen karakter vo  barcod"));

        assertFalse(SILab2.checkCart(items(new Item("Item1", "12345", 100, -1)), 100));
    }
    @Test
    void checkMultipleConditions(){
        assertFalse(SILab2.checkCart(items(new Item("", "12345", 340, 0.2f)),2));
        assertFalse(SILab2.checkCart(items(new Item("", "12345", 340, 0f)),2));
        assertTrue(SILab2.checkCart(items(new Item("", "01234", 340, 0.2f)),300));
        assertFalse(SILab2.checkCart(items(new Item("", "01234", 100, 0.2f)),2));
    }
}