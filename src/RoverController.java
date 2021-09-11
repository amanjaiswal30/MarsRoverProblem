import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RoverController
{
	public static void main(String ar[])
	{
		try
		{
			String pathOfMovementInstructions = System.getProperty("user.dir") + "//src//movementInstructions";
			String pathOfFinalPosition = System.getProperty("user.dir") + "//src//finalPosition";
			File instructionManual = new File(pathOfMovementInstructions);
			File finalPositionRecorder = new File(pathOfFinalPosition);
			FileWriter writer = new FileWriter(finalPositionRecorder);
			PrintWriter printFile = new PrintWriter(writer);
			Scanner instructions = new Scanner(instructionManual);
			String[] dimensions = instructions.nextLine().split(" ");
			Plateau plateau = new Plateau(Integer.parseInt(dimensions[0]), Integer.parseInt(dimensions[1]));
			while (instructions.hasNext())
			{
				String[] initialPositionOfRover = instructions.nextLine().split(" ");
				Rover newRover = new Rover(Integer.parseInt(initialPositionOfRover[0]), Integer.parseInt(initialPositionOfRover[1]), initialPositionOfRover[2]);
				String commands = instructions.nextLine();
				Instructions movementInstructions = new Instructions();
				for (int i = 0; i < commands.length(); i++)
				{
					String command = Character.toString(commands.charAt(i));
					movementInstructions.runInstructions(plateau, newRover, command);
				}
				if (finalPositionRecorder.length()==0)
				{
					printFile.println("Final Position of Rover: " + newRover.getXcoordinate() + " " + newRover.getYcoordinate() + " " + newRover.getDirection());
				}
			}
			instructions.close();
			printFile.close();
			writer.close();
		}
		catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e){
			System.out.println(e.getMessage());
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
