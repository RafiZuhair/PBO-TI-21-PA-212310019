import javax.swing.JOptionPane;

public class Latihan04	{

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String input = jop.showInputDialog(null, "Masukkan jumlah array");
		int parseInput= Integer.parseInt(input);
		int x[] = new int[parseInput];
		int max = 0, min = 0;
		
		
		
		for(int i = 0; i < x.length; i++) {
			String inputArray = jop.showInputDialog(null, "Masukkan input array ke - " + (i + 1), "Data ke - " + (i + 1) , jop.QUESTION_MESSAGE);
			int pArray = Integer.parseInt(inputArray);
			x[i] = pArray;
		}
		for (int i = 0; i < x.length; i++){
            if(x[i] > max){
                max = x[i];   
            } else{
                min = x[i];    
            }    
        }
		
		String output = "";

		
		for(int j = 0; j < x.length; j++) {
			output += "Array ke - " + (j + 1) + " = " + x[j] + "\n";
			
		}
		
		output += "x terbesar adalah " + max + "\n" + "x terkecil adalah " + min;
		
		
		jop.showMessageDialog(null, output, "Array", jop.INFORMATION_MESSAGE);
		
	}

}