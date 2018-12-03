package game.backend.element;

import game.backend.move.Direction;


/* Las clases HorizontalStriped, VerticalStriped y Wrapped se comportan de manera muy similar. Crearía clases abstractas por cuestion de estilo*/

public class WrappedCandy extends Candy {
	
	private Direction[] explosion = new Direction[4];
	
	public WrappedCandy() {
		explosion[0] = Direction.LEFT;
		explosion[1] = Direction.RIGHT;
		explosion[2] = Direction.UP;
		explosion[3] = Direction.DOWN;
	}

	@Override
	public String getKey() {
		return "WRAPPED-" + super.getKey();
	}
	
	@Override
	public String getFullKey() {
		return "WRAPPED-" + super.getFullKey();
	}
	
	@Override
	public Direction[] explode() {
		return explosion;
	}
	
	@Override
	public long getScore() {
		return 60;
	}

}
