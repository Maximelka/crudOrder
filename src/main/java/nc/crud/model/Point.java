package nc.crud.model;

import lombok.Getter;
import lombok.Setter;

public class Point {

    @Getter
    @Setter
    private float longitude;

    @Getter
    @Setter
    private float width;

    public Point(float longitude, float width) {
        this.longitude = longitude;
        this.width = width;
    }
}
