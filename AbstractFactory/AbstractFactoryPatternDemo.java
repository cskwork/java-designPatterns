package AbstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //Non-round shape
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape rect = shapeFactory.getShape("RECTANGLE");
        rect.draw();
        Shape sqr = shapeFactory.getShape("SQUARE");
        sqr.draw();

        //Round Shape
        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
        Shape roundRect = shapeFactory2.getShape("RECTANGLE");
        roundRect.draw();
        Shape roundSqr = shapeFactory2.getShape("SQUARE");
        roundSqr.draw();
    }
}