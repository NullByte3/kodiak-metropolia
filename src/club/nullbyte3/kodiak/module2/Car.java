package club.nullbyte3.kodiak.module2;
public class Car {
    private double speed;
    private double gasolineLevel;
    private final String typeName;
    private final double tankCapacity;
    private final double topSpeed;
    private boolean cruiseControlOn;
    private double targetSpeed;
    private final double minCruiseSpeed = 30.0;
    private final double maxCruiseSpeed;

    public Car(String typeName) {
        this(typeName, 100.0, 120.0);
    }

    public Car(String typeName, double tankCapacity, double topSpeed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
        this.maxCruiseSpeed = topSpeed;
        this.speed = 0;
        this.gasolineLevel = 0;
        this.cruiseControlOn = false;
        this.targetSpeed = 0;
    }

    public void accelerate() {
        if (cruiseControlOn) {
            maintainCruiseSpeed();
        } else {
            normalAcceleration();
        }
    }

    private void normalAcceleration() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel -= 0.5;
            if (speed > topSpeed) speed = topSpeed;
        } else {
            speed = 0;
        }
    }

    public void decelerate(int amount) {
        if (cruiseControlOn) {
            maintainCruiseSpeed();
        } else {
            normalDeceleration(amount);
        }
    }

    private void normalDeceleration(int amount) {
        if (gasolineLevel > 0) {
            speed = Math.max(0, speed - amount);
            gasolineLevel -= 0.2;
        } else {
            speed = 0;
        }
    }

    public boolean setCruiseControlTarget(double speed) {
        if (speed >= minCruiseSpeed && speed <= maxCruiseSpeed) {
            this.targetSpeed = speed;
            return true;
        }
        return false;
    }

    public boolean turnCruiseControlOn() {
        if (targetSpeed == 0) return false;
        if (gasolineLevel <= 0) return false;

        cruiseControlOn = true;
        while (Math.abs(speed - targetSpeed) > 1.0) {
            if (speed < targetSpeed) {
                normalAcceleration();
            } else {
                normalDeceleration(10);
            }
            if (gasolineLevel <= 0) {
                cruiseControlOn = false;
                return false;
            }
        }
        speed = targetSpeed;
        return true;
    }

    public void turnCruiseControlOff() {
        cruiseControlOn = false;
    }

    private void maintainCruiseSpeed() {
        if (speed < targetSpeed - 1) {
            normalAcceleration();
        } else if (speed > targetSpeed + 1) {
            normalDeceleration(10);
        }
    }

    public double getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = tankCapacity;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    public double getCruiseControlTarget() {
        return targetSpeed;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public double getMinCruiseSpeed() {
        return minCruiseSpeed;
    }

    public double getMaxCruiseSpeed() {
        return maxCruiseSpeed;
    }
}
