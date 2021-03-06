package diwan.fablab.gemals.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import gwel.game.entities.Avatar;

public class FoodGreen extends Food {

    public FoodGreen(World world, Vector2 position) {
        super();

        avatar = Avatar.fromFile(Gdx.files.internal("avatar/food_green.json"));
        avatar.scale(0.016f);
        avatar.scalePhysics(0.016f);

        buildBody(world, position, MathUtils.random(MathUtils.PI2));
        body.setUserData(this);
    }
}
