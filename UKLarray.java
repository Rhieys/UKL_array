import javax.swing.JOptionPane;

public class UKLarray {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Masukkan nama, kelas, atau NISN: ");
        String nama[][] = { { "Raze", "Chamber", "Neon", "Viper" },
                { "1234", "2345", "3456", "4567" },
                { "XR1", "XR2", "XR3", "XR4" } };

        int check = 0;
        for (int t = 0; t < 3; t++) {
            for (int j = 0; j <= 3; j++) {

                if (input.equalsIgnoreCase(nama[t][j])) {
                    JOptionPane.showMessageDialog(null,
                            "Nama = " + nama[0][j] + "\nNisn = " + nama[1][j] + "\nKelas = " + nama[2][j]);
                    check = 1;
                }
            }
        }
        if (check == 0) {
            JOptionPane.showMessageDialog(null, ("Mohon masukkan data dengan benar"));
        }
    }
}
