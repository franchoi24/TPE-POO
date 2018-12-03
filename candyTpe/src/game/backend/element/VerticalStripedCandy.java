package game.backend.element;

import game.backend.move.Direction;


/* Las clases HorizontalStriped, VerticalStriped y Wrapped se comportan de manera muy similar. Crearía clases abstractas por cuestion de estilo*/

public class VerticalStripedCandy extends Candy {
	
	private Direction[] explosion = new Direction[2];
	
	public VerticalStripedCandy() {
		explosion[0] = Direction.DOWN;
		explosion[1] = Direction.UP;
	}
	
	@Override
	public String getKey() {
		return "VERT-STRIPED-" + super.getKey();
	}
	
	@Override
	public String getFullKey() {
		return "VERT-STRIPED-" + super.getFullKey();
	}
	
	@Override
	public Direction[] explode() {
		return explosion;
	}
	
	@Override
	public long getScore() {
		return 80;
	}

}
