public class Tester {

	public static void main(String[] args) {
		String ciphertext = Cipher.getFileAsString("ciphertext3.txt");

		//String plaintext = Cipher.freqAnalysisCrackVigenere(ciphertext, 3);
		
		Cipher.freqAnalysisCrackVigenere(ciphertext, 3);
		
		//Cipher.writeStringToFile("ciphertext.txt", cipher);
		
		//System.out.println(plaintext);
	}
}