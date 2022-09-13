package spring.game;

import org.junit.jupiter.api.Test;
import spring.game.Entities.Entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityTest {
    @Test
    public void CreateEntity(){
        Entity test = new Entity("Action-Jackson","description",100,5,20);
        assertEquals("description",test.getDescription());
        assertEquals(100,test.getHealth());
        assertEquals(5,test.getAttack());
        assertEquals(20,test.getDefense());
        assertEquals("Action-Jackson", test.getName());
    }
    @Test
    public void SetValuesOnEntity(){
        Entity test = new Entity("Adam","description",100,5,20);
        test.setDescription("test");
        assertEquals("test",test.getDescription());
        test.setHealth(5);
        assertEquals(5,test.getHealth());
        test.setAttack(999);
        assertEquals(999,test.getAttack());
        test.setDefense(44);
        assertEquals(44,test.getDefense());
        test.setName("Ray");
        assertEquals("Ray",test.getName());
    }
}
