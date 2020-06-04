package by.pvt.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZooCreatorTest {

    @Test
    public void testZoo() {
        Zoo zoo = new ZooCreator().createNewZoo();
        assertEquals("Central", zoo.getName());
        assertEquals("Sharik", zoo.getDog().getName());
        assertEquals(8, zoo.getDog().getAge());
        assertEquals("Vaska", zoo.getCat().getName());
        assertEquals(3, zoo.getCat().getAge());
    }

}
