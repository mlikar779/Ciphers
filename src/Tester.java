public class Tester {

	public static void main(String[] args) {
		String ciphertext = Cipher.getFileAsString("ciphertext3.txt");

		String plaintext = Cipher.freqAnalysisCrackVigenereLength3(ciphertext);
		
		//Cipher.writeStringToFile("ciphertext.txt", cipher);
		
		System.out.println(plaintext);
	}
}