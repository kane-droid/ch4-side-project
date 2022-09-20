package spring.game;

import org.junit.jupiter.api.Test;
import spring.game.Items.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
    @Test
    public void createitem(){
        Item item = new Item("Sword of a Thousand Truths","Kick Ass sword");
        assertEquals("Sword of a Thousand Truths",item.getName());
        assertEquals("Kick Ass sword", item.getDescription());
        item.setDescription("The best sword in some situations");
        item.setAttackModifier(1);
        item.setDefenseModifier(3);
        item.setHealthModifier(50);
        item.setName("Sword of a thousand half truths");
        assertEquals(1,item.getAttackModifier());
        assertEquals(3,item.getDefenseModifier());
        assertEquals(50,item.getHealthModifier());
        assertEquals("The best sword in some situations",item.getDescription());
        assertEquals("Sword of a thousand half truths",item.getName());

    }
}
