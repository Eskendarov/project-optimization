package ru.eskendarov.sprite;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import ru.eskendarov.base.Sprite;
import ru.eskendarov.math.Rectangle;

public class Background extends Sprite {

    public Background(TextureRegion region) {
        super(region);
    }

    @Override
    public void resize(Rectangle worldBounce) {
        setHeigthProportion(worldBounce.getHeight());
        position.set(worldBounce.position);
    }

}
