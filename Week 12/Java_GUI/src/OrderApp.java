import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderApp extends JFrame {
    private JTextField nameField, addressField, phoneField;
    private JCheckBox steakCheckBox, spaghettiCheckBox, pizzaCheckBox;
    private JTextArea orderSummary;
    private JLabel totalLabel;
    private int totalPrice = 0;

    public OrderApp() {
        setTitle("Java GUI");   
        setSize(725, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Aplikasi Pemesanan Makanan", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel customerAndMenuPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        JPanel customerPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        customerPanel.setBorder(BorderFactory.createTitledBorder("Data Customer"));
        customerPanel.add(new JLabel("Nama:"));
        nameField = new JTextField(15);
        customerPanel.add(nameField);
        customerPanel.add(new JLabel("Alamat:"));
        addressField = new JTextField(15);
        customerPanel.add(addressField);
        customerPanel.add(new JLabel("No Telp:"));
        phoneField = new JTextField(15);
        customerPanel.add(phoneField);

        JPanel menuPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        menuPanel.setBorder(BorderFactory.createTitledBorder("Pilih Menu"));
        steakCheckBox = new JCheckBox("Wagyu Prime Cut Steak (5000000)");
        spaghettiCheckBox = new JCheckBox("Spaghetti Aglio e Olio dengan Sentuhan Truffle (4000000)");
        pizzaCheckBox = new JCheckBox("Pizza Margherita Edisi Il Tartufo Premium (8000000)");
        menuPanel.add(steakCheckBox);
        menuPanel.add(spaghettiCheckBox);
        menuPanel.add(pizzaCheckBox);

        customerAndMenuPanel.add(customerPanel);
        customerAndMenuPanel.add(menuPanel);

        JPanel totalPanel = new JPanel();
        totalPanel.add(new JLabel("TOTAL BAYAR"));
        totalLabel = new JLabel("Rp. 0");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 24));
        totalLabel.setOpaque(true);
        totalLabel.setBackground(Color.BLACK);
        totalLabel.setForeground(Color.YELLOW);
        totalLabel.setPreferredSize(new Dimension(170, 30));
        totalPanel.add(totalLabel);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton addButton = new JButton("TAMBAH");
        JButton resetButton = new JButton("RESET");
        buttonPanel.add(addButton);
        buttonPanel.add(resetButton);

        orderSummary = new JTextArea(10, 30);
        orderSummary.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(orderSummary);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Data Pembelian"));

        mainPanel.add(customerAndMenuPanel);
        mainPanel.add(totalPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(scrollPane);

        add(mainPanel, BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateOrder();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });
    }

    private void updateOrder() {
        if (nameField.getText().isEmpty() || addressField.getText().isEmpty() || phoneField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silakan isi data customer terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!steakCheckBox.isSelected() && !spaghettiCheckBox.isSelected() && !pizzaCheckBox.isSelected()) {
            JOptionPane.showMessageDialog(this, "Silakan pilih minimal satu menu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String name = nameField.getText();
        String address = addressField.getText();
        String phone = phoneField.getText();

        totalPrice = 0;
        StringBuilder orderText = new StringBuilder();
        orderText.append("Nama : ").append(name).append("\n")
                 .append("Alamat : ").append(address).append("\n")
                 .append("Telp : ").append(phone).append("\n")
                 .append("----------------------------------------\n")
                 .append("Pesanan :\n");

        if (steakCheckBox.isSelected()) {
            orderText.append("- Wagyu Prime Cut Steak (5000000)\n");
            totalPrice += 5000000;
        }
        if (spaghettiCheckBox.isSelected()) {
            orderText.append("- Spaghetti Aglio e Olio dengan Sentuhan Truffle (4000000)\n");
            totalPrice += 4000000;
        }
        if (pizzaCheckBox.isSelected()) {
            orderText.append("- Pizza Margherita Edisi Il Tartufo Premium (8000000)\n");
            totalPrice += 8000000;
        }

        totalLabel.setText("Rp. " + totalPrice);
        orderText.append("----------------------------------------\n")
                 .append("Total Bayar : Rp. ").append(totalPrice);
        orderSummary.setText(orderText.toString());
    }

    private void resetForm() {
        nameField.setText("");
        addressField.setText("");
        phoneField.setText("");
        steakCheckBox.setSelected(false);
        spaghettiCheckBox.setSelected(false);
        pizzaCheckBox.setSelected(false);
        totalLabel.setText("Rp. 0");
        orderSummary.setText("");
        totalPrice = 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            OrderApp app = new OrderApp();
            app.setVisible(true);
        });
    }
}