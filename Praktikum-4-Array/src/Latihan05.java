import javax.swing.JOptionPane;
public class Latihan05 {

	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		String field [] = { "Nama Lengkap", "Alamat", "No Telp"} ;
		
		jop.showMessageDialog(null, field);
		
		jop.showConfirmDialog(null, "silakan lanjutkan" );
	}

}
