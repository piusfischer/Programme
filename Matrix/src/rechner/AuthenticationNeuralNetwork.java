package rechner;

import java.util.ArrayList;

public class AuthenticationNeuralNetwork {

	private int inputLayer;
	private int[] hiddenLayer;
	private int outputLayer;
	private Matrix biases;
	private Matrix weights;
	private ArrayList<Matrix> biasesList = new ArrayList<>();
	private ArrayList<Matrix> weightsList = new ArrayList<>();
	
	public AuthenticationNeuralNetwork(int inputNeutrons, int[] hiddenLayer, int outputNeutrons) {
		this.inputLayer=inputNeutrons ;
		this.hiddenLayer=hiddenLayer;
		this.outputLayer=outputNeutrons;
		for(int i=0;i<=inputNeutrons; i++) {
			for(int e=0;e<=hiddenLayer.length;e++) {
				biases = new Matrix(hiddenLayer[e], 0);
				
			}
		}
		
		
		
	}
}
