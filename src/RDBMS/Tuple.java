package RDBMS;

import java.util.Vector;

public class Tuple {
    private Vector<Attribute> attributes;

    Tuple(Vector<Attribute> attributes) {
        this.attributes = attributes;
    }
    Tuple(int numAttributes) {

    }
}
