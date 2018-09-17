import javax.swing.JOptionPane;

public class MadLibs
{
	public static void main(String[] args)
	{
		String noun1, noun2, adjective, pastVerb;

		noun1 = JOptionPane.showInputDialog(null, "Please enter a noun:");
		noun2 = JOptionPane.showInputDialog(null, "Please enter another noun:");
		adjective = JOptionPane.showInputDialog(null, "Please enter an adjective:");
		pastVerb = JOptionPane.showInputDialog(null, "Please enter a past-tense verb:");

		JOptionPane.showMessageDialog(null, "Mary had a little " + noun1 + " \nIts " + noun2 + " was " + adjective + " as snow" + "\n and everywhere that Mary " + pastVerb + " \nthe " + noun1 + " was sure to go.");

	}
}