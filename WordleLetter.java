public class WordleLetter {

	// TODO - implement according to spec
	private String color = "";
	private char letter;

	// TODO - include the below code back in once rest of class is implemented.
	public WordleLetter(char letterIn){
		this.letter = letterIn;
	}

	public char getLetter() {
        return this.letter;
    }

	public void setColor(String colorIn){
		if(colorIn.equals("green")|colorIn.equals("yellow")|colorIn.equals("red")) {
			this.color=colorIn;
		}
	}

	public boolean isColorSet(){
		if(this.color.equals("green") || this.color.equals("yellow") || this.color.equals("red")){
			return true;
		}else{
			return false;
		}
	}

	public boolean isGreen(){
		if(this.color.equals("green")){
			return true;
		}else{
			return false;
		}
	}

	//Do not modify this method implementation.
	public String toString() {
		// Determine the special characters to add
		// at the beginning of the String
		// to change the text color to the right color.
		String colorCode;
		if(color.equals("green")) {
			colorCode = "\u001B[32m";
		} else if(color.equals("yellow")) {
			colorCode = "\u001B[33m";
		} else {
			colorCode = "\u001B[31m";
		}
	
		// These are the special character to add
		// to the end of the String
		// to signify the end of the color change.
		String resetCode = "\u001B[0m";
	
		// Surround the letter with
		// space characters and with
		// the above color changing special characters.
		return String.format(
			"%s %s %s",
			colorCode, letter, resetCode);
		}
}

	
