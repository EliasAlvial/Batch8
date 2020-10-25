package com.syntax.GroupTask;

public class Task9 {
	public static void main(String[] args) {
		// 1. Create an array of countries: north america countries, south america
				// countries, europe countries, asian countries, african countries. Then print
				// all values from that array using 2 different loops and calculate how many
				// total countries been stored.

				int sum = 0;
				String[][] country = { { "Mex", "USA", "Can" }, { "Ecu", "Arg", "Bol", "Chile" },
						{ "Neth", "Ire", "Germ", "Italy" }, { "Gha", "Nig", "Cam", "Eritrea" },
						{ "Jap", "S.Kor", "Phill", "Afgh" } };
				for (int i = 0; i < country.length; i++) {
					for (int j = 0; j < country[i].length; j++) {
						System.out.print(country[i][j] + "   ");
						sum = country.length * country[j].length - 1;
					}
					System.out.println();
				}
				System.out.println(sum);

	}
}
