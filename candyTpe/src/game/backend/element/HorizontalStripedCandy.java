package game.backend.element;

import game.backend.move.Direction;


/* Las clases HorizontalStriped, VerticalStriped y Wrapped se comportan de manera muy similar. Crearía clases abstractas por cuestion de estilo*/


public class HorizontalStripedCandy extends Candy {
	
	private Direction[] explosion = new Direction[2];
	
	public HorizontalStripedCandy() {
		explosion[0] = Direction.LEFT;
		explosion[1] = Direction.RIGHT;
	}
	
	@Override
	public String getKey() {
		return "HORIZ-STRIPED-" + super.getKey();
	}
	
	@Override
	public String getFullKey() {
		return "HORIZ-STRIPED-" + super.getFullKey();
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
