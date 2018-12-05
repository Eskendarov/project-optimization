package ru.eskendarov.sprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector2;

import ru.eskendarov.base.Sprite;
import ru.eskendarov.math.Rectangle;

public class ExitButton extends Sprite {

    private Rectangle worldBounds;

    public ExitButton(TextureAtlas atlas) {
        super(atlas.findRegion("btExit"));
        setHeigthProportion(0.17f);
    }

    @Override
    public void resize(Rectangle worldBounce) {
        super.resize(worldBounce);
        this.worldBounds = worldBounce;
        position.set(0.2f, -0.34f);
    }

    @Override
    public void update(float delta) { super.update(delta); }

    @Override
    public boolean touchDown(Vector2 touch, int pointer) {
        setHeigthProportion(0.15f);
        return super.touchDown(touch, pointer);
    }

    @Override
    public boolean touchUp(Vector2 touch, int pointer) {
        if (checkInForm(touch)) Gdx.app.exit();
        return super.touchUp(touch, pointer);
    }

    private boolean checkInForm(Vector2 touch) {
        if (touch.x >= 290 && touch.x <= 400 && touch.y >= 40 && touch.y <= 155) return true;
        return false;
    }

}
