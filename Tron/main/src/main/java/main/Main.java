package main;
/**
 * <h1>The  Main Class</h1>
 * 
 * @author Roxane-Vonarb
 * @version 1.0
 */
import controller.GameControler;
import controller.IController;
import model.Grid;
import model.ITronModel;
import model.TronModel;
import view.Frame;
import view.IView;

public abstract class Main {
/**
 * @author KAMDEM
 * @param args
 */
    public static void main(final String[] args) {
    	// on charge le model
    	final ITronModel model = new TronModel();
    	//on set la grid
    	model.setGrid(new Grid());
    	//on charge la cue avec la model
    	final IView view = new Frame(model);	
    	//et on charge le controler
    	IController game = new GameControler(model, view);
    	//on lance le jeu
    	game.play();
    	
    }

}
