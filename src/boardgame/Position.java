package boardgame;

public class Position {
	private int row;
	private int colun;
	
	public Position(int row, int colun) {
		setColun(colun);
		setRow(row);
	}
	public Position() {
	}
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColun() {
		return colun;
	}

	public void setColun(int colun) {
		this.colun = colun;
	}
	@Override
	public String toString() {
		return row + "," + colun;
	}
	
}
