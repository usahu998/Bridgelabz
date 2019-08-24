package com.bridgelabz.oops_program;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class Pro1_JsonInventoryDataManagement
{public interface InventoryManagement 
	{

	public void addInventory(String name, long weight, long price);

	public void removeInventory(String name);

	public void calculateInventory();

	

	public void writeJson();
}

	
	

	

}
