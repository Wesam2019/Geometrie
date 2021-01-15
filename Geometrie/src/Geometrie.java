import javax.swing.JOptionPane;
import java.lang.Math;

public class Geometrie {
	public static double x;
	public static double y;
	public static double z;

	public static void main(String[] args) {
		String operation = JOptionPane.showInputDialog("V=Volume,SR=Surface");
		if (operation.equals("V")) {
			volume(x, y, z);
		} else if (operation.equals("SR")) {
			surface(x, y, z);
		}
	}

	public static double volume(double x, double y, double z) {
		String type = JOptionPane.showInputDialog("SP=Sphere,CU=Cube,CB=Cuboid,CO=Cone,CY=Cylinder ");
		switch (type) {

		case "SP":
			x = Double.parseDouble(JOptionPane.showInputDialog("Input Radius of the Sphere in cm"));
			double volumeSphere = 4.0 * (Math.PI) * Math.pow(x, 2.0) * (x / 3.0);
			JOptionPane.showMessageDialog(null, volumeSphere, " = Volume of the Sphere",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case "CU":
		case "CB":
			x = Double.parseDouble(JOptionPane.showInputDialog("Input side a of the cube in cm"));
			y = Double.parseDouble(JOptionPane.showInputDialog("Input side b of the cube in cm"));
			z = Double.parseDouble(JOptionPane.showInputDialog("Input side c of the cube in cm"));
			double volumeCube = x * y * z;
			JOptionPane.showMessageDialog(null, volumeCube, " = Volume of the Cube", JOptionPane.INFORMATION_MESSAGE);
			break;

		case "CO":
			x = Double.parseDouble(JOptionPane.showInputDialog("Input radius  of the cone in cm"));
			y = Double.parseDouble(JOptionPane.showInputDialog("Input height of the cone in cm"));
			double volumeCone = (1.0 / 3.0) * (Math.PI) * Math.pow(x, 2.0) * y;
			JOptionPane.showMessageDialog(null, volumeCone, " = Volume of the Cone", JOptionPane.INFORMATION_MESSAGE);
			break;

		case "CY":
			x = Double.parseDouble(JOptionPane.showInputDialog("Input radius  of the cylinder in cm"));
			y = Double.parseDouble(JOptionPane.showInputDialog("Input height of the cylinder in cm"));
			double volumeCylinder = (Math.PI) * Math.pow(x, 2.0) * y;
			JOptionPane.showMessageDialog(null, volumeCylinder, " = Volume of the Cylinder",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		default:
			JOptionPane.showMessageDialog(null, type, " = Unkown Figur !", JOptionPane.INFORMATION_MESSAGE);
			return 0;
		}
		return 0;
	}
    
	public static double surface(double x, double y, double z) {
		String type = JOptionPane.showInputDialog("SP=Sphere,CU=Cube,CB=Cuboid,CO=Cone,CY=Cylinder ");
		switch (type) {

		case "SP":
			x = Double.parseDouble(JOptionPane.showInputDialog("Input Radius of the Sphere in cm"));
			double surfaceSphere = 4.0 * (Math.PI) * Math.pow(x, 2.0) ;
			JOptionPane.showMessageDialog(null, surfaceSphere, " = Surface of the Sphere",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		case "CU":
		case "CB":
			x = Double.parseDouble(JOptionPane.showInputDialog("Input side a of the cube in cm"));
			y = Double.parseDouble(JOptionPane.showInputDialog("Input side b of the cube in cm"));
			z = Double.parseDouble(JOptionPane.showInputDialog("Input side c of the cube in cm"));
			double surfaceCube = 2.0 *((x * y) + (x * z) + (y*z));
			JOptionPane.showMessageDialog(null, surfaceCube, " = Surface of the Cube", JOptionPane.INFORMATION_MESSAGE);
			break;

		case "CO":
			x = Double.parseDouble(JOptionPane.showInputDialog("Input radius  of the cone in cm"));
			y = Double.parseDouble(JOptionPane.showInputDialog("Input height of the cone in cm"));
			double surfaceCone =  ((Math.PI) * Math.pow(x, 2.0)) + (Math.PI * x * y);
			JOptionPane.showMessageDialog(null, surfaceCone, " = Surface of the Cone", JOptionPane.INFORMATION_MESSAGE);
			break;

		case "CY":
			x = Double.parseDouble(JOptionPane.showInputDialog("Input radius  of the cylinder in cm"));
			y = Double.parseDouble(JOptionPane.showInputDialog("Input height of the cylinder in cm"));
			double surfaceCylinder = (2.0 *(Math.PI) * Math.pow(x, 2.0)) + (2.0 *( Math.PI) * x* y);
			JOptionPane.showMessageDialog(null, surfaceCylinder, " = Surface of the Cylinder",
					JOptionPane.INFORMATION_MESSAGE);
			break;

		default:
			JOptionPane.showMessageDialog(null, type, " = Unkown Figur !", JOptionPane.INFORMATION_MESSAGE);
			return 0;
		}
		return 0;
	}
}
