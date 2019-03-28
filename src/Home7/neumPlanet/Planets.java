package Home7.neumPlanet;

public enum Planets {
    Merkuriy("Меркурий",3.285E23,2439.7,34.5345), Saturn("Сатурн",3.485E23,3.44434,44.5345),
    Upiter("Юпитер",3.3E23,3.44434,98.98345),Neptun("Нептун",31.485E23,3.47834,444.5345);

    private String name;
    private double mass,rad,oRad;

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getRad() {
        return rad;
    }

    public double getoRad() {
        return oRad;
    }
    Planets (String name, double mass, double rad, double oRad){
   this.name=name;
   this.mass=mass;
   this.rad=rad;
   this.oRad=oRad;

 }

    @Override
    public String toString() {
        return  name  +
                " масса " + mass +
                " радиус " + rad +
                " радиус орбиты " + oRad;
    }
}
