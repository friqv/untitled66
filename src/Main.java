class Vehiculo {
    void acelerar() {
        System.out.println("El vehículo está acelerando.");
    }
    void frenar() {
        System.out.println("El vehículo está frenando.");
    }
}

class Carro extends Vehiculo {
    @Override
    void acelerar() {
        System.out.println("El carro está acelerando.");
    }
    @Override
    void frenar() {
        System.out.println("El carro está frenando.");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    void acelerar() {
        System.out.println("La bicicleta está acelerando.");
    }
    @Override
    void frenar() {
        System.out.println("La bicicleta está frenando.");
    }
}

class CreacionVehiculo {
    public Vehiculo crearVehiculo(String tipo) {
        if (tipo.equalsIgnoreCase("Carro")) {
            return new Carro();
        } else if (tipo.equalsIgnoreCase("Bicicleta")) {
            return new Bicicleta();
        } else {
            throw new IllegalArgumentException("Tipo de vehículo no válido");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CreacionVehiculo factoria = new CreacionVehiculo();

        Vehiculo vehiculo1 = factoria.crearVehiculo("Carro");
        vehiculo1.acelerar();

        Vehiculo vehiculo2 = factoria.crearVehiculo("Bicicleta");
        vehiculo2.frenar();
    }
}
