package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String funk = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			funk = funk + "" + s.charAt(i);
		}
		return funk;
	}

}
