package com.bridgelabz.oops_program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class z 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String Path = "/home/admin1/Desktop/Json/Jlist.json";
		File file = new File(Path);

		ObjectMapper mapper = new ObjectMapper();
		int num;

		try {
			JsonNode rootNode = mapper.readTree(file);
		//	 System.out.println(""+rootNode);
			do {
				System.out.println("Enter the Choice");
				System.out.println(" 1:Rice" + "\n 2:Pulses" + "\n 3:Wheat");
				num = sc.nextInt();
		} while (num > 0 || num < 4);

			String inventoryproduct = "";

			switch (num) {
			case 1:
				inventoryproduct = "Rice";
				break;
			case 2:
				inventoryproduct = "Pulses";
				break;
			case 3:
				inventoryproduct = "Wheat";
				break;
			default:
				System.out.println("Invalid Input");

			}

			JsonNode inventory = rootNode.path(inventoryproduct);	//reading the entered choice
			// System.out.println(""+inventory);
			for (JsonNode node : inventory) {
				// System.out.println(""+node);
				String name = node.path("name").asText();
				int price = node.path("price").asInt();
				int weight = node.path("weight").asInt();

				System.out.println("Name:" + name + "\nPrice: " + price + "\nWeight: " + weight);
				System.out.println("total: " + price * weight + " Rs" + "\n");
			}
		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}
	

	}
}
