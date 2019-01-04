/*
Elizabeth Endri
9/13/2018
Project 02 

This Java program will ask the user to input height and width of a rectangle and 
will display perimeter, and area of that rectangle. It will also calculate area and perimeter of a bounded ellipse with  user inputs.
*/

import javax.swing.JOptionPane;

public class Project02 {
	public static void main(String [] args)
	{
		String input;
				
		//Enter width and height of rectangle (using positive numbers)
		input = JOptionPane.showInputDialog("Please enter rectangle height (positive number): ");
		double height = Double.parseDouble(input);	
		input = JOptionPane.showInputDialog("Please enter rectangle width (positive number): ");
		double width = Double.parseDouble(input);		
		
		
		// Calculate area of the rectangle 
		double recPerimeter;
		recPerimeter = 2*(width) + 2*(height);
		
		
		// Calculate area of rectangle
		
		double recArea;
		recArea = (width)*(height);
		
		
		
		//Ask for width and height of ellipse (using positive numbers)
		
		input = JOptionPane.showInputDialog("Please enter ellipse height (positive number): ");
		double ellipseHeight = Double.parseDouble(input);	
		input = JOptionPane.showInputDialog("Please enter ellipse width (positive number): ");
		double ellipseWidth = Double.parseDouble(input);		
		
		
		
		// Calculate the height, width, perimeter and area of bounded ellipse
				
	
		double a = (ellipseWidth/2);   //ellipse major axis
		double b = (ellipseHeight/2);   //ellipse minor axis 
		
		
		
		double ellipsePeri = Math.PI*(3*(a+b)-(Math.sqrt((3*a+b)*(a+3*b)))); 
		double ellipseArea = ((Math.PI)*(a*b));
		
		
		
		//report information you calculated using a message dialog box
		
		JOptionPane.showMessageDialog(null, "Project02 CSC 229" +"\n"+
			    "___________________________ "+"\n"+
			    "Rectangle Properties" +"\n"+
			    "___________________________" +"\n"+
			    "Height =  "+height+"\n"+
			    "Width =  "+width+"\n"+
			    "Perimeter =  "+recPerimeter+"\n"+
			    "Area = "+recArea+"\n"+
			    "___________________________" +"\n"+
			    "Bounded Ellipse Properties" +"\n"+
			    "___________________________" +"\n"+
			    "Height = "+ellipseHeight+"\n"+
			    "Width =  "+ellipseWidth+"\n"+
			    "Perimeter = " +ellipsePeri+"\n"+
			    "Area = "+ellipseArea+"\n"+
			    "___________________________" +"\n"
			    
			    
			  
                
		);
		
		
	}
}
