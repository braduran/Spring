package co.com.DependencyInjection;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public TextEditor() {}
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Constructor TextEditor donde se aplica DI");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		this.spellChecker.checkSpelling();
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Metodo setSpellChecker de TextEditor");
		this.spellChecker = spellChecker;
	}
}
