public class Rover
{
	private int xcoordinate;
	private int ycoordinate;
	private String direction;

	Rover(int xcoordinate, int ycoordinate, String direction)
	{
		this.xcoordinate = xcoordinate;
		this.ycoordinate = ycoordinate;
		this.direction = direction;
	}

	int getXcoordinate()
	{
		return this.xcoordinate;
	}

	int getYcoordinate()
	{
		return this.ycoordinate;
	}

	String getDirection()
	{
		return this.direction;
	}

	void setXcoordinate(int xcoordinate)
	{
		this.xcoordinate = xcoordinate;
	}

	void setYcoordinate(int ycoordinate)
	{
		this.ycoordinate = ycoordinate;
	}

	void setDirection(String direction)
	{
		this.direction = direction;
	}
}
