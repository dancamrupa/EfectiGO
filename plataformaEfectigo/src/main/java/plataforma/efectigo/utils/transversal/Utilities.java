package plataforma.efectigo.utils.transversal;

public final class Utilities {
    public static String getIndex(int cantidad, String plazo) {

        String index = null;
        String[] rango1 = {"1 meses,0", "3 meses,1", "6 meses,2", "9 meses,3", "12 meses,4", "18 meses,5", "24 meses,6", "30 meses,7", "36 meses,8"};
        String[] rango2 = {"3 meses,0", "6 meses,1", "9 meses,2", "12 meses,3", "18 meses,4", "24 meses,5", "30 meses,6", "36 meses,7"};
        String[] rango3 = {"6 meses,0", "9 meses,1", "12 meses,2", "18 meses,3", "24 meses,4", "30 meses,5", "36 meses,6"};
        String[] rango4 = {"9 meses,0", "12 meses,1", "18 meses,2", "24 meses,3", "30 meses,4", "36 meses,5"};
        String[] rango5 = {"12 meses,0", "18 meses,1", "24 meses,2", "30 meses,3", "36 meses,4"};

        if (cantidad == 5000) {
            for (int i = 0; i < rango1.length; i++) {
                if (rango1[i].contains(plazo)) {
                    index = rango1[i].substring(8).replace(",", "");
                    break;
                }
            }
        } else if (cantidad >= 5500 && cantidad <= 15500) {
            for (int i = 0; i < rango2.length; i++) {
                if (rango2[i].contains(plazo)) {
                    index = rango2[i].substring(8).replace(",", "");
                    break;
                }
            }
        } else if (cantidad >= 16000 && cantidad <= 30500) {
            for (int i = 0; i < rango3.length; i++) {
                if (rango3[i].contains(plazo)) {
                    index = rango3[i].substring(8).replace(",", "");
                    break;
                }
            }
        } else if (cantidad >= 31000 && cantidad <= 44500) {
            for (int i = 0; i < rango4.length; i++) {
                if (rango4[i].contains(plazo)) {
                    index = rango4[i].substring(8).replace(",", "");
                    break;
                }
            }
        } else {
            for (int i = 0; i < rango5.length; i++) {
                if (rango5[i].contains(plazo)) {
                    index = rango5[i].substring(8).replace(",", "");
                    break;
                }
            }
        }
        if((index == null)){
            System.out.println("No exite el plazo indicado para este monto");
        }
        return index;
    }
}
