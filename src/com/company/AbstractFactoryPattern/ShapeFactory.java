package com.company.AbstractFactoryPattern;

import com.company.AbstractFactoryPattern.ProductFamilies.*;

public class ShapeFactory extends AbstractFactory<Shape, ShapeType> {
    @Override
    Shape getItem(ShapeType type) {
        return switch (type) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
