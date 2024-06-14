import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Socio> socios = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro de Socios");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("Bienvenido!");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        JLabel actionLabel = new JLabel("Qué quieres hacer?");
        actionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(actionLabel);

        String[] options = {
                "Registrar Socio",
                "Modificar Socio",
                "Crear Actividad",
                "Modificar Actividad",
                "Reservar Salones"
        };

        JComboBox<String> optionsComboBox = new JComboBox<>(options);
        optionsComboBox.setSelectedIndex(0);
        optionsComboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(optionsComboBox);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        JButton submitButton = new JButton("Ejecutar");
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(submitButton);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) optionsComboBox.getSelectedItem();
                switch (selectedOption) {
                    case "Registrar Socio":
                        registrarSocio(frame, textArea);
                        break;
                    // Agrega casos para las otras opciones según tu implementación
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void registrarSocio(JFrame parentFrame, JTextArea textArea) {
        JFrame frame = new JFrame("Registrar Socio");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameField = new JTextField();
        JLabel documentLabel = new JLabel("Documento:");
        JTextField documentField = new JTextField();
        JLabel addressLabel = new JLabel("Domicilio:");
        JTextField addressField = new JTextField();
        JLabel phoneLabel = new JLabel("Celular:");
        JTextField phoneField = new JTextField();
        JLabel emailLabel = new JLabel("Correo:");
        JTextField emailField = new JTextField();
        JLabel categoryLabel = new JLabel("Categoría:");
        JTextField categoryField = new JTextField();
        JLabel hearingLabel = new JLabel("Dificultad auditiva:");
        JTextField hearingField = new JTextField();
        JLabel signLanguageLabel = new JLabel("Uso de lenguaje de señas:");
        JTextField signLanguageField = new JTextField();
        JLabel subcommitteesLabel = new JLabel("Participa en subcomisiones:");
        JTextField subcommitteesField = new JTextField();

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(documentLabel);
        panel.add(documentField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(categoryLabel);
        panel.add(categoryField);
        panel.add(hearingLabel);
        panel.add(hearingField);
        panel.add(signLanguageLabel);
        panel.add(signLanguageField);
        panel.add(subcommitteesLabel);
        panel.add(subcommitteesField);

        JButton saveButton = new JButton("Guardar");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nameField.getText();
                int documento = Integer.parseInt(documentField.getText());
                String domicilio = addressField.getText();
                int celular = Integer.parseInt(phoneField.getText());
                String correo = emailField.getText();
                String categoria = categoryField.getText();
                String dificultadAuditiva = hearingField.getText();
                String lenguaje = signLanguageField.getText();
                String subcomisiones = subcommitteesField.getText();

                Socio nuevoSocio = new Socio(nombre, documento, domicilio, celular, correo, categoria,
                        dificultadAuditiva, lenguaje, subcomisiones);
                socios.add(nuevoSocio);

                textArea.append("Nuevo Socio Registrado:\n");
                textArea.append("Nombre: " + nombre + "\n");
                textArea.append("Documento: " + documento + "\n");
                textArea.append("Domicilio: " + domicilio + "\n");
                textArea.append("Celular: " + celular + "\n");
                textArea.append("Correo: " + correo + "\n");
                textArea.append("Categoría: " + categoria + "\n");
                textArea.append("Dificultad auditiva: " + dificultadAuditiva + "\n");
                textArea.append("Uso de lenguaje de señas: " + lenguaje + "\n");
                textArea.append("Participación en subcomisiones: " + subcomisiones + "\n");
                textArea.append("\n");

                frame.dispose(); // Cierra la ventana de registro después de guardar
            }
        });

        panel.add(saveButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
