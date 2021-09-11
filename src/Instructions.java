public class Instructions
{
	void runInstructions(Plateau plateau, Rover rover, String command)
	{
		try
		{
			if(plateau==null || rover==null || command==null) {
				throw new NullPointerException();
			}
			else
			{
				switch (command)
				{
					case "L":
						if (rover.getDirection().equals("N"))
						{
							rover.setDirection("W");
						}
						else if (rover.getDirection().equals("S"))
						{
							rover.setDirection("E");
						}
						else if (rover.getDirection().equals("W"))
						{
							rover.setDirection("S");
						}
						else if (rover.getDirection().equals("E"))
						{
							rover.setDirection("N");
						}
						else
						{
							throw new IllegalArgumentException();
						}
						break;
					case "R":
						if (rover.getDirection().equals("N"))
						{
							rover.setDirection("E");
						}
						else if (rover.getDirection().equals("S"))
						{
							rover.setDirection("W");
						}
						else if (rover.getDirection().equals("E"))
						{
							rover.setDirection("S");
						}
						else if (rover.getDirection().equals("W"))
						{
							rover.setDirection("N");
						}
						else
						{
							throw new IllegalArgumentException();
						}
						break;
					case "M":
						if (rover.getYcoordinate() == plateau.getLength() && rover.getDirection().equals("N"))
						{
							throw new RoverMovementException("Rover is at topmost boundary");
						}
						else if (rover.getXcoordinate() == plateau.getBreadth() && rover.getDirection().equals("E"))
						{
							throw new RoverMovementException("Rover is at rightmost boundary");
						}
						else if (rover.getYcoordinate() == 0 && rover.getDirection().equals("S"))
						{
							throw new RoverMovementException("Rover is at bottommost boundary");
						}
						else if (rover.getXcoordinate() == 0 && rover.getDirection().equals("W"))
						{
							throw new RoverMovementException("Rover is at leftmost boundary");
						}
						else if (rover.getDirection().equals("N"))
						{
							rover.setYcoordinate(rover.getYcoordinate() + 1);
						}
						else if (rover.getDirection().equals("S"))
						{
							rover.setYcoordinate(rover.getYcoordinate() - 1);
						}
						else if (rover.getDirection().equals("W"))
						{
							rover.setXcoordinate(rover.getXcoordinate() - 1);
						}
						else if (rover.getDirection().equals("E"))
						{
							rover.setXcoordinate(rover.getXcoordinate() + 1);
						}
						else
						{
							throw new IllegalArgumentException();
						}
						break;
					default:
						//do nothing
						break;
				}
			}
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		catch (RoverMovementException e) {
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
