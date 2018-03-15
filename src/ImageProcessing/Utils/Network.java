package ImageProcessing.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.Perceptron;

public final class Network {

	public static void train() throws IOException {

		// Fetch the input data
		BufferedReader in = new BufferedReader(new FileReader("numbers_data.txt"));

		// Read the data and write them on arrayList
		String line;
		ArrayList<String> data = new ArrayList<String>();
		while ((line = in.readLine()) != null) {
			data.add(line);
		}
		in.close();

		// Divide data to inputs and outputs as strings
		// First 256 chars are inputs (16x16 matrix)
		// Last 10 chars are outputs 

		ArrayList<String> inputs_str = new ArrayList<String>();
		ArrayList<String> outputs_str = new ArrayList<String>();

		for (int i = 0; i < data.size(); i++) {
			data.set(i, data.get(i).replaceAll("\\s+", ""));
			inputs_str.add(data.get(i).substring(0, 256));
			outputs_str.add(data.get(i).substring(256));
		}

		// Create new perceptron network
		// 256 input neurons for the 16x16 image matrix
		// 1 output neuron for the labels
		NeuralNetwork<?> neuralNetwork = new Perceptron(256, 10);

		// Create training set
		DataSet trainingSet = new DataSet(256, 10);
		

		// Create input_array with size 256, and output_array for the inputs label
		// Fill them with 256 input values for each of the data row

		for (int i = 0; i < inputs_str.size(); i++) {
			double[] input_array = new double[256];
			double[] output_array = new double[10];

			int order = 0;
			while (order < 266) {
				input_array[order] = Double.parseDouble(inputs_str.get(i).substring(order, order + 1));
				if(order>=256){
					output_array[order]=Double.parseDouble(outputs_str.get(i).substring(order, order + 1));
				}
				order++;
			}

			// After array is filled, add it with its label to the training set
			trainingSet.addRow(new DataSetRow(input_array, output_array));

		}

		Date d=new Date();
		
		// Learn the training set
		System.out.println("Dataset is given.\nTraining in progress...."+d.toString());
		neuralNetwork.learn(trainingSet);

		// Save the trained network into file
		System.out.println("Network is saved and ready to test."+d.toString());
		neuralNetwork.save("NeuralNetwork_Perceptron.nnet_1");

	}

	public static void main(String[] args) throws IOException {

		//System.out.println("NETWORK MAIN----------------");
		//train();
	}

}
