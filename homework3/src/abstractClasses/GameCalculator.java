package abstractClasses;

public abstract class GameCalculator {
	 
	public abstract void calculate();
	// Base'i inherit eden class'lar bu methodu override etmek zorunda.
	// Bu methodun kodunu kendi class'ında yazmak zorunda. 
	 
	 public final void gameOver() {
		 System.out.println("Game Over!");
	 }
}

// Abstract class'ın içinde abstract method olması şart değil.