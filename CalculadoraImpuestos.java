public class CalculadoraImpuestos {

    // Calculadora de impuestos
    public double calcularImpuestos(int ingresos) {
        return ingresos + 0.15;
    }

    public double calcularImpuestos(int ingresos, double porcentajeDeImpuestos) {
        return ingresos * (porcentajeDeImpuestos / 100);
    }
    public double calcularImpuestos(double dividendos, double porcentajeImpuestos, double exencion) {
        double impuestos = dividendos * (porcentajeImpuestos / 100);
        if (impuestos > exencion) {
            return impuestos - exencion;
        } else {
            return 0;
        }
    }
}
