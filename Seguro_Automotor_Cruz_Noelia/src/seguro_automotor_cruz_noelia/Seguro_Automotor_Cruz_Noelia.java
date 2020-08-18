package seguro_automotor_cruz_noelia;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Seguro_Automotor_Cruz_Noelia {

    public static void main(String[] args) {

        ImageIcon auto = new ImageIcon("src/Imagen/auto.jpg");
        JOptionPane.showMessageDialog(null, "SEGUROS CFP 36", "Seguro_Automotor",
                JOptionPane.INFORMATION_MESSAGE, auto);
        
       
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");

        String apellido = JOptionPane.showInputDialog("Ingrese su Apellido");

        String telefono = JOptionPane.showInputDialog("Ingrese su numero de telefono");

        String email = JOptionPane.showInputDialog("Ingrese su EMAIL");

        int cuota = 0;
        String marcas[] = {"Citroen", "Fiat", "Volkswagen", "Peugeot", "Reanult", "toyota"};
        Object opcion = JOptionPane.showInputDialog(null, "Seleccione una marca",
                "Marcas", JOptionPane.QUESTION_MESSAGE, null, marcas, marcas[0]);
        //muestro la opcion
        JOptionPane.showMessageDialog(null, "La marca del automovil es: " + opcion);

        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del automovil");
        JOptionPane.showMessageDialog(null, "El modelo elegido es: " + modelo);
        String dominio = JOptionPane.showInputDialog("ingrese el dominio del Automovil");
        JOptionPane.showMessageDialog(null, "El dominio es: " + dominio);
        String antiguedad = "";
        int anios = JOptionPane.showOptionDialog(null, "Seleccione la Antiguedad del automovil",
                "Años", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null,
                new Object[]{"menor o igual a 5 de años", "+ de 5  y menor de 10 años",
                    "igual o mayor a 10 años y menor a 15 años",
                    "igual o mayor a 15 años y menor de 20 años",
                    "igual o mayor a 20 años"}, "- o igual a 5 años");

        switch (anios) {
            case 0:
                cuota = 500;
                antiguedad = "menos o igual a 5 años";
                break;
            case 1:
                cuota = 1000;
                antiguedad = "mas de 5 y menos de 10 años";
                break;
            case 2:
                cuota = 1500;
                antiguedad = "igual o mayor de 10 años y menor a 15 años";
                break;
            case 3:
                cuota = 2000;
                antiguedad = "igual o mayor a 15 años y menor de 20 años ";
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "No es posible Asegurarlo",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);

                break;

        }
        if (anios != 4) {
            //tipo de cobertura
            int RC = 1000, TC = 2000, TR = 3000;
            int cobertura = 0;

            String coberturas[] = {"Terceros Completos",
                "Todo Riesgo",
                "Responsabilidad Civil"};
            Object tipo = JOptionPane.showInputDialog(null, "Selecciona el tipo de cobertura",
                    "coberturas", JOptionPane.QUESTION_MESSAGE, null,
                    coberturas, coberturas[0]);
            if (tipo == coberturas[0]) {
                cobertura = TC;

            } else if (tipo == coberturas[1]) {
                cobertura = TR;
            } else if (tipo == coberturas[2]) {
                cobertura = RC;
            }

            JOptionPane.showMessageDialog(null, "Tipo de Cobertura: " + tipo + " de " + cobertura);

            int valorAdicional = 0, contador = 0, respuesta = 0;
            int consulta ;
            String adicionales[] = {"Granizo", "LLantas deportivas", "Asistencia Mecánica",
                "Localizador GPS"};
            Object respuestasCober[] = new Object[4];

            consulta = JOptionPane.showConfirmDialog(null, "Desea seleccionar cobertura adicional");
            if (consulta == JOptionPane.OK_OPTION) {

                for (int i = 0; i < respuestasCober.length; i++) {
                    if (respuesta == JOptionPane.OK_OPTION) {
                        Object adicional = JOptionPane.showInputDialog(null, "Seleccione el adicional",
                                "Adcionales", JOptionPane.QUESTION_MESSAGE, null, adicionales,
                                adicionales[0]);
                        respuesta = JOptionPane.showConfirmDialog(null, "Desea agregar otro adicional " + (4 - (contador + 1)) + " de 4");
                        respuestasCober[contador] = adicional;
                        contador++;
                    }

                }
                switch (contador) {
                    case 4:
                    case 3:
                        valorAdicional = 600;
                        break;
                    case 2:
                    case 1:
                        valorAdicional = 300;
                        break;
                }
            }
            JOptionPane.showMessageDialog(null, "Valor Adicional: " + valorAdicional);

            int valorCuota;
            valorCuota = cuota + cobertura + valorAdicional;
            System.out.println("======= SEGUROS CFP 36 ======================");
            System.out.println("El asegurado: " + nombre + " " + apellido);
            System.out.println("Telefono: " + telefono + " Email: " + email);
            System.out.println("Automovil: " + opcion + " dominio: " + dominio);
            System.out.println("Antiguedad del Automovil: " + antiguedad);

            System.out.println("Coberturas Adcionales: ");
            for (int i = 0; i < respuestasCober.length; i++) {
                if (respuestasCober[i] == null) {
                
                } else {
                    System.out.println(respuestasCober[i] + " ");

                }
            }
            System.out.println("Valor prima total: " + valorCuota);
            System.out.println("=============================================");
        }

    }
}
