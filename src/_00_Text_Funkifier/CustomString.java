package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String funk = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				funk += Character.toLowerCase(s.charAt(i));
			} else {
				funk += Character.toUpperCase(s.charAt(i));
			}
		}
		return funk;
	}

}
