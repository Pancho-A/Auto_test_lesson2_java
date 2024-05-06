package org.max.home;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainerTest {
    @Test
    void GetCountOneContainer(){
        Container container = new Container();
        container.addElement(new Element(10));
        container.addElement(new Element(10));
        container.addElement(new Element(10));
        int result = container.getCount();
        Assertions.assertEquals(30, result);
    }

    @Test
    void GetCountAllContainer(){
        Container container1 = new Container();
        Container container2 = new Container();
        Container container3 = new Container();

        container1.addElement(new Element(10));
        container1.addElement(new Element(10));

        container2.addElement(new Element(100));
        container2.addElement(container1);

        container3.addElement(container1);
        container3.addElement(container2);

        int result = container3.getCount();
        Assertions.assertEquals(140, result);
    }

    @Test
    void GetCountContainerRemoveElement(){
        Container container1 = new Container();
        Container container2 = new Container();
        Container container3 = new Container();

        container1.addElement(new Element(10));
        container1.addElement(new Element(10));

        container2.addElement(new Element(100));
        container2.addElement(container1);
        container2.addElement(new Element(30));

        container3.addElement(container1);
        container3.addElement(container2);

        container2.removeElement(0);


        int result = container3.getCount();
        Assertions.assertEquals(70, result);
    }
}
