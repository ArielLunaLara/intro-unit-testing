package objetos.parcial3.intro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RectangleTestTest {
    //Runner -> JUnit -> Ejecuta y valida
    //Framework
    // Library -> Bibliotecas

    //Coverage

    @Test
    public void testArea(){
        //incializacion

        Rectangle rectangle = new Rectangle(10,5);

        //Ejecucion
        double area = rectangle.getArea();

        //Validacion
        Assertions.assertEquals(50.0, area);
        Assertions.assertEquals(10, rectangle.getBase());
        Assertions.assertEquals(5, rectangle.getHeight());
    }

    @Test
    public void testPerimeter(){
        //Inicializacion
        Rectangle rectangle = new Rectangle(10,5);

        //Ejecucion
        double perimeter = rectangle.getPerimeter();

        //Validacion
        Assertions.assertEquals(30.0,perimeter);
    }


    @Test
    void getBase() {
    }

    @Test
    void getHeight() {
    }

    @Test
    void getArea() {
    }

    @Test
    void getPerimeter() {
    }
}