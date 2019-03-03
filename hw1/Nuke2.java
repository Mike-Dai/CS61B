import java.io.*;
public class Nuke2 {
	public static void main(String[] arg) throws Exception {
		String str;
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		str = keyboard.readLine();
		str = str.substring(0,1) + str.substring(2);
		System.out.println(str);
	}
}
