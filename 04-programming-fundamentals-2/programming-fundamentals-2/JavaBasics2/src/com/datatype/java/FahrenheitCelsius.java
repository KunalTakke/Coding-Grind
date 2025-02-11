package com.datatype.java;

public class FahrenheitCelsius {

	public static void main(String[] args) {

		System.out.println("Fahr" + " " + "Celsius");
		int f = 0;
		while (f <= 300) {
			int celsius = (int) ((5.0 / 9) * (f - 32)); // type cast double to integer
			System.out.println(f + "\t" + celsius);
			f += 20; // increment by 20
		}

	}

}
